class Father {
	void fatherPrint(){
		System.out.println("This is parent class");
	}	
}
class Child extends Father{
	void childPrint() {
		System.out.println("This is child class");	
	}
}
public class Q1 {

	public static void main(String[] args) {
       Father a = new Father();
       Child b = new Child();
        a.fatherPrint();
        b.childPrint();
        b.fatherPrint();
    		   

	}

}
