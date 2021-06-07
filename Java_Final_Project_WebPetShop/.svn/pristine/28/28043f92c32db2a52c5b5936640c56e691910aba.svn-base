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
@Table(name = "coat_type")
public class coatTypeEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idCoat")
	private int idCoat;
	
	@Column(name = "name")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String name;
	
	@Column(name = "status")
	private int status;
	
	@OneToMany(mappedBy = "coat_typeId", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<petEntity> petEntity;

	public int getIdCoat() {
		return idCoat;
	}

	public void setIdCoat(int idCoat) {
		this.idCoat = idCoat;
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
		return "coatTypeEntity [idCoat=" + idCoat + ", name=" + name + ", status=" + status + ", petEntity=" + petEntity
				+ "]";
	}

	public coatTypeEntity(int idCoat, String name, int status, Collection<entity.petEntity> petEntity) {
		super();
		this.idCoat = idCoat;
		this.name = name;
		this.status = status;
		this.petEntity = petEntity;
	}

	public coatTypeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
