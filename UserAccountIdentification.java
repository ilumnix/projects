package basicProjects;
import java.util.Scanner;
public class UserAccountIdentification {
	static Scanner input = new Scanner(System.in);
	static String numberSelected;

	static String signUpUsername;
	static String signUpPassword;
	static String typedLoginUsername;
	static String typedLoginPassword;
	
	public static void main(String[]args) {
		System.out.println("Welcome to Youtuve!");
		System.out.println("Please select a number!");
		System.out.println("Login: 1");
		System.out.println("Signup: 2");
		UserAccountIdentification.numberSelected = input.nextLine();
		System.out.println("___________________");
		transporter();
	}
	public static void logIn() {
		System.out.println("Enter username: ");
		UserAccountIdentification.typedLoginUsername = input.nextLine();
		System.out.println("Enter password: ");
		UserAccountIdentification.typedLoginPassword = input.nextLine();
		System.out.println("___________________");
		accountIdentificator();
	}
	public static void signUp() {
		System.out.println("Enter username: ");
		UserAccountIdentification.signUpUsername = input.nextLine();
		System.out.println("Enter password: ");
		UserAccountIdentification.signUpPassword = input.nextLine();
		System.out.println("");
		System.out.println("You have successfuly signed up!");
		System.out.println("--------------------------------");
		UserAccountIdentification.main(null);
	}
	public static void accountIdentificator() {
		if(signUpPassword.equals(typedLoginPassword) && signUpUsername.equals(typedLoginUsername)){
				System.out.println("Welcome " + signUpUsername);
		} else{
			wrongInput();
		}
	}
	public static void transporter() {
		if(numberSelected.equals("1")) {
				logIn();
		}else if(numberSelected.equals("2")){
				signUp();
		} else {
				System.out.println("Wrong input!");
				System.out.println("Try Again!");
				System.out.println("___________________");
				UserAccountIdentification.main(null);
		}
	}
	public static void wrongInput(){
			System.out.println("Wrong password or username");
			System.out.println("___________________");
			logIn();
	}
}
