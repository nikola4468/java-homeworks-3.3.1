package ru.netology.domain;

public class RadioInside {

    private int volumeMax = 10;
    private int volumeMin = 0;
    public int currentVolume;
    private int stationMax = 9;
    private int stationMin = 0;
    public int currentStation;

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

    public void IncreaseVolume() {
        if (currentVolume < volumeMax) {
            this.currentVolume++;
        } else this.currentVolume = volumeMax;
    }

    public void DecreaseVolume() {
        if (currentVolume > volumeMin) {
            this.currentVolume--;
        } else this.currentVolume = volumeMin;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation >= stationMax) {
            this.currentStation = stationMax;
        }
        if (currentStation <= stationMin) {
            this.currentStation = stationMin;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void NextStation() {
        if (currentStation < stationMax) {
            this.currentStation++;
        } else {
            this.currentStation = stationMin;
        }
    }

    public void PrevStation() {

        if (currentStation > stationMin) {
            this.currentStation--;
        } else {
            this.currentStation = stationMax;
        }
    }

    public void Station() {
        this.currentStation = getCurrentStation();
    }
}