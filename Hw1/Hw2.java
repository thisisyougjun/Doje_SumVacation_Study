package Hw1;

public class Hw2 {
	public static void main(String[] args) {
		Service customer1 = new Service('h');
		Service customer2 = new Service('h');
		Service customer3 = new Service('h');
		Service customer4 = new Service('g');
		Service customer5 = new Service('g');
		Service customer6 = new Service('h');
		Service customer7 = new Service('g');
	
	}
	
}

class Service {
	char type;
	int  myCount = 0; //남은 순서
	static int Count1 =0; //핸드폰 번호표 카운트
	static int Count2 =0;//가전제품 번호표 카운트
	
	int hpCount = 0; //핸드폰 번호표
	int gjCount = 0; //가전제품 번호표
	
	public Service(char ptype) {
		this.type = ptype;
		if(this.type == 'h') {
			Count1=Count1+1;
			hpCount=Count1;
			myCount=hpCount-1;
			System.out.println("핸드폰 AS 번호표" +"["+hpCount+"]"+": 대기자는 " +myCount+ "명 입니다.");
			
		} else if(this.type == 'g') {
			Count2=Count2+1;
			gjCount=Count2;
			myCount=gjCount-1;
			System.out.println("가전 AS 번호표"+"["+gjCount +"]"+": 대기자는 " + myCount+ "명 입니다.");
			
		}
	}
}
