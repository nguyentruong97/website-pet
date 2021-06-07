package model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entity.cartEntity;
import entity.petEntity;

public class cartDetailModel {

	private int idCartDetails;
	
    private cartEntity cart;
	
    private petEntity petId;
	
	private double price;
	
	
	private int quantity;


	public int getIdCartDetails() {
		return idCartDetails;
	}


	public void setIdCartDetails(int idCartDetails) {
		this.idCartDetails = idCartDetails;
	}


	public cartEntity getCart() {
		return cart;
	}


	public void setCart(cartEntity cart) {
		this.cart = cart;
	}


	public petEntity getPetId() {
		return petId;
	}


	public void setPetId(petEntity petId) {
		this.petId = petId;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "cartDetailModel [idCartDetails=" + idCartDetails + ", cart=" + cart + ", petId=" + petId + ", price="
				+ price + ", quantity=" + quantity + "]";
	}


	public cartDetailModel(int idCartDetails, cartEntity cart, petEntity petId, double price, int quantity) {
		super();
		this.idCartDetails = idCartDetails;
		this.cart = cart;
		this.petId = petId;
		this.price = price;
		this.quantity = quantity;
	}


	public cartDetailModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
