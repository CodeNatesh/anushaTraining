package Package1;

public class If_Condition {

	public static void main(String[] args) {
		
		
		int age=19;
		int weight=40;
		
		if(age>=18) {
			System.out.println("You age is eligible to vote");
			if(weight>50) {
				System.out.println("You are ready to vote because weight ");
			}else {
				System.out.println("You are not ready to vote is less then 50");
			}
		}else {
			System.out.println("You age is not eligible to vote");
		}

		
		
		

	}

}
