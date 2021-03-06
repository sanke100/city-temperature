package com.xyz.model;

import java.util.Date;
import java.util.List;

public class ListProp {
    private int dt;
    private Temp temp;
    private double pressure;
    private int humidity;
    private List<Weather> weather;
    private double speed;
    private int deg;
    private int clouds;
    private double rain;
    private double snow;
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public Temp getTemp() {
		return temp;
	}
	public void setTemp(Temp temp) {
		this.temp = temp;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
	}
	public int getClouds() {
		return clouds;
	}
	public void setClouds(int clouds) {
		this.clouds = clouds;
	}
	public double getRain() {
		return rain;
	}
	public void setRain(double rain) {
		this.rain = rain;
	}
	public double getSnow() {
		return snow;
	}
	public void setSnow(double snow) {
		this.snow = snow;
	}
}
