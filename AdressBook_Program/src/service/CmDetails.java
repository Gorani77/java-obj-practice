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
		System.out.println("1.등록 / 2.검색 / 3.수정");
		System.out.println("4.삭제 / 5.출력 / 6.종료");
	}
	
	public void printInfo(Contact c) {
		System.out.println("이름 : " + c.getName());
		System.out.println("전화번호 : " + c.getNum());
		System.out.println("주소 : " + c.getAdd());
		System.out.println("==========================");
	}
	
	public void printAll(Contact[] cr) {
		for (int i = 0; i < cr.length; i++) {
			if (cr[i].getName() != null) {
				printInfo(cr[i]);
			}
		}
	}
	
	public int blankIdx(Contact[] cr) { //해당 배열이 비어있으면 비어있는 인덱스 값을 반환
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
	
	public void nameCmpr(Contact[] cr,int idx) { //바로 위의 blackIdx 메서드를 통해 반환받은 idx로 사용자 등록
		if (idx != -1) {
			rgst(cr[idx]);
			System.out.println("\n 등록완료되었습니다. \n");
			printInfo(cr[idx]);
		} else {
			System.out.println("남은 자리가 없습니다. 삭제가 필요합니다.");
		}
	}
	
	public int findUser(Contact[] cr) { //이름 검색 후 해당되는 이름의 인덱스를 반환
		int index = -1;
		System.out.println("이름을 입력하세요 > ");
		String n = scn.next();	
		for (int i = 0; i < cr.length; i++) {
			if(cr[i] != null && n.equals(cr[i].getName())) {
				index = i;
				System.out.println("사용자를 찾았습니다. \n");
			} 
		}
		if(index == -1) {
			System.out.println("사용자가 존재하지 않습니다. \n");
		}
		return index;
	}
	
	public void rgst(Contact c) { //정보 세팅 (nameCmpr메서드에서 사용 직접 사용할일 x)
		System.out.print("이름 : ");
		c.setName(scn.next());
		System.out.print("전화번호 : ");
		c.setNum(scn.next());
		System.out.print("주소 : ");
		c.setAdd(scn.next());
	}
	
	public void mdf(Contact c) {
		System.out.print("수정할 내용을 선택하세요.\n1.이름 2.번호 3.주소 : ");
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
			System.out.println("현재 이름 : " + c.getName());
			System.out.print("바꿀 이름을 입력하세요 : ");
			name = scn.next();
			c.setName(name);
		} else if (n == 2) {
			System.out.println("현재 번호 : " + c.getNum());
			System.out.print("바꿀 번호를 입력하세요 : ");
			num = scn.next();
			c.setNum(num);
		} else if (n == 3) {
			System.out.println("현재 주소 : " + c.getAdd());
			System.out.print("바꿀 주소를 입력하세요 : ");
			add = scn.next();
			c.setAdd(add);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println();
	}
}