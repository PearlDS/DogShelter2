import model.Dog;
import service.AdoptionCenterService;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog doggo = new Dog("Pearl", 2, true,"poodle");
        AdoptionCenterService adoptionCenterService= adoptionCenterService = new AdoptionCenterService();
        adoptionCenterService.addADog(new Dog("Patrick", 42, false,"mastiff"));
        adoptionCenterService.addADog(new Dog("Bart", 4, true,"cat"));
        adoptionCenterService.addADog(new Dog("Manuel", 1, true,"pug"));
        adoptionCenterService.addADog(doggo);

        System.out.println("Create a new Dog");
        Dog dog = new Dog();
        System.out.println("Name?");
        dog.setName(scanner.next());
        System.out.println("Age?");
        dog.setAge(scanner.nextInt());
        System.out.println("Vacinated?");
        dog.setVaccinated(scanner.nextBoolean());
        System.out.println("Breed?");
        dog.setBreed(scanner.next());
        adoptionCenterService.addADog(dog);

        adoptionCenterService.askUserToAddADog();

        adoptionCenterService.getDoggos().forEach(System.out::println);

    }
}
