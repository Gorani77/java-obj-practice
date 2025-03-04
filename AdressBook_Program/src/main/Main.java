package main;
import model.Contact;
import service.ContactManage;

public class Main {
	public static void main(String[] args) {
		Contact[] c = new Contact[10];
		ContactManage cm = new ContactManage();
		boolean power = true;	
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Contact();
		}
		
		while (power) {
			switch (cm.firstP()) {
				case 1:
					cm.registration(c);
					break;
				case 2:
					cm.search(c);
					break;
				case 3:
					cm.modified(c);
					break;
				case 4:
					cm.delete(c);
					break;
				case 5:
					cm.printAll(c);
					break;
				case 6: 
					power = false;
					break;
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
