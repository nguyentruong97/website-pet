package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import entity.imgEntity;
import model.imgModel;
import services.imgServices;

@Controller
@RequestMapping("/photo")
public class ImgController {
	@Autowired
	imgServices services;

	@RequestMapping("/list")
	public String list(ModelMap map) {
		List<imgEntity> list = (List<imgEntity>) services.findAll();
		map.addAttribute("imgs", list);
		return "PhotoList";
	}

	@GetMapping("/")
	public String Add(ModelMap model) {
		imgModel img = new imgModel();
		model.addAttribute("IMG", img);
		return "PhotoAddEdit";
	}


	@PostMapping("/saveOrUpdate")
	public String save(ModelMap model, @ModelAttribute("IMG") imgModel img) {
		Optional<imgEntity> optImg = services.findById(img.getIdImage());
		imgEntity entity = null;
		String image = "logo.gif";
		Path path = Paths.get("upload/");
		if (optImg.isPresent()) {
			// save
			if (img.getImage().isEmpty()) {
				image = optImg.get().getImage();
			}else {
				try {
					InputStream inputStream = img.getImage().getInputStream();
					Files.copy(inputStream, path.resolve(img.getImage().getOriginalFilename()),
							StandardCopyOption.REPLACE_EXISTING);
					image = img.getImage().getOriginalFilename().toString();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				
		} else {
			// add new
			if (!img.getImage().isEmpty()) {
				try {
					InputStream inputStream = img.getImage().getInputStream();
					Files.copy(inputStream, path.resolve(img.getImage().getOriginalFilename()),
							StandardCopyOption.REPLACE_EXISTING);
					image = img.getImage().getOriginalFilename().toString();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		entity = new imgEntity(img.getIdImage(), img.getName(), img.getQuantity(), image, img.getStatus(), null);
		services.save(entity);
		return "redirect:list";
	}

	@RequestMapping("/edit/{idImage}")
	public String edit(ModelMap model, @PathVariable(name = "idImage") int idImage) {
		Optional<imgEntity> opt = services.findById(idImage);
		imgModel img = null;
		if (opt.isPresent()) {
			imgEntity entity = opt.get();
			File file = new File("upload/" + entity.getImage());
			FileInputStream input;
			try {
				input = new FileInputStream(file);
				MultipartFile multiPhoto = new MockMultipartFile("file", file.getName(), "text/plain",
						IOUtils.toByteArray(input));
				img = new imgModel(entity.getIdImage(), entity.getPet(), entity.getName(), entity.getQuantity(), multiPhoto, entity.getStatus());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}

			model.addAttribute("IMG", img);
		} else {
			model.addAttribute("IMG", new imgModel());
		}
		return "PhotoAddEdit";
	}
	
	@RequestMapping("/delete/{idImage}")
	public String delete(ModelMap model, @PathVariable(name = "idImage") int idImage) {
		services.deleteById(idImage);
		model.addAttribute("imgs", services.findAll());
		return "PhotoList";
	}
}