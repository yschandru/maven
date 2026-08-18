package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    @Test
    void shouldReturnGreetingForProvidedName() {
        GreetingService service = new GreetingService();

        assertEquals("Hello, Alice!", service.getMessage("Alice"));
    }

    @Test
    void shouldUseDefaultNameWhenEmpty() {
        GreetingService service = new GreetingService();

        assertEquals("Hello, World!", service.getMessage("   "));
    }
}
