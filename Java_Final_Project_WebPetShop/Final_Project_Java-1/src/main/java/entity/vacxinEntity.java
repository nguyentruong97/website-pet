package entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "vacxin")
public class vacxinEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVacxin")
	private int idVacxin;
	 
	  @OneToMany(mappedBy = "vacxin", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (petEntity) (1 size có nhiều con vật)
	    private Collection<vacxinPetEntity> vacxinDetail;

	    @Column(name = "name")
	    @Type(type="org.hibernate.type.StringNVarcharType")
		private String name;
	    
	    @Lob
	    @Column(name = "image", length = Integer.MAX_VALUE, nullable = true)
		private byte[] image;
	    
	    @Column(name = "status")
		private int status;

		public int getIdVacxin() {
			return idVacxin;
		}

		public void setIdVacxin(int idVacxin) {
			this.idVacxin = idVacxin;
		}

		public Collection<vacxinPetEntity> getVacxinDetail() {
			return vacxinDetail;
		}

		public void setVacxinDetail(Collection<vacxinPetEntity> vacxinDetail) {
			this.vacxinDetail = vacxinDetail;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public byte[] getImage() {
			return image;
		}

		public void setImage(byte[] image) {
			this.image = image;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "vacxinEntity [idVacxin=" + idVacxin + ", vacxinDetail=" + vacxinDetail + ", name=" + name
					+ ", image=" + Arrays.toString(image) + ", status=" + status + "]";
		}

		public vacxinEntity(int idVacxin, Collection<vacxinPetEntity> vacxinDetail, String name, byte[] image,
				int status) {
			super();
			this.idVacxin = idVacxin;
			this.vacxinDetail = vacxinDetail;
			this.name = name;
			this.image = image;
			this.status = status;
		}

		public vacxinEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
