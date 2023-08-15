package com.github.curriculeon;

public enum PersonEnum {
    LEON(0L, "Leon", "Hunter"),
    KRIS(1L, "Kris", "Younger"),
    DOLIO(2L, "Dolio", "Durante");

    private Long id;
    private String firstName;
    private String lastName;

    PersonEnum(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonEnum{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

    }
}
