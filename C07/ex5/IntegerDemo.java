package chap7.example.ex5;

public class IntegerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		int i2 =200;
		String s = "300";
		
		Integer i1 = new Integer(100);	//int->Integer(1)
		System.out.println(Integer.valueOf(i2));  //int->Integer(2)
		System.out.println(i1.intValue());  //Integer->int		
		
		System.out.println(i2+""); //int->String(1)
		System.out.println(Integer.toString(i2));	//int->String(2)
		System.out.println(Integer.parseInt(s));  //String->int
		
		System.out.println(i1+""); //Integer->String(1)
		System.out.println(i1.toString()); //Integer->String(2)
		System.out.println(new Integer("400"));   //String->Integer(1)
		System.out.println(Integer.valueOf("400"));  //String->Integer(2)
	}

}
