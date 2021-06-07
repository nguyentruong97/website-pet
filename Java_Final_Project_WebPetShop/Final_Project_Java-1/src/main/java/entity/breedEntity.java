package entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "breed")
public class breedEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idBreed")
	private int idBreed;
	
	@Column(name = "name")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String name;
	
	@Column(name = "country")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String country;
	
	@Column(name = "status")
	private int status;
	
	@OneToMany(mappedBy = "breedId", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<petEntity> petEntity;

	public int getIdBreed() {
		return idBreed;
	}

	public void setIdBreed(int idBreed) {
		this.idBreed = idBreed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Collection<petEntity> getPetEntity() {
		return petEntity;
	}

	public void setPetEntity(Collection<petEntity> petEntity) {
		this.petEntity = petEntity;
	}

	@Override
	public String toString() {
		return "breedEntity [idBreed=" + idBreed + ", name=" + name + ", country=" + country + ", status=" + status
				+ ", petEntity=" + petEntity + "]";
	}

	public breedEntity(int idBreed, String name, String country, int status, Collection<entity.petEntity> petEntity) {
		super();
		this.idBreed = idBreed;
		this.name = name;
		this.country = country;
		this.status = status;
		this.petEntity = petEntity;
	}

	public breedEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
