import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;

public class Start {

	public static void main(String[] args) throws IOException {
	
		System.out.println("Add new person to your program!");
		System.out.println("Your name:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name = in.readLine();
		System.out.println("Your Surname:");
		String surname = in.readLine();
		int age = Integer.parseInt(in.readLine());
		String citizenShip = in.readLine();
		String gender = in.readLine();
		String maritalStatus = in.readLine();
		int height = Integer.parseInt(in.readLine());
		int weight = Integer.parseInt(in.readLine());

		Person p = new Person(name, surname, age, citizenShip, gender, maritalStatus, height, weight);
	}

}