package service;
import model.Contact;

public class ContactManage {
	private CmDetails cd = new CmDetails();
	
	public int firstP() {
		cd.printInfo();
		return cd.input();
	}
	
	public void registration(Contact[] cr) { //����� ���
		int idx = 0;
		idx = cd.blankIdx(cr);
		cd.nameCmpr(cr,idx);
	}
	
	public void search(Contact[] cr) {
		int idx = 0;
		idx = cd.findUser(cr);
		if (idx != -1) {
			cd.printInfo(cr[idx]);
		}
	}
	
	public void modified(Contact[] cr) {
		int idx = 0;
		idx = cd.findUser(cr);
		if(idx != -1) {
			cd.mdf(cr[idx]);
		}
	}
	
	public void delete(Contact[] cr) {
		int idx = 0;
		idx = cd.findUser(cr);
		if (idx != -1) {
			cr[idx].delContact(cr[idx]);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	public void printAll(Contact[] cr) {
		cd.printAll(cr);
	}
}