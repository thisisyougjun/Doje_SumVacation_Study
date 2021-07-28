package DAY03;

public class Student {
    public String studentName;
    public int grade;
    public int moeny;
    

    public Student (String studentName, int money){
        this.studentName=studentName;
        this.moeny =money;
    }
    public void takeBus(Bus bus){
        bus.take(1100);
        this.moeny -=1100;
    }

    public void takeSubway(Subway subway){
        subway.take(1350);
        this.moeny -=1350;
    }

    public void showInfo(){
        System.out.println(
            this.studentName + "  의 남은 돈은  "+ this.moeny + " 입니다."
        );
    }
}
