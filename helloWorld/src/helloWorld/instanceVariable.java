package helloWorld;

public class instanceVariable {

	int roll= 89;
	double marks = 80.5;
	public static void main(String[] args) {
		
		instanceVariable obj1 = new instanceVariable();
		obj1.show();

	}
	
	public void show() {
		System.out.println(roll + " test " + marks);
		
	}

}
