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
           "지하철의 누적 수익은"
           +this.money + "원 입니다"
        );
    }
}
