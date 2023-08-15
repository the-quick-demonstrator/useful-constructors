package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PersonConstructor {

    @Test
    public void test1() {
        // given : expectations
        Long expectedId = 10L;
        String expectedFirstName = "Leon";
        String expectedLastName = "Hunter";

        // given : input-value
        Long inputId = expectedId;
        String inputFirstName = expectedFirstName;
        String inputLastName = expectedLastName;

        // when
        Person person = new Person(expectedId, expectedFirstName, expectedLastName);

        // then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedFirstName, person.getFirstName());
        Assert.assertEquals(expectedLastName, person.getLastName());
    }

    @Test
    public void test2() {
        // given
        People people = new People();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        List<Person> expectedList = Arrays.asList(person1, person2, person3);
        int expectedNumberOfPeople = expectedList.size();

        // when
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // then
        int actualNumberOfPeople = people.getList().size();
        Assert.assertEquals(expectedNumberOfPeople, actualNumberOfPeople);
        for (Person person : expectedList) {
            boolean actuallyContainsPerson = expectedList.contains(person);
            Assert.assertTrue(actuallyContainsPerson);
        }
    }

    public void test3() {

    }

}
