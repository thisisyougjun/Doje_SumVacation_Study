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
	// �̰��� �����ϼ���
	int hpCount = 0;
	int gjCount = 0;
	
	public Service(char ptype) {
		this.type = ptype;
		if(this.type == 'h') {
			// �̰��� �ڵ带 �ϼ��ϼ���
			
		} else if(this.type == 'g') {
			// �̰��� �ڵ带 �ϼ��ϼ���
			
		}
	}
}



