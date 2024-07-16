import java.util.Scanner;



public class grade {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=1;
		
		
		while(x==1){
			
				System.out.println("Enter the mark:");
				
				int mark=sc.nextInt();
				if (mark<0 || mark>100) {
						System.out.println("Invalid mark");
						continue;
				}
				if (mark>=90) {
						System.out.println("The grade is A");
				}
				else if (mark>=80) {
					System.out.println("The grade is B");	
				}
				else if (mark>=70) {
						System.out.println("The grade is C");
				}
				else if (mark>=60) {
					System.out.println("The grade is D");	
				}
				else {
					System.out.println("The grade is F");
				}
				
				System.out.println("Do you wanna continue adding marks?(0/1)");
				int flag=sc.nextInt();
				x=flag;
				
				
		}
		
	}
}
