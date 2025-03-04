package service;
import model.Contact;
import java.util.Scanner;

public class CmDetails {
	private Scanner scn = new Scanner(System.in);
	
	public int input() {
		int n = 0;
		try {
			n = scn.nextInt();
			return n;
		} catch (Exception e) {
			scn.nextLine();
			return n;
		}
	}	
	
	public void printInfo() {
		System.out.println("1.��� / 2.�˻� / 3.����");
		System.out.println("4.���� / 5.��� / 6.����");
	}
	
	public void printInfo(Contact c) {
		System.out.println("�̸� : " + c.getName());
		System.out.println("��ȭ��ȣ : " + c.getNum());
		System.out.println("�ּ� : " + c.getAdd());
		System.out.println("==========================");
	}
	
	public void printAll(Contact[] cr) {
		for (int i = 0; i < cr.length; i++) {
			if (cr[i].getName() != null) {
				printInfo(cr[i]);
			}
		}
	}
	
	public int blankIdx(Contact[] cr) { //�ش� �迭�� ��������� ����ִ� �ε��� ���� ��ȯ
		int idx = 0;
		boolean flag = false;
		for (int i = 0; i < cr.length; i++) {
			if (cr[i].getName() == null) {
				idx = i;
				flag = true;
				break;
			}
		}
		if(flag != true) {
			idx = -1;
		}
		return idx;
	}
	
	public void nameCmpr(Contact[] cr,int idx) { //�ٷ� ���� blackIdx �޼��带 ���� ��ȯ���� idx�� ����� ���
		if (idx != -1) {
			rgst(cr[idx]);
			System.out.println("\n ��ϿϷ�Ǿ����ϴ�. \n");
			printInfo(cr[idx]);
		} else {
			System.out.println("���� �ڸ��� �����ϴ�. ������ �ʿ��մϴ�.");
		}
	}
	
	public int findUser(Contact[] cr) { //�̸� �˻� �� �ش�Ǵ� �̸��� �ε����� ��ȯ
		int index = -1;
		System.out.println("�̸��� �Է��ϼ��� > ");
		String n = scn.next();	
		for (int i = 0; i < cr.length; i++) {
			if(cr[i] != null && n.equals(cr[i].getName())) {
				index = i;
				System.out.println("����ڸ� ã�ҽ��ϴ�. \n");
			} 
		}
		if(index == -1) {
			System.out.println("����ڰ� �������� �ʽ��ϴ�. \n");
		}
		return index;
	}
	
	public void rgst(Contact c) { //���� ���� (nameCmpr�޼��忡�� ��� ���� ������� x)
		System.out.print("�̸� : ");
		c.setName(scn.next());
		System.out.print("��ȭ��ȣ : ");
		c.setNum(scn.next());
		System.out.print("�ּ� : ");
		c.setAdd(scn.next());
	}
	
	public void mdf(Contact c) {
		System.out.print("������ ������ �����ϼ���.\n1.�̸� 2.��ȣ 3.�ּ� : ");
		int n = 0;
		try {
			n = scn.nextInt();
		} catch (Exception e) {
			scn.nextLine();
		}
		String name = "";
		String num = "";
		String add = "";

		if (n == 1) {
			System.out.println("���� �̸� : " + c.getName());
			System.out.print("�ٲ� �̸��� �Է��ϼ��� : ");
			name = scn.next();
			c.setName(name);
		} else if (n == 2) {
			System.out.println("���� ��ȣ : " + c.getNum());
			System.out.print("�ٲ� ��ȣ�� �Է��ϼ��� : ");
			num = scn.next();
			c.setNum(num);
		} else if (n == 3) {
			System.out.println("���� �ּ� : " + c.getAdd());
			System.out.print("�ٲ� �ּҸ� �Է��ϼ��� : ");
			add = scn.next();
			c.setAdd(add);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.println();
	}
}