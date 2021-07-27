public class Hw5 {
	public static void main(String[] arg) {
		Pet myCat = new Pet("팡팡");
		Pet myDog = new Pet("푸들","라떼" ,2);

	
	}
}

class Pet {
	
	public Pet(String pname) {
		type=pname;
	}
	public Pet(String ptype, String pname, int page) {
		type=ptype;
		name=pname;
		age=page;
	}
	String type;
	String name;
	int age;
}