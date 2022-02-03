package ru.netology;

public class Radio {
    int currentVolume = 0;
    int currentStation = 0;

    public void nextStation() {
        currentStation++;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else currentStation = currentStation - 1;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 & currentStation <= 10) {
            this.currentStation = currentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume <= 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
