package com.github.curriculeon;

public class GenericPerson {
    public InstanceVariable<Integer> age;
    public InstanceVariable<String> firstName;
    public InstanceVariable<String> lastName;

    public GenericPerson(Integer age, String firstName, String lastName) {
        this.age = new InstanceVariable<Integer>(age);
        this.firstName = new InstanceVariable<String>(firstName);
        this.lastName = new InstanceVariable<String>(lastName);
    }

    public GenericPerson() {
    }
}
