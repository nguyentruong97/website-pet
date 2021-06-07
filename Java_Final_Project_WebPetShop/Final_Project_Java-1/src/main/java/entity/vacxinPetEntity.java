package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "vacxin_details")
public class vacxinPetEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVacxinDetails")
	private int idVacxinDetails;
	
	@ManyToOne 
	 @JoinColumn(name = "petId") // 
	 private petEntity pet;
	
	@ManyToOne 
	 @JoinColumn(name = "vacxinId") // 
	 private vacxinEntity vacxin;
	
	 @Column(name = "doctorName")
	 @Type(type="org.hibernate.type.StringNVarcharType")
	 private String doctorName;
	 
	 @Column(name = "mobile")
	 @Type(type="org.hibernate.type.StringNVarcharType")
	 private String mobile;
	 
	 @Column(name = "createdAt")
	 private Date createdAt;
	 
	 @Column(name = "quantity")
	 private int quantity;
	 
	 @Column(name = "drugDosage")
	 @Type(type="org.hibernate.type.StringNVarcharType")
	 private String drugDosage;

	public int getIdVacxinDetails() {
		return idVacxinDetails;
	}

	public void setIdVacxinDetails(int idVacxinDetails) {
		this.idVacxinDetails = idVacxinDetails;
	}

	public petEntity getPet() {
		return pet;
	}

	public void setPet(petEntity pet) {
		this.pet = pet;
	}

	public vacxinEntity getVacxin() {
		return vacxin;
	}

	public void setVacxin(vacxinEntity vacxin) {
		this.vacxin = vacxin;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDrugDosage() {
		return drugDosage;
	}

	public void setDrugDosage(String drugDosage) {
		this.drugDosage = drugDosage;
	}

	@Override
	public String toString() {
		return "vacxinEntity [idVacxinDetails=" + idVacxinDetails + ", pet=" + pet + ", vacxin=" + vacxin
				+ ", doctorName=" + doctorName + ", mobile=" + mobile + ", createdAt=" + createdAt + ", quantity="
				+ quantity + ", drugDosage=" + drugDosage + "]";
	}

	public vacxinPetEntity(int idVacxinDetails, petEntity pet, vacxinEntity vacxin, String doctorName, String mobile,
			Date createdAt, int quantity, String drugDosage) {
		super();
		this.idVacxinDetails = idVacxinDetails;
		this.pet = pet;
		this.vacxin = vacxin;
		this.doctorName = doctorName;
		this.mobile = mobile;
		this.createdAt = createdAt;
		this.quantity = quantity;
		this.drugDosage = drugDosage;
	}

	public vacxinPetEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
