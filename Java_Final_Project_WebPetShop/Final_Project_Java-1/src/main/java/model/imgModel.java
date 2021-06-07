package model;

import org.springframework.web.multipart.MultipartFile;

import entity.petEntity;

public class imgModel {
	private int idImage;
	private petEntity pet;
	private String name;
	private int quantity;
	private MultipartFile image;
	private int status;
	
	public imgModel() {
		super();
	}

	public imgModel(int idImage, petEntity pet, String name, int quantity, MultipartFile image, int status) {
		super();
		this.idImage = idImage;
		this.pet = pet;
		this.name = name;
		this.quantity = quantity;
		this.image = image;
		this.status = status;
	}

	public int getIdImage() {
		return idImage;
	}

	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}

	public petEntity getPet() {
		return pet;
	}

	public void setPet(petEntity pet) {
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
