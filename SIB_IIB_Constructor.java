package SIB_IIB_Project;

public class SIB_IIB_Constructor {

	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}

	SIB_IIB_Constructor() {
		System.out.println("CONSTRUCTOR");
	}

	SIB_IIB_Constructor(int a) {
		System.out.println("CONSTRUCTOR WITH PARAMETER int");
	}

	SIB_IIB_Constructor(String b) {
		System.out.println("CONSTRUCTOR WITH PARAMETER String");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");

		new SIB_IIB_Constructor();
		new SIB_IIB_Constructor(10);
		new SIB_IIB_Constructor("Rajan");
	}

}
