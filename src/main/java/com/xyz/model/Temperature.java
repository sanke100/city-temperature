package com.xyz.model;

import java.util.ArrayList;
import java.util.List;

public class Temperature {
	 private String cod;
	 private float message;
	 private float cnt;
	 List < ListProp > list;
	 
	 public List<ListProp> getList() {
		return list;
	}

	public void setList(List<ListProp> list) {
		this.list = list;
	}

	City CityObject;


	 // Getter Methods 

	 public String getCod() {
	  return cod;
	 }

	 public float getMessage() {
	  return message;
	 }

	 public float getCnt() {
	  return cnt;
	 }

	 public City getCity() {
	  return CityObject;
	 }

	 // Setter Methods 

	 public void setCod(String cod) {
	  this.cod = cod;
	 }

	 public void setMessage(float message) {
	  this.message = message;
	 }

	 public void setCnt(float cnt) {
	  this.cnt = cnt;
	 }

	 public void setCity(City cityObject) {
	  this.CityObject = cityObject;
	 }
	}
	