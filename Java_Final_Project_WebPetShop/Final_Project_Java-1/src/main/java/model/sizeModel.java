package model;


public class sizeModel{
	
	private Integer idSize; 

	private String name;

	private int status;
	
	public sizeModel() {
		super();
	}

	public sizeModel(Integer idSize, String name, int status) {
		super();
		this.idSize = idSize;
		this.name = name;
		this.status = status;
	}

	public Integer getidSize() {
		return idSize;
	}

	public void setidSize(Integer idSize) {
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
	
	
	
}
