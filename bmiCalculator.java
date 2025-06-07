package program;

public class check {
	public String name;
	public double height;
	public double weight;

	check(String n, double h, double w) {
		name = n;
		height = h;
		weight = w;
	}

	public double displayBmi() {
		return (weight / (height * height)) * 703;
	}

	public static void main(String[] args) {
		check c1 = new check("Pav", 178.1, 67);
		System.out.println("BMI of " + c1.name + " :" + c1.displayBmi());
		check c2 = new check("Sam", 178.7, 57);
		System.out.println("BMI of " + c2.name + " :" + c2.displayBmi());

	}

}
