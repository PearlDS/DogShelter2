import exceptions.BreedNotFoundException;
import model.Dog;

import org.junit.*;
import service.AdoptionCenterService;

import java.util.ArrayList;
import java.util.List;

public class DogTestClass {
    private static Dog doggo;
    private static List <Dog> doggos = new ArrayList<>();
    private  static AdoptionCenterService adoptionCenterService;

    @BeforeClass
    public static  void maketestDogs(){
        doggo = new Dog("Pearl", 2, true,"poodle");
        doggos.add(new Dog("Patrick", 42, false,"mastiff"));
        doggos.add(new Dog("Bart", 4, true,"cat"));
        doggos.add(new Dog("Manuel", 1, true,"pug"));
        adoptionCenterService = new AdoptionCenterService();

    }

    @Test
     public void testGetName(){
        Assert.assertEquals("Pearl", doggo.getName());
    }

    @Test(expected = BreedNotFoundException.class)
    @Ignore("This test is not made yet")
    public void dogBreedException(){


    }

    @Test
    public void vaccinatedDogs(){

    }

    @Test
    public void getAge(){

    }




}
