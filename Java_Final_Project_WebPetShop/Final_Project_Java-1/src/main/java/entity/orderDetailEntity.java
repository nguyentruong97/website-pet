package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "order_details")
public class orderDetailEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrderDetails")
	private long idOrderDetails;
	
	 @ManyToOne 
	 @JoinColumn(name = "petId") // 
	 private petEntity pet;
	
	 
	 @ManyToOne 
	 @JoinColumn(name = "order_id") // 
	 private orderEntity order;
	 
	 @Column(name = "price")
	 private double price;
	 
	 @Column(name = "discount")
	 private double discount;
	 
	 @Column(name = "quantity")
	 private double quantity;

	public long getIdOrderDetails() {
		return idOrderDetails;
	}

	public void setIdOrderDetails(long idOrderDetails) {
		this.idOrderDetails = idOrderDetails;
	}

	public petEntity getPet() {
		return pet;
	}

	public void setPet(petEntity pet) {
		this.pet = pet;
	}

	public orderEntity getOrder() {
		return order;
	}

	public void setOrder(orderEntity order) {
		this.order = order;
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

	@Override
	public String toString() {
		return "orderDetailEntity [idOrderDetails=" + idOrderDetails + ", pet=" + pet + ", order=" + order + ", price="
				+ price + ", discount=" + discount + ", quantity=" + quantity + "]";
	}

	public orderDetailEntity(long idOrderDetails, petEntity pet, orderEntity order, double price, double discount,
			double quantity) {
		super();
		this.idOrderDetails = idOrderDetails;
		this.pet = pet;
		this.order = order;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}

	public orderDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 

}
