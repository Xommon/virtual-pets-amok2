
public class VirtualPetsAmokApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Virtual Pets Amok!\n");
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		Dog dog1 = new Dog("Tracy","Dog");
		Cat cat1 = new Cat("Oreo","Cat");
		RobotDog robotDog1 = new RobotDog("Buzz","Robot Dog");
		RobotCat robotCat1 = new RobotCat("Zappi","Robot Cat");
		
		shelter.pets.put(dog1.getName(), dog1);
		shelter.pets.put(cat1.getName(), cat1);
		shelter.pets.put(robotDog1.getName(), robotDog1);
		shelter.pets.put(robotCat1.getName(), robotCat1);
		//while (true) {}
        String format = String.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s", "Name", "Description", "Health", "Happiness", "Boredom", "Hunger", "Thirst", "Potty");
        System.out.println(format);
        System.out.println("______________________________________________________________________________________________________________");
        for (VirtualPet creature : shelter.getAllNames()) {
            System.out.println(creature);
        }
	}
}
