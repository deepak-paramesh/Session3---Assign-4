class test {
	
	 test()
	 {
		 this(10);
		 System.out.println(" 0  arg constructors");
	 }
	 
	 test(int a)
	 {
		 this(30,20);
		 System.out.println("1 arg constructors");
	 }
	 
	 test(int a, int b)
	 {
		 System.out.println("2 arg constructors");
	 }
	
		public static void main(String[] args) {
			
			test t = new test();
					
	}

}
