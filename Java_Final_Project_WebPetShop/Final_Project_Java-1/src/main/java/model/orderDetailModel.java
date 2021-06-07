package model;

import entity.orderEntity;
import entity.petEntity;

public class orderDetailModel {
	private long idOrderDetails;
	 private petEntity petId;
	 private orderEntity orderId;
	 private double price;
	 private double discount;
	 private double quantity;
	 
	public orderDetailModel() {
		super();
	}

	public orderDetailModel(long idOrderDetails, petEntity petId, orderEntity orderId, double price, double discount,
			double quantity) {
		super();
		this.idOrderDetails = idOrderDetails;
		this.petId = petId;
		this.orderId = orderId;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}

	public long getIdOrderDetails() {
		return idOrderDetails;
	}

	public void setIdOrderDetails(long idOrderDetails) {
		this.idOrderDetails = idOrderDetails;
	}

	public petEntity getPetId() {
		return petId;
	}

	public void setPetId(petEntity petId) {
		this.petId = petId;
	}

	public orderEntity getOrderId() {
		return orderId;
	}

	public void setOrderId(orderEntity orderId) {
		this.orderId = orderId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	 
	 
}
