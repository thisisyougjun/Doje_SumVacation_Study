/*
 *  �ڵ� �ۼ��� 
 *  �̸� : �̿��� (�̸��� �Է��ϼ���) 
 *              2�г�   ��:14 ( ���� �Է��ϼ��� )    ��ȣ :1 ( ��ȣ�� �Է��ϼ���  )
 *  ��¥ : 2021. 7. 28. ������
 *  ���� : [�ϰ����] �ڹٷ� ���� �˰��� (�ڿ��� ������)
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

	// ������ �Լ��� �߰��ϼ���
	public MyDate(int year, int month, int day){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	// print �Լ��� ���弼��
	public  void print(){
		System.out.println(
			"������" +this.year+"��" +this.month +"��" +this.day +"���Դϴ�."
		);
	}
}