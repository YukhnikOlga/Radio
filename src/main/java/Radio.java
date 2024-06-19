public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;
    private int minRadioStation;


    public Radio() {
        this.maxRadioStation = 9;
        this.minRadioStation = 0;
    }

    public Radio(int radioStationsCount) {
        this.maxRadioStation = radioStationsCount - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { // вперед. меньше 9 = +1, если равно 9 = 0
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = maxRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = minRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setUpVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 0;
    }

    public void setDownVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }
}
