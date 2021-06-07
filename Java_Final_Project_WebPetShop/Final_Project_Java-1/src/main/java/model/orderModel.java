package model;

import java.util.Date;

import entity.userEntity;

public class orderModel {
	 private int idOrder;
	 private String	sessionId;
	 private String	token;
	 private float subTotal;
	 private float itemDiscount;
	 private float tax;
	 private float shipping;
	 private float total;
	 private String promo;
	 private float discount;
	 private float grandTotal;
	 private Date createdAt;
	 private Date updatedAt;
	 private Status status;
	 private Integer user;
	 
	public orderModel() {
		super();
	}

	public orderModel(int idOrder, String sessionId, String token, float subTotal, float itemDiscount, float tax,
			float shipping, float total, String promo, float discount, float grandTotal, Date createdAt, Date updatedAt,
			Status status) {
		super();
		this.idOrder = idOrder;
		this.sessionId = sessionId;
		this.token = token;
		this.subTotal = subTotal;
		this.itemDiscount = itemDiscount;
		this.tax = tax;
		this.shipping = shipping;
		this.total = total;
		this.promo = promo;
		this.discount = discount;
		this.grandTotal = grandTotal;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	public float getItemDiscount() {
		return itemDiscount;
	}

	public void setItemDiscount(float itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getShipping() {
		return shipping;
	}

	public void setShipping(float shipping) {
		this.shipping = shipping;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	 
	public Integer getUser() {
		return this.user;
	}

	public void setUser(Integer status) {
		this.user = status;
	}
	 
}
