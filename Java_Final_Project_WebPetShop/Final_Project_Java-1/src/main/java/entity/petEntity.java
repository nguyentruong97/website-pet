package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "pet")
public class petEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPet")
	private int idPet;
	
	
	
	@Column(name = "name")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String	name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "weight")
	private float weight;
	
	@Column(name = "sex")
	private double sex;
	
	@Column(name = "birthDay")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date birthDay;
	
	@Column(name = "certifiedPedigree")
	private double certifiedPedigree;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "discount")
	private double discount;
	
	@Column(name = "createdAt")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date createdAt;
	
	@Column(name = "updatedAt")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date updatedAt;
	
	@Column(name = "publishedAt")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date publishedAt;
	
	@Column(name = "startsAt")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date startsAt;
	
	@Column(name = "endsAt")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date endsAt;
	
	@Column(name = "status")
	private int status;
	
	// Many to One Có nhiều pet ở 1 user khởi tạo
	
    @ManyToOne 
    @JoinColumn(name = "userId") // thông qua khóa ngoại user_id
    private userEntity idUser;
    
    @ManyToOne 
    @JoinColumn(name = "idBreed") // 
    private breedEntity breedId;
    
    @ManyToOne 
    @JoinColumn(name = "idSize") // 
    private sizeEntity sizeId;
    
    @ManyToOne 
    @JoinColumn(name = "idCoat") // 
    private coatTypeEntity coat_typeId;
    
    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<imgEntity> imgEntity;
    
    @OneToMany(mappedBy = "petId", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<cartDetailEntity> cartDetailEntity;
    
    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<orderDetailEntity> orderDetailEntity;
    
    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<vacxinPetEntity> vacxinDetail;

	public int getIdPet() {
		return idPet;
	}

	public void setIdPet(int idPet) {
		this.idPet = idPet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getSex() {
		return sex;
	}

	public void setSex(double sex) {
		this.sex = sex;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public double getCertifiedPedigree() {
		return certifiedPedigree;
	}

	public void setCertifiedPedigree(double certifiedPedigree) {
		this.certifiedPedigree = certifiedPedigree;
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

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public Date getStartsAt() {
		return startsAt;
	}

	public void setStartsAt(Date startsAt) {
		this.startsAt = startsAt;
	}

	public Date getEndsAt() {
		return endsAt;
	}

	public void setEndsAt(Date endsAt) {
		this.endsAt = endsAt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public userEntity getIdUser() {
		return idUser;
	}

	public void setIdUser(userEntity idUser) {
		this.idUser = idUser;
	}

	public breedEntity getBreedId() {
		return breedId;
	}

	public void setBreedId(breedEntity breedId) {
		this.breedId = breedId;
	}

	public sizeEntity getSizeId() {
		return sizeId;
	}

	public void setSizeId(sizeEntity sizeId) {
		this.sizeId = sizeId;
	}

	public coatTypeEntity getCoat_typeId() {
		return coat_typeId;
	}

	public void setCoat_typeId(coatTypeEntity coat_typeId) {
		this.coat_typeId = coat_typeId;
	}

	public Collection<imgEntity> getImgEntity() {
		return imgEntity;
	}

	public void setImgEntity(Collection<imgEntity> imgEntity) {
		this.imgEntity = imgEntity;
	}

	public Collection<cartDetailEntity> getCartDetailEntity() {
		return cartDetailEntity;
	}

	public void setCartDetailEntity(Collection<cartDetailEntity> cartDetailEntity) {
		this.cartDetailEntity = cartDetailEntity;
	}

	public Collection<orderDetailEntity> getOrderDetailEntity() {
		return orderDetailEntity;
	}

	public void setOrderDetailEntity(Collection<orderDetailEntity> orderDetailEntity) {
		this.orderDetailEntity = orderDetailEntity;
	}

	public Collection<vacxinPetEntity> getVacxinDetail() {
		return vacxinDetail;
	}

	public void setVacxinDetail(Collection<vacxinPetEntity> vacxinDetail) {
		this.vacxinDetail = vacxinDetail;
	}

	@Override
	public String toString() {
		return "petEntity [idPet=" + idPet + ", name=" + name + ", age=" + age + ", weight=" + weight + ", sex=" + sex
				+ ", birthDay=" + birthDay + ", certifiedPedigree=" + certifiedPedigree + ", price=" + price
				+ ", discount=" + discount + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", publishedAt="
				+ publishedAt + ", startsAt=" + startsAt + ", endsAt=" + endsAt + ", status=" + status + ", idUser="
				+ idUser + ", breedId=" + breedId + ", sizeId=" + sizeId + ", coat_typeId=" + coat_typeId
				+ ", imgEntity=" + imgEntity + ", cartDetailEntity=" + cartDetailEntity + ", orderDetailEntity="
				+ orderDetailEntity + ", vacxinDetail=" + vacxinDetail + "]";
	}

	public petEntity(int idPet, String name, int age, float weight, double sex, Date birthDay, double certifiedPedigree,
			double price, double discount, Date createdAt, Date updatedAt, Date publishedAt, Date startsAt, Date endsAt,
			int status, userEntity idUser, breedEntity breedId, sizeEntity sizeId, coatTypeEntity coat_typeId,
			Collection<entity.imgEntity> imgEntity, Collection<entity.cartDetailEntity> cartDetailEntity,
			Collection<entity.orderDetailEntity> orderDetailEntity, Collection<vacxinPetEntity> vacxinDetail) {
		super();
		this.idPet = idPet;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.birthDay = birthDay;
		this.certifiedPedigree = certifiedPedigree;
		this.price = price;
		this.discount = discount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
		this.status = status;
		this.idUser = idUser;
		this.breedId = breedId;
		this.sizeId = sizeId;
		this.coat_typeId = coat_typeId;
		this.imgEntity = imgEntity;
		this.cartDetailEntity = cartDetailEntity;
		this.orderDetailEntity = orderDetailEntity;
		this.vacxinDetail = vacxinDetail;
	}

	public petEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
