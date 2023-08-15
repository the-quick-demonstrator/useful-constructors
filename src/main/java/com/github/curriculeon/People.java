package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> list;

    public People(List<Person> list) {
        this.list = list;
    }

    public People() {
        this(new ArrayList<>());
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public List<Person> getList() {
        return list;
    }
}
