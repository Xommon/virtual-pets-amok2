import java.util.Scanner;

public class VirtualPetsAmokApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Virtual Pets Amok!\n");

		VirtualPetShelter shelter = new VirtualPetShelter();
		Dog dog1 = new Dog("Tracy", "Dog");
		Cat cat1 = new Cat("Oreo", "Cat");
		RobotDog robotDog1 = new RobotDog("Buzz", "Robot Dog");
		RobotCat robotCat1 = new RobotCat("Zappi", "Robot Cat");

		shelter.pets.put(dog1.getName(), dog1);
		shelter.pets.put(cat1.getName(), cat1);
		shelter.pets.put(robotDog1.getName(), robotDog1);
		shelter.pets.put(robotCat1.getName(), robotCat1);

		while (true) {
			String format = String.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s", "Name", "Animal",
					"Health", "Happiness", "Boredom", "Hunger", "Thirst", "Potty", "Oil", "Cage Clean");
			System.out.println(format);
			System.out.println(
					"_________________________________________________________________________________________________________");
			for (VirtualPet creature : shelter.getAllNames()) {
				System.out.println(creature);
			}
			System.out.println("Litter dirtiness: " + shelter.litter + "%");

			System.out.println("\nWhat would you like to do?");
			System.out.println("1: Feed all organic pets.");
			System.out.println("2: Give water to all organic pets.");
			System.out.println("3: Takes all dogs out for a walk.");
			System.out.println("4: Play with single pet.");
			System.out.println("5: Oil all robot pets.");
			System.out.println("6: Clean cat litter.");
			System.out.println("7: Clean all organic dog cages.");
			System.out.println("8: Have pet adopted out.");
			System.out.println("9: Intake a new pet.");
			System.out.println("10: Quit.");

			int entry = input.nextInt();

			if (entry == 1) {
				System.out.println("You feed all of the organic pets.");
				shelter.feedAll();
			} else if (entry == 2) {
				System.out.println("You give water to all of the organic pets.");
				shelter.waterAll();
			} else if (entry == 3) {
				System.out.println("You take all the dogs out for a walk!");
				shelter.walkAll();
			} else if (entry == 4) {
				input.nextLine();
				System.out.println("Which pet do you want to play with?");
				String playWithPet = input.nextLine();
				shelter.playWith(playWithPet);
				System.out.println("You play with " + playWithPet);
			} else if (entry == 5) {
				System.out.println("You oil all of the robotic pets.");
				shelter.oilAll();
			} else if (entry == 6) {
				System.out.println("You clean the cat litter.");
				shelter.cleanLitter();
			} else if (entry == 7) {
				System.out.println("You clean the organic dog cages.");
				shelter.cleanCages();
			} else if (entry == 8) {
				input.nextLine();
				System.out.println("Which pet is being adopted out?");
				String adoptedPet = input.nextLine();
				shelter.removePet(adoptedPet);
			} else if (entry == 9) {
				String addType = null;
				System.out.println("What kind of pet are you adopting?");
				System.out.println("Please type 'Dog', 'Cat', 'Robot Dog', or 'Robot Cat'.");
				input.nextLine();
				addType = input.nextLine();
				System.out.println("What is the name of this animal?");
				String addName = input.nextLine();
				shelter.addPet(addName, addType);
				System.out.println("Please welcome " + addName + " to your shelter.");
			} else if (entry == 10) {
				System.exit(0);
			}
			shelter.tickAll();
			shelter.capEveryAll();
		}
	}
}
