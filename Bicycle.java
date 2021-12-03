package com.dnpass.corejavatraining.day4.Bike;

public class Bicycle {
           private int cadence;
           private int gear;
           private int speed;
           private boolean valid;
           
      public Bicycle(int startCadence,int startSpeed,int startGear) {
    	  cadence=startCadence;
    	  speed=startSpeed;
    	  gear=startGear;
      }
      
      public void applyBrakes(int decrement ) {
    	  speed -= decrement;
      }
      
      public void speedUp(int increment) {
    	  speed+= increment;
      }
      
      public void printDescription() {
    	  System.out.println("\nBike is "+"in gear "+this.gear+" with a cadence of "+this.cadence+" and travelling at a speed of "+this.speed);
      }

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
      
    public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
    
    public boolean isValid() {
    	return valid;
    }
}
