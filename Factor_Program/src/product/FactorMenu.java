package product;
import java.util.ArrayList;
import other.Other;

public class FactorMenu {
	FmDetails fd = new FmDetails();
	Other ot = new Other();
	
	public void registration(ArrayList<Factor> fr) { //사용자 등록
		int idx;
		fr.add(new Factor());       //새로운 객체 생성
		idx = ot.searchBlank(fr);	//비어있는 객체 탐색
		fd.setInfo(fr.get(idx));    //이름 가격 수량 설정
		fd.autoSetNumber(fr, fr.get(idx));
	}
	
	
	
}
