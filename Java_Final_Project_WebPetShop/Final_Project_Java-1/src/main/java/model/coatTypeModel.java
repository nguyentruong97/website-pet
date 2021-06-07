package model;



public class coatTypeModel {


	private int idCoat;
	
	private String name;
	
	private int status;

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

	@Override
	public String toString() {
		return "coatTypeModel [idCoat=" + idCoat + ", name=" + name + ", status=" + status + "]";
	}
	
	

}
