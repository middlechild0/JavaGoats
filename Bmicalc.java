package bmi;
import java.util.Scanner;
public class Bmicalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight;
		double height;
		double bmi;
		System.out.println("Enter your weight:");
		weight=input.nextInt();
		System.out.println("Enter your height");
		height=input.nextDouble();
		bmi=weight/(height*height);
		System.out.println("Your BMI is:"+bmi);
	}

}
