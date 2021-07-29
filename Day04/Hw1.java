package Day04;

public class Hw1 {
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
	int myCount = 0;
	// 이곳을 수정하세요
	int hpCount = 0;
	int gjCount = 0;
	
	public Service(char ptype) {
		this.type = ptype;
		if(this.type == 'h') {
			// 이곳의 코드를 완성하세요
			
		} else if(this.type == 'g') {
			// 이곳의 코드를 완성하세요
			
		}
	}
}



