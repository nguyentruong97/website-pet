package entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "photograh")
public class imgEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column(name = "idImage")
	private int idImage;
	
	@ManyToOne
    @JoinColumn(name="petId")
    private petEntity pet;
	
	@Column(name = "name")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String name;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Lob
    @Column(name = "image", length = 500)
	private String image;
	
	@Column(name = "status")
	private int status;
	

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "imgEntity [idImage=" + idImage + ", name=" + name + ", quantity=" + quantity + ", image="
				+ image + ", status=" + status + ", pet=" + pet + "]";
	}

	public imgEntity(int idImage, String name, int quantity, String image, int status, petEntity pet) {
		super();
		this.idImage = idImage;
		this.name = name;
		this.quantity = quantity;
		this.image = image;
		this.status = status;
		this.pet = pet;
	}

	public imgEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
