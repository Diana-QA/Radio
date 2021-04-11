package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCurrentRadioStation() {
        Radio radioStation = new Radio(9, 4, 60);
        assertEquals(4, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radioStation = new Radio(9, 9, 60);
        radioStation.nextCurrentRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radioStation = new Radio(9, 0, 60);
        radioStation.prevCurrentRadioStation();
        assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldNextCurrentRadioStation() {
        Radio radioStation = new Radio(9, 4, 60);
        radioStation.nextCurrentRadioStation();
        assertEquals(5, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevCurrentRadioStation() {
        Radio radioStation = new Radio(9, 4, 60);
        radioStation.prevCurrentRadioStation();
        assertEquals(3, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationTwo() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPlusCurrentVolume() {
        Radio volume = new Radio(9, 4, 60);
        volume.plusCurrentVolume();
        assertEquals(61, volume.getCurrentVolume());
    }

    @Test
    public void shouldMinusCurrentVolume() {
        Radio volume = new Radio(9, 4, 60);
        volume.minusCurrentVolume();
        assertEquals(59, volume.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio(9, 4, 100);
        volume.plusCurrentVolume();
        assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMin() {
        Radio volume = new Radio(9, 4, 0);
        volume.setCurrentVolume(0);
        volume.minusCurrentVolume();
        assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio(9, 4, 60);
        volume.setCurrentVolume(60);
        assertEquals(60, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeTwo() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        assertEquals(0, volume.getCurrentVolume());
    }
}