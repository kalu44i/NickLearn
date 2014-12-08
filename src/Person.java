import java.util.Date;

public class Person {
	private String name;
	private String surname;
	private int age;
	private String citizenShip;
	private String gender;
	// private Date birthday;
	private String maritalStatus;
	private int height;
	private int weight;

	public Person(String name, String surname, int age, String citizenShip,
			String gender, String maritalStatus, int height, int weight) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.citizenShip = citizenShip;
		this.gender = gender;
		// this.birthday = birthday;
		this.maritalStatus = maritalStatus;
		this.height = height;
		this.weight = weight;
	}

	public Person(String name, String surname, String gender) {
		this.name = name;
		this.surname = surname;
		this.age = 18;
		this.citizenShip = "citizenShip";
		this.gender = gender;
		// this.birthday = birthday;
		this.maritalStatus = "maritalStatus";
		this.height = 0;
		this.weight = 0;
	}

	String getName() {
		return name;
	}

	String getSurname() {
		return surname;
	}

	int getAge() {
		return age;
	}

	String getCitizenShip() {
		return citizenShip;
	}

	String getGender() {
		return gender;
	}

	// Date getBirthday() {
	// return birthday;
	// }

	String getMaritalStatus() {
		return maritalStatus;
	}

	int getHeight() {
		return height;
	}

	int hetWeight() {
		return weight;
	}

}
