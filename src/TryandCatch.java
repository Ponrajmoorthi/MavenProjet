
public class TryandCatch  {
	public static void main(String[] args) {

		System.out.println("Start---------------");
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println(10 / 0);
			try {
				String s=null;
				System.out.println(s.charAt(0));
			}catch





		}
		catch(ArithmeticException e) {
			System.out.println("this is for exception");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("End_____________________");


	}


}
