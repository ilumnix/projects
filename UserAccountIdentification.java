package projects;
import java.util.Scanner;
public class UserAccountIdentification {
	/*Account variables*/
	static Scanner input = new Scanner(System.in);
	static int numberSelected, numberSelectedForExit;

	static String signUpUsername, signUpPassword;
	static String typedLoginUsername, typedLoginPassword;
	
	public static void main(String[]args) {
		System.out.println("Welcome to Youtuve!");
		System.out.println("Please select a number!");
		System.out.println("Signup: 1");
		System.out.println("Login: 2");
		System.out.println("Close Program: 0");
		numberSelected = input.nextInt();
		System.out.println("___________________");
		transporter();
	}
	/*Login Interface */
	public static void logIn() {
		System.out.println("Log In!");
		System.out.println("Enter Username: ");
		typedLoginUsername = input.next();
		System.out.println("Enter Password: ");
		typedLoginPassword = input.next();
		System.out.println("___________________");
		accountIdentificator();
	}
	/*Signup Interface */
	public static void signUp() {
		System.out.println("SIGN UP!");
		System.out.println("Enter Username: ");
		signUpUsername = input.next();
		System.out.println("Enter Password: ");
		signUpPassword = input.next();
		System.out.println("");
		System.out.println("You have successfuly signed up!");
		System.out.println("-------------------------------");
		main(null);
	}
	/*Fuction to test if the password&username matched the signed password&username*/ 
	public static void accountIdentificator() {
		if(signUpPassword.equals(typedLoginPassword) && signUpUsername.equals(typedLoginUsername)){
				System.out.println("Welcome " + signUpUsername);
		} else{
			wrongInput();
		}
	}
	/*This transports the user to the choosen key on whether the next page will go to login or signup */
	public static void transporter() {
				if(numberSelected = 1){
					signUp();
				}
				else if(numberSelected = 2) {
					logIn();
				} 
				else if(numberSelected = 0){
					closeProgram();
				}
				else{
					wrongInputMain();
				}
		 
	}
	/*THIS PART SHOWS THE MESSAGE OF THE SYSTEM REGARDING THE USERS INPUT OR INFORMATION THAT THEY TYPED */
	public static void wrongInput(){
			System.out.println("Wrong password or username");
			System.out.println("___________________");
			logIn();
	}
	public static void wrongInputMain(){
		System.out.println("Wrong Input");
		System.out.println("Try Again: 1");
		System.out.println("Exit: 0");
		numberSelectedForExit = input.nextInt();
		if(numberSelected = 1) {
			main(null);
		} else if(numberSelected = 0){
			closeProgram();
		} else{
			wrongInputMain();
		}
		
}
	/*This ask the user wether to exit the program */
	public static void closeProgram(){
		System.out.println("Would you like to close the program?");
		System.out.println("Yes: 1");
		System.out.println("No: 2");
		numberSelectedForExit = input.nextInt();
		if(numberSelected == 1){
			System.out.println("System Closed");
			System.out.println("");
			System.exit(0);
		} 
		else if(numberSelectedForExit == 2){
				main(null);
		} else{
				System.out.println("Wrong Input");
				closeProgram();
		}
	}
}
