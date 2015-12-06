package ababup1192;

import org.ababup1192.Person;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LombokTest {

    @Test
    public void testDataClass() throws Exception {
        Person person = new Person();
        person.setName("John");
        person.setAge(10);

        assertThat(person.getAge(), is(10));
        assertThat(person.getName(), is("John"));
    }


}
