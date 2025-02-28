package product;
import java.util.ArrayList;
import java.util.Scanner;
import other.Other;

public class FmDetails {
	Scanner scn = new Scanner(System.in);
	Other ot = new Other();
	
	public void setInfo(Factor f) { //제품 등록
		System.out.print("이름 : ");
		f.setName(scn.next());
		System.out.print("가격 : ");
		f.setPrice(ot.input());
		System.out.print("수량 : ");
		f.setQntty(ot.input());
	}
	public void autoSetNumber(ArrayList<Factor> fr, Factor f) { //번호 자동 부여
		f.setNumber(fr.indexOf(f));
	}
	public void print() { //안내문 출력
		System.out.println("1.등록 / 2.검색 / 3.가격 변경");
		System.out.println("4.삭제 / 5.출력 / 6.입고 및 출고");
	}
	public void print(Factor f) {  //제품번호, 이름, 가격, 수량 출력
		System.out.println("이름 : " + f.getName());
		System.out.println("제품번호 : " + f.getNumber());
		System.out.println("가격 : " + f.getPrice());
		System.out.println("수량 : " + f.getQntty());
	}
	public void print(ArrayList<Factor> fr, int idx) {	//인덱스를 입력받아서 해당되는 제품 정보 출력
		print(fr.get(idx));
	}
	public void print(ArrayList<Factor> fr) { // 리스트를 입력받아서 등록된 모든 제품 정보 출력
		for (int i = 0; i < fr.size(); i++) {
			print(fr.get(i));
		}
	}
	public void search(int n) { // 제품 번호를 입력받아서 해당 인덱스 반환
		
	}
	public void search(String str) { // 제품 이름을 입력받아서 해당 인덱스 반환
		
	}
	
	
	
	
	
}
