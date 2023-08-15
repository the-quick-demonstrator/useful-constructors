package com.github.curriculeon;

import java.util.Arrays;
import java.util.List;

public class PersonAdder implements AdderInterface<Person, List<Person>>{
    @Override
    public List<Person> add(Person object1, Person object2) {
        return Arrays.asList(object1, object2);
    }
}
