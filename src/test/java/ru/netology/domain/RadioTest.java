package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldVolume() {
        Radio volume = new Radio();
        assertEquals(0, volume.currentVolume);
    }

    @Test
    public void shouldStation() {
        Radio volume = new Radio();
        assertEquals(0, volume.currentStation);
    }
}