package Day5_2;

import java.time.Year;
import java.util.ArrayList;

public class Day5_2 {
	public static void main(String[] args) {
		int[] olyYear = new int[] {2000, 2004, 2008, 2012, 2016, 2021, 2024};
		String[] olyCountry = new String[] {
			"호주 시드니", "그리스 아테네", "중국 베이징", 
			"영국 런던", "브라질 리우", "일본 도쿄","프랑스 파리"
		};
		ArrayList<Olympics> olyCountryList=new ArrayList<>();
		// ArrayList 를 생성하세요

		for(int i=0; i<1; i++) {
			olyCountryList.add(new Olympics(2000,"호주 시드니"));
			olyCountryList.add(new Olympics(2004,"그리스 아테네"));
			olyCountryList.add(new Olympics(2008,"중국 베이징"));
			olyCountryList.add(new Olympics(2012,"영국 런던"));
			olyCountryList.add(new Olympics(2016,"브라질 리우"));
			olyCountryList.add(new Olympics(2021,"일본 도쿄"));
			olyCountryList.add(new Olympics(2024,"프랑스 파리"));// 배열의 값을 활용해서 olyYear, olyCountry 값으로 객체 생성후
		
			
		}
		// 출력하는 부분을 완성하세요
		for(Olympics r : olyCountryList) {
			System.out.println(r.year+","+r.country);
		}
	}
}

class Olympics {
	int year;
	String country;
	public Olympics(int year, String country){
		super();
		this.year=year;
		this.country=country;
	}
	
}

