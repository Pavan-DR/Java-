package program;

public class argument {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No argument passed");
		} else {
			for (int i = 0; i < args.length; i++) {
				System.out.println("Argument " + (i + 1) + " :" + args[i]);
			}
		}

	}

}
