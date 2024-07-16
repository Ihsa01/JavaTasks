import java.util.Scanner;


public class calc{	
	public static void main(String[] args) {
		char op;
		Double num1, num2, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("Choose an operator: +, -, *, /");
		op=sc.next().charAt(0);
		res=0.0;
		
		switch(op){
		
			case '+':
				res=num1+num2;
				break;
			case '-':
				res=num1-num2;
				break;
			case '*':
				res=num1*num2;
				break;
			case '/':
				res=num1/num2;
				break;
			default:
				System.out.println("Wrong input");
				
			
		}
		
		System.out.println("Result:");
		System.out.println(num1 + " " + op + " " + num2 + "=" + res); 
		
	}	
}
