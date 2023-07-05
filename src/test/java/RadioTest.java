import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBeforeMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBeforeMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }






    @Test
    public void shouldDownValidVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        volume.downVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseValidVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        volume.increaseVolume();

        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.downVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.downVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownBeforeMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);
        volume.downVolume();

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseBeforeMaxLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownAboveMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);
        volume.downVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAboveMinLimitVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);
        volume.increaseVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }





    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.nextRadioStation();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.prevRadioStation();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextBeforeMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevBeforeMaxLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextAboveMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevAboveMinLimitRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}
