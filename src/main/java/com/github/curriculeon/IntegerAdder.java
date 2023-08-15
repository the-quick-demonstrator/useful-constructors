package com.github.curriculeon;

public class IntegerAdder implements AdderInterface<Integer, Integer> {
    @Override
    public Integer add(Integer object1, Integer object2) {
        return object1 + object2;
    }
}
