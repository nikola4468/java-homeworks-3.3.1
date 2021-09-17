package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class RadioInside {

    private int volumeMax = 100;
    private int volumeMin = 0;
    public int currentVolume;
    public int stations;
    private int stationMax = 9;
    private int stationMin = 0;
    public int currentStation;

    public RadioInside(int stations) {
        this.stations = stations;
        this.stationMax = stations - 1;
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