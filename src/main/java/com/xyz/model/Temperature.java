package com.xyz.model;

import java.util.ArrayList;
import java.util.List;

public class Temperature {
    private City city;
    private String cod;
    private double message;
    private int cnt;
    private List<ListProp> list;
    
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public double getMessage() {
		return message;
	}
	public void setMessage(double message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<ListProp> getList() {
		return list;
	}
	public void setList(List<ListProp> list) {
		this.list = list;
	}
}
	