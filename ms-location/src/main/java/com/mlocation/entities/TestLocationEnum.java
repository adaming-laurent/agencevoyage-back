package com.mlocation.entities;

public class TestLocationEnum {
	public static void main(String[] args) {
		Location l1=new Location();
		l1.setLocationCode("237TA");
		l1.setLocationName("HouseTA");
		l1.setLocationType(LocationType.Seaport);
		System.out.println(l1.toString());
	}
}
