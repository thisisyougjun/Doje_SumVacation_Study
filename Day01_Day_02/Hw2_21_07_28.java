package Day01_Day_02;
public class Hw2_21_07_28 {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(2021, 7, 28);
		MyDate date2 = new MyDate(2021, 13, 1);
		MyDate date3 = new MyDate(2021, 2, 30);
		
		if( date1.isOK() ) {
			System.out.println("��¥ �˻� �Ϸ�");
		} else {
			System.out.println("��¥�� ������ �ֽ��ϴ�.");
		}

		if( date2.isOK() ) {
			System.out.println("��¥ �˻� �Ϸ�");
		} else {
			System.out.println("��¥�� ������ �ֽ��ϴ�.");
		}

		if( date3.isOK() ) {
			System.out.println("��¥ �˻� �Ϸ�");
		} else {
			System.out.println("��¥�� ������ �ֽ��ϴ�.");
		}
	}
}

class MyDate {
	private int year;
	private int month;
	private int day;
	public MyDate(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean isOK() {
		boolean result =false;
        //�˻� 1
        if(this.month >=1 && this.month<=12){
            result=true;
        }
        else{
            result = false;
        }
        //�˻� 2
        if(this.month ==2){
            if (this.day >= 1 && this.day <=28) {
                result =true;
            }else{
                result = false;
            }
        }
        return result;
       }
}