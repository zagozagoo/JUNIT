package com.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParTest {
    private final Par validacao = new Par();

    @Test
    void validate() {
        assertEquals(validacao.validate(29), false);
        assertEquals(validacao.validate(2), true);
        assertEquals(validacao.validate(5), false);
        assertEquals(validacao.validate(0), true);
    }
}
