import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setStation(11);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.next();
        int actual = radio.getStation();
        int expected = 6;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetNextRadioStationAfterLastStation() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.next();
        int actual = radio.getStation();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetPrevRadioStationBeforeFirstStation() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.prev();
        int actual = radio.getStation();
        int expected = 9;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setStation(4);
        radio.prev();
        int actual = radio.getStation();
        int expected = 3;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setVolume(25);
        int actual = radio.getVolume();
        int expected = 25;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(101);
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(25);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 26;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(30);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 29;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 100;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }
}
