package other;

import java.util.ArrayList;
import java.util.Scanner;

import product.Factor;

public class Other {
	Scanner scn = new Scanner(System.in);
	
	public int input() { //정수값 입력, 다른값이면 0으로 반환
		int n = 0;
		try {
			n = scn.nextInt();
			return n;
		} catch (Exception e) {
			scn.nextLine();
			return n;
		}
	}	
	public int searchBlank(ArrayList<Factor> fr) { //비어있는 객체 인덱스 반환. 없으면 -1 반환
		int idx = -1;
		for (int i = 0; i < fr.size(); i++) {
			if (fr.get(i).getName() != null) {
				idx = i;
			}
		}
		return idx;
	}
	
}
