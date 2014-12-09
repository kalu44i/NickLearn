import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;

public class Start {
	
	/**
	 * 
	 * @return Person object
	 * @throws IOException User cannot input anything
	 */

	static Person createPerson() throws IOException {
		System.out.println("Your name:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name = in.readLine();
		System.out.println("Your Surname:");
		String surname = in.readLine();
		System.out.println("Your Age:");
		int age = Integer.parseInt(in.readLine());
		System.out.println("Your citizenShip:");
		String citizenShip = in.readLine();
		System.out.println("Your gender:");
		String gender = in.readLine();
		System.out.println("Your maritalStatus:");
		String maritalStatus = in.readLine();
		System.out.println("Your height:");
		int height = Integer.parseInt(in.readLine());
		System.out.println("Your weight:");
		int weight = Integer.parseInt(in.readLine());

		Person p = new Person(name, surname, age, citizenShip, gender,
				maritalStatus, height, weight);

		return p;
	}

	public static void main(String[] args) throws IOException {

		System.out.println("Add new person to your program!");
		Person p1 = createPerson();

	}

}