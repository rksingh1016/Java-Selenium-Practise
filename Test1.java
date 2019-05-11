//import java.lang.reflect.Array;

public class Test1 {

	public static void main(String[] args) {
		// try a finite loop and print values 1 to 100
		for(int i=1;i<=100;i++)
		{
			//created an object to class - Test1 for garbage collection(automatically) by JVM
			new Test1();
			System.out.println(i);
		}
		//here, garbage collection does not happen by JVM automatically
		Test1 t = new Test1();  
		System.out.println(t);
		//but can be done by this
		t = null;
		System.out.println(t);
	}

}
