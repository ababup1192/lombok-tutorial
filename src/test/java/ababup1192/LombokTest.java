package ababup1192;

import org.ababup1192.ImmutablePerson;
import org.ababup1192.PersonBuilder;
import org.ababup1192.PersonData;
import org.ababup1192.PersonValue;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LombokTest {

    @Test
    public void testDataClass() throws Exception {
        PersonData personData = new PersonData();
        personData.setName("John");
        personData.setAge(10);

        PersonData samePersonData = new PersonData();
        samePersonData.setName("John");
        samePersonData.setAge(10);


        assertThat(personData.getAge(), is(10));
        assertThat(personData.getName(), is("John"));
        assertThat(personData, is(samePersonData));
    }

    @Test
    public void testValueClass() throws Exception {
        PersonValue personValue = new PersonValue(10, "John");

        assertThat(personValue.getAge(), is(10));
        assertThat(personValue.getName(), is("John"));
        assertThat(personValue, is(new PersonValue(10, "John")));
    }

    @Test
    public void testBuilderClass() throws Exception {
        PersonBuilder person = PersonBuilder.builder()
                .age(10).firstName("John").familyName("Mayer").build();

        assertThat(person.getAge(), is(10));
        assertThat(person.getFirstName(), is("John"));
        assertThat(person.getFamilyName(), is("Mayer"));
    }

    @Test
    public void testImmutable() throws Exception {
        ImmutablePerson person = ImmutablePerson.builder()
                .age(10).firstName("John").familyName("Mayer").build();

        assertThat(person.age(), is(10));
        assertThat(person.firstName(), is("John"));
        assertThat(person.familyName(), is("Mayer"));
    }


}
