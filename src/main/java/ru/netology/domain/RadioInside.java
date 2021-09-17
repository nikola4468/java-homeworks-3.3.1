package ru.netology.domain;

public class RadioInside {

    private int volumeMax = 100;
    private int volumeMin = 0;
    public int currentVolume;
    public int stations = 10;
    private int stationMin = 0;
    public int currentStation;

    public RadioInside() {
    }

    public RadioInside(int stations) {
        this.stations = stations;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume >= volumeMax) {
            this.currentVolume = volumeMax;
        }
        if (currentVolume <= volumeMin) {
            this.currentVolume = volumeMin;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            this.currentVolume++;
        } else this.currentVolume = volumeMax;
    }

    public void decreaseVolume() {
        if (currentVolume > volumeMin) {
            this.currentVolume--;
        } else this.currentVolume = volumeMin;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation >= stations - 1) {
            this.currentStation = stations - 1;
        }
        if (currentStation <= stationMin) {
            this.currentStation = stationMin;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < stations - 1) {
            this.currentStation++;
        } else {
            this.currentStation = stationMin;
        }
    }

    public void prevStation() {
        if (currentStation > stationMin) {
            this.currentStation--;
        } else {
            this.currentStation = stations - 1;
        }
    }
}