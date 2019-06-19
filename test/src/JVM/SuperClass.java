package JVM;

public class SuperClass {
	static{
		System.out.println("Super class init");
	}
	public static int value=121;
}

class SubClass extends SuperClass{
	static{
		System.out.println("SubClass init");
	}
}


