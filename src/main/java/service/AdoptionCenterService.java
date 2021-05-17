package service;

import exceptions.BreedNotFoundException;
import model.Breed;
import model.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AdoptionCenterService {

    private List<Dog> doggos = new ArrayList<>();

public int getAgeInHumanYears(Dog dog){
    return dog.getAge()*7;
}

public List<Dog> getAllVaccinatedDogs(List<Dog> dogs){
    List<Dog> doggos = new ArrayList();
    for (Dog dog : dogs)
        if (dog.isVaccinated())
            doggos.add(dog);
    return doggos;
}

    public List<Dog> getDogsOfBreed (List<Dog> dogsGiven, String breedGiven) throws BreedNotFoundException {
        List<Dog> doggos = new ArrayList();
        List<String> dogBreeds = new ArrayList<>();
        for (Breed breed: Arrays.asList(Breed.values())) dogBreeds.add(breed.name());

        for (Dog dog : dogsGiven) {
            for (Breed breed : Breed.values())
                if (dog.getBreed().toUpperCase().equals(breed.name())&&breedGiven.toUpperCase().equals(breed.name()) )
                    doggos.add(dog);

                if(!dogBreeds.contains(breedGiven.toUpperCase()))
                 throw new BreedNotFoundException("The breed '"+breedGiven.toUpperCase()+"' does not exist");
        }
        return doggos;
    }

    public List<Dog> getDoggos() {
        return doggos;
    }

    public void addADog(Dog dog){
    this.doggos.add(dog);
    }

    public void askUserToAddADog(){
        Scanner scanner = new Scanner(System.in);
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
        addADog(dog);

    }
    public void orderDogsByName(){

    }

    public void deleteDog(String name){



    }
}
