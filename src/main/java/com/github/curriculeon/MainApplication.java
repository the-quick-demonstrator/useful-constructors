package com.github.curriculeon;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        PersonEnum.LEON.setFirstName("Noel");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a person!");
        System.out.println("here are the people you can select!");
        System.out.println(Arrays.asList(PersonEnum.values()));
        String selectPerson = scanner.nextLine();
        PersonEnum.valueOf(selectPerson).setFirstName("");
    }
}
