package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void NextStation() {
        Radio radio = new Radio();
        for (int i = 0; i < 10; i++) {
            radio.nextStation();
        }
    }

    @Test
    public void PrevStation() {
        Radio radio = new Radio();
        for (int i = 0; i >= 9; i++) {
            radio.prevStation();
        }
    }

    @Test
    public void SetStation() {
        int[] currentState = {0, 1, 5, 8, 9, 10, 11, -1};
        Radio radio = new Radio();
        for (int station : currentState) {
            radio.setCurrentStation(station);
        }
    }

    @Test
    public void IncreaseVolume() {
        Radio radio = new Radio();
        for (int i = 0; i < 11; i++) {
            radio.increaseVolume();
        }
    }

    @Test
    public void DecreaseVolume() {
        Radio radio = new Radio();
        for (int i = 0; i < 11; i++) {
            radio.decreaseVolume();
        }
        ;
    }

}