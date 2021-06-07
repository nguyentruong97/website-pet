package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "userTb")
public class userEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column(name = "idUser")
	private Integer idUser;
	
	@Column(name = "firstName")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String	firstName;

	@Column(name = "middleName")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String middleName;
	
	@Column(name = "lastName")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String lastName;
	
	@Column(name = "mobile")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String mobile;
	
	@Column(name = "email")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String email;
	
	@Column(name = "address")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String address;
	
	@Column(name = "ward")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String ward;
	
	@Column(name = "district")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String district;
	
	@Column(name = "province")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String province;
	
	@Column(name = "user_name")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String userName;
	
	@Column(name = "pass_word")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String password;
	
	@Column(name = "admin")
	private Integer admin;
	
	@Column(name = "registeredAt")
	private Date registeredAt;
	
	@Column(name = "lastLoginAt")
	private Date lastLoginAt;
	
	@Column(name = "status")
	private Integer status;
	
	@OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<cartEntity> cartEntity;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<orderEntity> orderEntity;	
   
    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<transactionEntity> transactionEntity;
    
    
    @OneToMany(mappedBy = "idUser", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<petEntity> petEntity;


	public Integer getIdUser() {
		return idUser;
	}


	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getWard() {
		return ward;
	}


	public void setWard(String ward) {
		this.ward = ward;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getAdmin() {
		return admin;
	}


	public void setAdmin(Integer admin) {
		this.admin = admin;
	}


	public Date getRegisteredAt() {
		return registeredAt;
	}


	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}


	public Date getLastLoginAt() {
		return lastLoginAt;
	}


	public void setLastLoginAt(Date lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Collection<cartEntity> getCartEntity() {
		return cartEntity;
	}


	public void setCartEntity(Collection<cartEntity> cartEntity) {
		this.cartEntity = cartEntity;
	}


	public Collection<orderEntity> getOrderEntity() {
		return orderEntity;
	}


	public void setOrderEntity(Collection<orderEntity> orderEntity) {
		this.orderEntity = orderEntity;
	}


	public Collection<transactionEntity> getTransactionEntity() {
		return transactionEntity;
	}


	public void setTransactionEntity(Collection<transactionEntity> transactionEntity) {
		this.transactionEntity = transactionEntity;
	}


	public Collection<petEntity> getPetEntity() {
		return petEntity;
	}


	public void setPetEntity(Collection<petEntity> petEntity) {
		this.petEntity = petEntity;
	}


	@Override
	public String toString() {
		return "userEntity [idUser=" + idUser + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", mobile=" + mobile + ", email=" + email + ", address=" + address
				+ ", ward=" + ward + ", district=" + district + ", province=" + province + ", userName=" + userName
				+ ", password=" + password + ", admin=" + admin + ", registeredAt=" + registeredAt + ", lastLoginAt="
				+ lastLoginAt + ", status=" + status + ", cartEntity=" + cartEntity + ", orderEntity=" + orderEntity
				+ ", transactionEntity=" + transactionEntity + ", petEntity=" + petEntity + "]";
	}


	public userEntity(Integer idUser, String firstName, String middleName, String lastName, String mobile, String email,
			String address, String ward, String district, String province, String userName, String password, Integer admin,
			Date registeredAt, Date lastLoginAt, Integer status, Collection<entity.cartEntity> cartEntity,
			Collection<entity.orderEntity> orderEntity, Collection<entity.transactionEntity> transactionEntity,
			Collection<entity.petEntity> petEntity) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.ward = ward;
		this.district = district;
		this.province = province;
		this.userName = userName;
		this.password = password;
		this.admin = admin;
		this.registeredAt = registeredAt;
		this.lastLoginAt = lastLoginAt;
		this.status = status;
		this.cartEntity = cartEntity;
		this.orderEntity = orderEntity;
		this.transactionEntity = transactionEntity;
		this.petEntity = petEntity;
	}


	public userEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
	
	

}
