package Package1;

public class String_Ex {

	public static void main(String[] args) {

		String str1="Test1 lives in NZ";
		String str2="Test2 lives in Germany";
		
		boolean b=str1.equals(str2);
		System.out.println("The comparision is:"+b);
		
		System.out.println(str1.concat(str2));
		
		
		System.out.println(str1.charAt(2));
		
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf('s',6));

		
		System.out.println(str1.substring(6,11));
		
		int i=10;
		
		String s1=String.valueOf(i);
		
		String s2="20";
		
		int j=Integer.parseInt(s2);
		
		
		
		
	}

}
