package DAY03;

public class Bus {
   
int busNumber;
   int passengerCount = 0;
   int money = 0 ;
    public Bus(){
        this.busNumber = busNumber;
    }

    public void take (int money){
        this.money +=money;
        passengerCount++;
    }
    public void showInfo(){
        System.out.println(
           "����ö�� ���� ������"
           +this.money + "�� �Դϴ�"
        );
    }
}
