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
@Table(name ="size")
public class sizeEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idSize")
	private int idSize;
	
	@Column(name = "name")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String name;
	
	@Column(name = "status")
	private int status;

	
	@OneToMany(mappedBy = "sizeId", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<petEntity> petEntity;


	public int getIdSize() {
		return idSize;
	}


	public void setIdSize(int idSize) {
		this.idSize = idSize;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		return "sizeEntity [idSize=" + idSize + ", name=" + name + ", status=" + status + ", petEntity=" + petEntity
				+ "]";
	}


	public sizeEntity(int idSize, String name, int status, Collection<entity.petEntity> petEntity) {
		super();
		this.idSize = idSize;
		this.name = name;
		this.status = status;
		this.petEntity = petEntity;
	}


	public sizeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
}
