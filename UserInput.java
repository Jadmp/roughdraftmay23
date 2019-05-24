package allmyclasses;

import java.util.Scanner;

public class UserInput {

	String input = "";
	double income = 0.0;
	boolean maritalStatus = true;

	public void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your state of residence");
		input = sc.nextLine();

		System.out.println("Please enter your annual income");
		income = sc.nextDouble();

		System.out.println("Are you currently married? If so, please enter 'y'. If not, please enter 'n'");
		maritalStatus = sc.nextLine().toLowerCase().startsWith("Y");

	}

	public String getInput() {
		return input;
	}

	public double getIncome() {
		return income;
	}

	public boolean getMaritalStatus() {
		return maritalStatus;
	}

	double tax = 0.0;
}