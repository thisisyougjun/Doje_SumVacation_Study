/*
 *  코드 작성자 
 *  이름 : 이영준 (이름을 입력하세요) 
 *              2학년   반:14 ( 반을 입력하세요 )    번호 :1 ( 번호를 입력하세요  )
 *  날짜 : 2021. 7. 28. 수요일
 *  수업 : [하계방학] 자바로 배우는 알고리즘 (박원준 선생님)
 */

public class Hw_21_07_28 {
	public static void main(String[] args) {
		MyDate yesterday = new MyDate(2021, 7, 28);
		MyDate today = new MyDate(2021, 7, 27);
		yesterday.print();
		today.print();
	}
}

class MyDate {
	private int day;
	private int month;
	private int year;

	// 생성자 함수를 추가하세요
	public MyDate(int year, int month, int day){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	// print 함수를 만드세요
	public  void print(){
		System.out.println(
			"오늘은" +this.year+"년" +this.month +"월" +this.day +"일입니다."
		);
	}
}