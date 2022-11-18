package edu.profound;

public class Mobile {
	
	private String imeiNo;
	private String comName;
	private String modelName;
	
	public Mobile()
	{}

	public Mobile(String imeiNo, String comName, String modelName) {
		super();
		this.imeiNo = imeiNo;
		this.comName = comName;
		this.modelName = modelName;
	}

	public String getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	

}
