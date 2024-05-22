package com.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    private final PrimeValidator validator = new PrimeValidator();

    @Test
    void validate() {
        assertEquals(
            validator.validate(5),
            true
        );
        assertEquals(
            validator.validate(2),
            true
        );
        assertEquals(
            validator.validate(0),
            true
        );
        assertEquals(
            validator.validate(0),
            true
        );
    }

}
