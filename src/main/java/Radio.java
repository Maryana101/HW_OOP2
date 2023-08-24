public class Radio {
    private int count=10;
    private int firstStation = 0;
    private int lastStation = count -1;
    private int currentStation = firstStation;
    private int volume = 0;

    public Radio() {

    }
    public Radio (int count){
        this.count=count;
        lastStation=count-1;
        currentStation=firstStation;
    }
    public int getCurrentStationStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= firstStation && newStation <= lastStation) {
            currentStation = newStation;
        } else {
            return;
        }
    }
    public int getFirstStation() {
        return firstStation;
    }

    public int getLastStation() {
        return lastStation;
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
        int currentStation = getCurrentStationStation();
        if (currentStation < lastStation) {
            currentStation++;
            setCurrentStation(currentStation);
        } else {
            setCurrentStation(firstStation);
        }
    }

    public void prev() {
        int currentStation = getCurrentStationStation();
        if (currentStation > firstStation) {
            currentStation--;
            setCurrentStation(currentStation);
        } else {
            setCurrentStation(lastStation);
        }
    }

}
