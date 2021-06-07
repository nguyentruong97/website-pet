package model;

import java.util.Date;


public class userModel{
	
	private int idUser;
	
	private String	firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String mobile;
	
	private String email;
	
	private String address;
	
	private String ward;
	
	private String district;
	
	private String province;
	
	private String userName;
	
	private String password;
	
	private int admin;
	
	private Date registeredAt;
	
	private Date lastLoginAt;
	
	private int status;

	public userModel(int idUser, String firstName, String middleName, String lastName, String mobile, String email,
			String address, String ward, String district, String province, String userName, String password, int admin,
			Date registeredAt, Date lastLoginAt, int status) {
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
	}

	public userModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
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

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "userModel [idUser=" + idUser + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", mobile=" + mobile + ", email=" + email + ", address=" + address + ", ward=" + ward
				+ ", district=" + district + ", province=" + province + ", userName=" + userName + ", password="
				+ password + ", admin=" + admin + ", registeredAt=" + registeredAt + ", lastLoginAt=" + lastLoginAt
				+ ", status=" + status + "]";
	}
	
	
}
