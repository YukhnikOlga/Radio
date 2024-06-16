import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMAxRadioStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);
        radio.setPrevRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationBeforeMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldUpVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);
        volume.setUpVolume();

        int expected = 12;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpVolumeAfterMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.setUpVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);
        volume.setDownVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeBeforeMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.setDownVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(110);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}