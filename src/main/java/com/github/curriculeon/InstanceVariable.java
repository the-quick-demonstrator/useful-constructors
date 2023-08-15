package com.github.curriculeon;

public class InstanceVariable<SomeType> {
  private SomeType value;

    public InstanceVariable(SomeType value) {
        this.value = value;
    }

    public void set(SomeType newValue) {
        this.value = newValue;
    }

    public SomeType get() {
        return this.value;
    }
}
