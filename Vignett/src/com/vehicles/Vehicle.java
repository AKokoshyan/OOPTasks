package com.vehicles;

import com.vignettTaskExeptions.InvalidVehicleException;

public abstract class Vehicle {
	private String model;
	protected boolean hasVignett;
	private int yearManufacture;
	
	public Vehicle(String model,int yearManufacture) throws InvalidVehicleException {
		setModel(model);
		setYearManufactured(yearManufacture);
	}

	private void setYearManufactured(int yearManufacture) throws InvalidVehicleException {
		if(yearManufacture>=1990||yearManufacture<=2017) {
			this.yearManufacture = yearManufacture;
		}else {
			throw new InvalidVehicleException();
		}
		
	}

	private void setModel(String model) throws InvalidVehicleException {
		if(model!=null||model!="") {
			this.model = model;
		}else {
			throw new InvalidVehicleException();
		}
	}
	
	protected abstract void hasVignett(boolean hasVignett);
	
	@Override
	public String toString() {
		String text = this.model + " " + this.yearManufacture + " " + this.hasVignett;
		return text;
	}
}
