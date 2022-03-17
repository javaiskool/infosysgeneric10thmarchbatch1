


/*class A
{
	
	static int add(int a,int b)
	{
		return a+b;
	}

} */

public class Main1 {


	
	
	
	/*
	  static double add(double a,double b) {
	  System.out.println("add having double parameters"); return a+b; }
	 */
	
	
	 static double add(int a,double b) {
		  System.out.println("add int first"); return a+b; }
		 
	 static double add(double a,int b) {
		  System.out.println("add double first"); return a+b; }

	 
	/*
	  static int add(int a,int b) {
	  System.out.println("add having int parameters"); return a+b; }
	 */
	  /*
	  static float add(int m,int n) {
		  System.out.println("int parameters"); return a+b; }
		
	  */
	  
	  /*static int add(int m,int n) {
		  System.out.println("int parameters"); return a+b; }
		*/
	  
	  
	
	public static void main(String[] args) {
		System.out.println(add(10.0,20));
		
		//System.out.println(add(10.0,20.0));
		
		//System.out.println(add((int)10.0,(int)20.0));
		/*
		System.out.println(15);
		System.out.println('a');
		System.out.println("Radha");
		System.out.println(true);
		*/
	}

}
