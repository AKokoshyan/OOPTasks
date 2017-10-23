package com.vehicles;

import com.vignett.CarVignett;
import com.vignett.Vignett;
import com.vignettTaskExeptions.InvalidVehicleException;
import com.vignettTaskExeptions.InvalidVignettException;

public class Car extends Vehicle {

private CarVignett vignett;
	
	public Car(String model, int yearManufacture) throws InvalidVehicleException {
		super(model, yearManufacture);
		hasVignett(false);;
	}

	@Override
	protected void hasVignett(boolean hasVignett) {
		super.hasVignett = hasVignett;			
	}
	
	public void setVignett(CarVignett vignett) throws InvalidVignettException {
		if(vignett instanceof CarVignett && vignett!=null) {
			this.vignett = vignett;
			hasVignett(true);
		}else {
			throw new InvalidVignettException();
		}
	}

}
