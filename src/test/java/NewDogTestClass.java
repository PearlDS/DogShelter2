import model.Dog;
import org.junit.*;


public class NewDogTestClass {


    @Test
    public void testGetName(){
        Dog doggo = new Dog("Pearl", 2, true,"poodle");
        Assert.assertEquals("Pearl", doggo.getName());
    }
    @Test
    public void testGetName2(){
        Dog doggo = new Dog("Pearl", 2, true,"poodle");
        Assert.assertEquals("Pear", doggo.getName());

    }
}
