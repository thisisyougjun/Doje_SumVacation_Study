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
	int  myCount = 0; //���� ����
	static int Count1 =0; //�ڵ��� ��ȣǥ ī��Ʈ
	static int Count2 =0;//������ǰ ��ȣǥ ī��Ʈ
	
	int hpCount = 0; //�ڵ��� ��ȣǥ
	int gjCount = 0; //������ǰ ��ȣǥ
	
	public Service(char ptype) {
		this.type = ptype;
		if(this.type == 'h') {
			Count1=Count1+1;
			hpCount=Count1;
			myCount=hpCount-1;
			System.out.println("�ڵ��� AS ��ȣǥ" +"["+hpCount+"]"+": ����ڴ� " +myCount+ "�� �Դϴ�.");
			
		} else if(this.type == 'g') {
			Count2=Count2+1;
			gjCount=Count2;
			myCount=gjCount-1;
			System.out.println("���� AS ��ȣǥ"+"["+gjCount +"]"+": ����ڴ� " + myCount+ "�� �Դϴ�.");
			
		}
	}
}
