package Diary;

import java.util.Map;

public class DiaryNote {

    private String humor;
    private String weather;
    private int numberHours;
    private int dayOfMonth;

    public DiaryNote(String humor, String weather, int numberHours) {
        this.humor = humor;
        this.weather = weather;
        this.numberHours = numberHours;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getNumberHours() {
        return numberHours;
    }

    public void setNumberHours(int numberHours) {
        this.numberHours = numberHours;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    @Override
    public String toString() {
        return " : I was " + humor +
                " because I played for " + numberHours + " hours"
                + " and it was " +weather;

    }
}
