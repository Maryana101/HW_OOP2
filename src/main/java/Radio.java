public class Radio {
    private int Station = 0;
    private int volume = 0;

    public int getStation() {
        return Station;
    }

    public void setStation(int newStation) {
        if (newStation >= 0 && newStation <= 9) {
            Station = newStation;
        } else {
            return;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            volume = newVolume;
        } else return;
    }

    public void increaseVolume() {
        int currentVolume = getVolume();
        if (currentVolume < 100) {
            currentVolume++;
            setVolume(currentVolume);
        }
    }

    public void decreaseVolume() {
        int currentVolume = getVolume();
        if (currentVolume > 0) {
            currentVolume--;
            setVolume(currentVolume);
        }
    }

    public void next() {
        int currentStation = getStation();
        if (currentStation < 9) {
            currentStation++;
            setStation(currentStation);
        } else {
            setStation(0);
        }
    }

    public void prev() {
        int currentStation = getStation();
        if (currentStation > 0) {
            currentStation--;
            setStation(currentStation);
        } else {
            setStation(9);
        }
    }

}
