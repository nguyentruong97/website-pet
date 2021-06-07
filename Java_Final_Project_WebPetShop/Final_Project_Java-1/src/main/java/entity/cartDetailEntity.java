package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cart_details")
public class cartDetailEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idCartDetails")
	private int idCartDetails;
	
	@ManyToOne
    @JoinColumn(name="cartId")
    private cartEntity cart;
	
	
	@ManyToOne
    @JoinColumn(name="petId")
    private petEntity petId;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "quantity")
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

	public cartDetailEntity(int idCartDetails, cartEntity cart, petEntity petId, double price, int quantity) {
		super();
		this.idCartDetails = idCartDetails;
		this.cart = cart;
		this.petId = petId;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "cartDetailEntity [idCartDetails=" + idCartDetails + ", cart=" + cart + ", petId=" + petId + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

	public cartDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
