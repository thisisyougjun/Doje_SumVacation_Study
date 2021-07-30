package Day5_2;

import java.time.Year;
import java.util.ArrayList;

public class Day5_2 {
	public static void main(String[] args) {
		int[] olyYear = new int[] {2000, 2004, 2008, 2012, 2016, 2021, 2024};
		String[] olyCountry = new String[] {
			"ȣ�� �õ��", "�׸��� ���׳�", "�߱� ����¡", 
			"���� ����", "����� ����", "�Ϻ� ����","������ �ĸ�"
		};
		ArrayList<Olympics> olyCountryList=new ArrayList<>();
		// ArrayList �� �����ϼ���

		for(int i=0; i<1; i++) {
			olyCountryList.add(new Olympics(2000,"ȣ�� �õ��"));
			olyCountryList.add(new Olympics(2004,"�׸��� ���׳�"));
			olyCountryList.add(new Olympics(2008,"�߱� ����¡"));
			olyCountryList.add(new Olympics(2012,"���� ����"));
			olyCountryList.add(new Olympics(2016,"����� ����"));
			olyCountryList.add(new Olympics(2021,"�Ϻ� ����"));
			olyCountryList.add(new Olympics(2024,"������ �ĸ�"));// �迭�� ���� Ȱ���ؼ� olyYear, olyCountry ������ ��ü ������
		
			
		}
		// ����ϴ� �κ��� �ϼ��ϼ���
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

