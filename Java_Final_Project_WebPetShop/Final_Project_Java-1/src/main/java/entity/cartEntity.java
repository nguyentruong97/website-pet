package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "cart")
public class cartEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idCart")
	private int idCart;
	
	@ManyToOne
    @JoinColumn(name="userId")
    private userEntity userEntity;
	
	@Column(name = "sessionId")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String sessionId;
	
	@Column(name = "token")
	@Type(type="org.hibernate.type.StringNVarcharType")
	private String token;
	
	@Column(name = "createAt")
	private Date createAt;
	
	@Column(name = "updateAt")
	private Date updateAt;
	
	@Column(name = "status")
	private int status;
	
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
    private Collection<cartDetailEntity> cartDetailEntity;

	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	public userEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(userEntity userEntity) {
		this.userEntity = userEntity;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Collection<cartDetailEntity> getCartDetailEntity() {
		return cartDetailEntity;
	}

	public void setCartDetailEntity(Collection<cartDetailEntity> cartDetailEntity) {
		this.cartDetailEntity = cartDetailEntity;
	}

	@Override
	public String toString() {
		return "cartEntity [idCart=" + idCart + ", userEntity=" + userEntity + ", sessionId=" + sessionId + ", token="
				+ token + ", createAt=" + createAt + ", updateAt=" + updateAt + ", status=" + status
				+ ", cartDetailEntity=" + cartDetailEntity + "]";
	}

	public cartEntity(int idCart, entity.userEntity userEntity, String sessionId, String token, Date createAt,
			Date updateAt, int status, Collection<entity.cartDetailEntity> cartDetailEntity) {
		super();
		this.idCart = idCart;
		this.userEntity = userEntity;
		this.sessionId = sessionId;
		this.token = token;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.status = status;
		this.cartDetailEntity = cartDetailEntity;
	}

	public cartEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	

}
