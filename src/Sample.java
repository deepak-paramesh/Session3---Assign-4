public class Sample {
	int a=100;
	int b=200;
	static int c=300;
	static int d=400;
	
	void m1()		// instance method
	{
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	static void m2()	// static method
	{
		Sample a=new Sample();
		Sample b=new Sample();
		System.out.println(a.a);
		System.out.println(b.b);

		System.out.println(c);
		System.out.println(d);
		
	}

	public static  void main(String[] args) {
		
		Sample a=new Sample();
		a.m1();

		m2();
		
	}

}
