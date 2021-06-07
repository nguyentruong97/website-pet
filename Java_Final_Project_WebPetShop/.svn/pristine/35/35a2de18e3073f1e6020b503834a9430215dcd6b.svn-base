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


@Entity
@Table(name = "transaction")
public class transactionEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTransaction")
	private int idTransaction;
	
	 @ManyToOne 
	 @JoinColumn(name = "orderId") // 
	 private orderEntity orderId;
	 
	 @ManyToOne 
	 @JoinColumn(name = "userId") // 
	 private userEntity userId;
	 
	 @Column(name = "code")
	 @Type(type="org.hibernate.type.StringNVarcharType")
	 private String code;
	 
	 @Column(name = "type")
	 private int type;
	 
	 @Column(name = "mode")
	 private int mode;
	 
	 @Column(name = "createdAt")
	 private Date createdAt;
	 
	 @Column(name = "updatedAt")
	 private Date updatedAt;
	 
	 @Column(name = "status")
	 private int status;

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public orderEntity getOrderId() {
		return orderId;
	}

	public void setOrderId(orderEntity orderId) {
		this.orderId = orderId;
	}

	public userEntity getUserId() {
		return userId;
	}

	public void setUserId(userEntity userId) {
		this.userId = userId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "transactionEntity [idTransaction=" + idTransaction + ", orderId=" + orderId + ", userId=" + userId
				+ ", code=" + code + ", type=" + type + ", mode=" + mode + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", status=" + status + "]";
	}

	public transactionEntity(int idTransaction, orderEntity orderId, userEntity userId, String code, int type, int mode,
			Date createdAt, Date updatedAt, int status) {
		super();
		this.idTransaction = idTransaction;
		this.orderId = orderId;
		this.userId = userId;
		this.code = code;
		this.type = type;
		this.mode = mode;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	public transactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
