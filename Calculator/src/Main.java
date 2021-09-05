import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		int n2 = scanner.nextInt();
		
		System.out.print("Enter the operation (+, -, x, /): ");
		String operator = scanner.next();
		
		double result;
		
		switch(operator) {
		
			case "+":
				result = n1+n2;
				System.out.println(n1+"+"+n2+"= "+result);
			break;
			
			case "-":
				result = n1-n2;
				System.out.println(n1+"-"+n2+"= "+result);
			break;
			
			case "x":
				result = n1*n2;
				System.out.println(n1+"x"+n2+"= "+result);
			break;
			
			case "/":
				result = n1/n2;
				System.out.println(n1+"/"+n2+"= "+result);
			break;
		
		}
		
		scanner.close();
	}

}
