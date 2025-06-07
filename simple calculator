package program;
import java.util.Scanner;

public class simplecal {

	public static void main(String[] args) {
		int n1, n2, ch;
		char c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter number 1:");
			n1 = sc.nextInt();
			System.out.print("Enter number 2:");
			n2 = sc.nextInt();
			System.out.println("Enter choice\n1.Add\n2.Sub");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Result:" + (n1 + n2));
				break;
			case 2:
				System.out.println("Result:" + (n1 - n2));
				break;
			default:
				System.out.println("Invalid:Enter 1 or 2");
			}
			System.out.println("To continue press y/Y");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');
		System.out.println("Terminated");
	}

}
