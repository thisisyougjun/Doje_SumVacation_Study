package DAY03;

public class Subway {
   
   String lineNumber;
   int passengerCount =0;
   int money = 0;

    public Subway(String lineNumber){
        this.lineNumber = lineNumber;
    }

    public void take (int money){
        this.money +=money;
        passengerCount++;
    }
    public void showInfo(){
        System.out.println(
           "������ ���� ������"
           + this.money + "�� �Դϴ�."
        );
    }
}
