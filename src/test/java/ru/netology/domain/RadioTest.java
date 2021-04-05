package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setOn(true);
        radioStation.setCurrentRadioStation(9);
        assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setOn(true);
        radioStation.setCurrentRadioStation(9);
        radioStation.nextCurrentRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setOn(true);
        radioStation.setCurrentRadioStation(0);
        radioStation.prevCurrentRadioStation();
        assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldNextCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setOn(true);
        radioStation.setCurrentRadioStation(5);
        radioStation.nextCurrentRadioStation();
        assertEquals(6, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setOn(true);
        radioStation.setCurrentRadioStation(6);
        radioStation.prevCurrentRadioStation();
        assertEquals(5, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setOn(true);
        radioStation.setCurrentRadioStation(10);
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationTwo() {
        Radio radioStation = new Radio();
        radioStation.setOn(true);
        radioStation.setCurrentRadioStation(-1);
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPlusCurrentVolume() {
        Radio volume = new Radio();
        volume.setOn(true);
        volume.setCurrentVolume(9);
        volume.plusCurrentVolume();
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldMinusCurrentVolume() {
        Radio volume = new Radio();
        volume.setOn(true);
        volume.setCurrentVolume(1);
        volume.minusCurrentVolume();
        assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setOn(true);
        volume.setCurrentVolume(10);
        volume.plusCurrentVolume();
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMin() {
        Radio volume = new Radio();
        volume.setOn(true);
        volume.setCurrentVolume(0);
        volume.minusCurrentVolume();
        assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();
        volume.setOn(true);
        volume.setCurrentVolume(11);
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeTwo() {
        Radio volume = new Radio();
        volume.setOn(true);
        volume.setCurrentVolume(-1);
        assertEquals(0, volume.getCurrentVolume());
    }
}