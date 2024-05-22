package com.junitexample;

public class PrimeValidator {
    public Boolean validate(Integer number) {
        for (int i = 2; i < number ; i++ ) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
