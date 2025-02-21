package PersonChallenge;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void minusAgeSetterTest() {
        Person person = new Person();
        person.setAge(-1);

        Assert.assertEquals(0, person.getAge());
    }

    @Test
    public void overHundredOneAgeSetterTest() {
        Person person = new Person();
        person.setAge(101);

        Assert.assertEquals(0, person.getAge());
    }

    @Test
    public void kidTest() {
        Person person = new Person();
        person.setAge(5);

        Assert.assertFalse(person.isTeen());
    }

    @Test
    public void adultTest() {
        Person person = new Person();
        person.setAge(5);

        Assert.assertFalse(person.isTeen());
    }

    @Test
    public void teenTest() {
        Person person = new Person();
        person.setAge(15);

        Assert.assertTrue(person.isTeen());
    }

    @Test
    public void getFullNameTest() {
        Person person = new Person();
        person.setFirstName("Michael");
        person.setLastName("Smith");

        Assert.assertEquals("Michael Smith", person.getFullName());
    }

    @Test
    public void getLastNameTest() {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("Joestar");

        Assert.assertEquals("Joestar", person.getFullName());
    }

    @Test
    public void getFirstNameTest() {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("Jonathan");

        Assert.assertEquals("Jonathan", person.getFullName());
    }

    @Test
    public void emptyFullNameTest() {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");

        Assert.assertEquals("", person.getFullName());
    }


}