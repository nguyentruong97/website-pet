package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.imgEntity;
import services.imgServices;

@Controller
public class ImgUploadController {
	
	@RequestMapping(value = "getimage/{image}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ByteArrayResource> getImage(@PathVariable("image") String image){
		if (!image.equals("") || image !=null) {
			try {
				Path filename = Paths.get("upload", image);
				byte[] buffer = Files.readAllBytes(filename);
				ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
				return ResponseEntity.ok()
						.contentLength(buffer.length)
						.contentType(MediaType.parseMediaType("image/png"))
						.body(byteArrayResource);
			} catch (Exception e) {
				
			}
		}
		return ResponseEntity.badRequest().build();
	}
}
