package model;

public class Contact {
	private String name;
	private String num;
	private String adress;
	
	public void setName(String str) {
		this.name = str;
	}
	public void setNum(String str) {
		this.num = str;
	}
	public void setAdd(String str) {
		this.adress = str;
	}
	public String getName() {
		return this.name;
	}
	public String getNum() {
		return this.num;
	}
	public String getAdd() {
		return this.adress;
	}
	public void delContact(Contact ctt) {
		this.setName(null);
		this.setNum(null);
		this.setAdd(null);
	}
}