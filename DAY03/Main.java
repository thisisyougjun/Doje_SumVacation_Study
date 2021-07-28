package DAY03;

public class Main {
    public static /* 모든 클래스와 변수 공유 */void main(String[] args) {
        
        Bus bus =new Bus();
        Subway subway =new Subway(null);
        
        Student s1 = new Student("a",10000);
        Student s2 = new Student("b",10000);
        Student s3 = new Student("c",10000);
        Student s4 = new Student("d",10000);
        Student s5 = new Student("e",10000);

        s1.takeBus(bus);
        s3.takeBus(bus);
        s5.takeBus(bus);
        s2.takeSubway(subway);
        s4.takeSubway(subway);
        s2.takeBus(bus);

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
        s5.showInfo();

        bus.showInfo();
        subway.showInfo();

    
    }
}
