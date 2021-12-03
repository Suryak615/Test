package com.dnpass.corejavatraining.day4.Bike;

import java.util.Objects;

public class MountainBike extends Bicycle {
	private String suspension;
	
    public MountainBike(int startCadence,int startSpeed,int startGear,String suspensionType) {
    	super(startCadence,startSpeed,startGear);
    	this.setSuspension(suspensionType);
    }
    
    public String getSuspension() {
    	return this.suspension;
    }
    
    public void setSuspension(String suspensionType) {
    	Objects.requireNonNull(suspensionType, "suspensionType is null");
    	this.suspension = suspensionType;
    }
    
    public void printDescription() {
    	super.printDescription();
    	
    	System.out.println("The " + "MountainBike has a" + getSuspension() + " suspension.");
    }
}
