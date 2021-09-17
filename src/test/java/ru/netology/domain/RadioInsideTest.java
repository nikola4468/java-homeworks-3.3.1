package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioInsideTest {

    @Test
    public void shouldIncreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setCurrentVolume(-1);
        volume.increaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.setCurrentVolume(1);
        volume.increaseVolume();
        assertEquals(2, volume.getCurrentVolume());
        volume.setCurrentVolume(99);
        volume.increaseVolume();
        assertEquals(100, volume.getCurrentVolume());
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        assertEquals(100, volume.getCurrentVolume());
        volume.setCurrentVolume(101);
        volume.increaseVolume();
        assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setCurrentVolume(-1);
        volume.decreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.setCurrentVolume(1);
        volume.decreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.setCurrentVolume(99);
        volume.decreaseVolume();
        assertEquals(98, volume.getCurrentVolume());
        volume.setCurrentVolume(100);
        volume.decreaseVolume();
        assertEquals(99, volume.getCurrentVolume());
        volume.setCurrentVolume(101);
        volume.decreaseVolume();
        assertEquals(99, volume.getCurrentVolume());
    }

    @Test
    public void shouldNextStation() {
        RadioInside station = new RadioInside(11);
        station.setCurrentStation(-1);
        station.nextStation();
        assertEquals(1, station.getCurrentStation());
        station.setCurrentStation(0);
        station.nextStation();
        assertEquals(1, station.getCurrentStation());
        station.setCurrentStation(1);
        station.nextStation();
        assertEquals(2, station.getCurrentStation());
        station.setCurrentStation(9);
        station.nextStation();
        assertEquals(10, station.getCurrentStation());
        station.setCurrentStation(10);
        station.nextStation();
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(11);
        station.nextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        RadioInside station = new RadioInside();
        station.setCurrentStation(-1);
        station.prevStation();
        assertEquals(9, station.getCurrentStation());
        station.setCurrentStation(0);
        station.prevStation();
        assertEquals(9, station.getCurrentStation());
        station.setCurrentStation(1);
        station.prevStation();
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(8);
        station.prevStation();
        assertEquals(7, station.getCurrentStation());
        station.setCurrentStation(9);
        station.prevStation();
        assertEquals(8, station.getCurrentStation());
        station.setCurrentStation(10);
        station.prevStation();
        assertEquals(8, station.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        RadioInside station = new RadioInside();
        station.setCurrentStation(-1);
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(0);
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(1);
        assertEquals(1, station.getCurrentStation());
        station.setCurrentStation(8);
        assertEquals(8, station.getCurrentStation());
        station.setCurrentStation(9);
        assertEquals(9, station.getCurrentStation());
        station.setCurrentStation(10);
        assertEquals(9, station.getCurrentStation());
    }
}