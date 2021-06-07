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
@Table(name = "order")
public class orderEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrder")
	private Integer idOrder;
	
	 @OneToMany(mappedBy = "order", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
	 private Collection<orderDetailEntity> orderDetail;
	 
	 @Column(name = "sessionId")
	 @Type(type="org.hibernate.type.StringNVarcharType")
	 private String	sessionId;
	 
	 @Column(name = "token")
	 @Type(type="org.hibernate.type.StringNVarcharType")
	 private String	token;
	 
	 @Column(name = "subTotal")
	 private float subTotal;
	 
	 @Column(name = "itemDiscount")
	 private float itemDiscount;
	 
	 @Column(name = "tax")
	 private float tax;
	 
	 
	 @Column(name = "shipping")
	 private float shipping;
	 
	 
	 @Column(name = "total")
	 private float total;
	 
	 @Column(name = "promo")
	 @Type(type="org.hibernate.type.StringNVarcharType")
	 private String promo;
	 
	 @Column(name = "discount")
	 private float discount;
	 
	 @Column(name = "grandTotal")
	 private float grandTotal;
	 
	 @Column(name = "createdAt")
	 @DateTimeFormat(pattern = "dd/mm/yyyy")
	 private Date createdAt;
	 
	 @Column(name = "updatedAt")
	 @DateTimeFormat(pattern = "dd/mm/yyyy")
	 private Date updatedAt;
	 
	 @Column(name = "status")
	 private Integer status;
	 
	 @ManyToOne 
	 @JoinColumn(name = "userId") // 
	 private userEntity userId;
	 
	 @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
	 private Collection<transactionEntity> transaction;

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public Collection<orderDetailEntity> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Collection<orderDetailEntity> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	public float getItemDiscount() {
		return itemDiscount;
	}

	public void setItemDiscount(float itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getShipping() {
		return shipping;
	}

	public void setShipping(float shipping) {
		this.shipping = shipping;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public userEntity getUserId() {
		return userId;
	}

	public void setUserId(userEntity userId) {
		this.userId = userId;
	}

	public Collection<transactionEntity> getTransaction() {
		return transaction;
	}

	public void setTransaction(Collection<transactionEntity> transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "orderEntity [idOrder=" + idOrder + ", orderDetail=" + orderDetail + ", sessionId=" + sessionId
				+ ", token=" + token + ", subTotal=" + subTotal + ", itemDiscount=" + itemDiscount + ", tax=" + tax
				+ ", shipping=" + shipping + ", total=" + total + ", promo=" + promo + ", discount=" + discount
				+ ", grandTotal=" + grandTotal + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", status="
				+ status + ", userId=" + userId + ", transaction=" + transaction + "]";
	}

	public orderEntity(Integer idOrder, Collection<orderDetailEntity> orderDetail, String sessionId, String token,
			float subTotal, float itemDiscount, float tax, float shipping, float total, String promo, float discount,
			float grandTotal, Date createdAt, Date updatedAt, Integer status, userEntity userId,
			Collection<transactionEntity> transaction) {
		super();
		this.idOrder = idOrder;
		this.orderDetail = orderDetail;
		this.sessionId = sessionId;
		this.token = token;
		this.subTotal = subTotal;
		this.itemDiscount = itemDiscount;
		this.tax = tax;
		this.shipping = shipping;
		this.total = total;
		this.promo = promo;
		this.discount = discount;
		this.grandTotal = grandTotal;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.userId = userId;
		this.transaction = transaction;
	}

	public orderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
}
