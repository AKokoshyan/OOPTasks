package com.vehicles;

import com.vignett.CarVignett;
import com.vignett.TruckVignett;
import com.vignett.Vignett;
import com.vignettTaskExeptions.InvalidVehicleException;
import com.vignettTaskExeptions.InvalidVignettException;

public class Truck extends Vehicle {

	private TruckVignett vignett;
	
	public Truck(String model, int yearManufacture) throws InvalidVehicleException {
		super(model, yearManufacture);
		hasVignett(false);;
	}

	@Override
	protected void hasVignett(boolean hasVignett) {
		super.hasVignett = hasVignett;			
	}
	
	public void setVignett(TruckVignett vignett) throws InvalidVignettException {
		if(vignett instanceof TruckVignett && vignett!=null) {
			this.vignett = vignett;
			hasVignett(true);;
		}else {
			throw new InvalidVignettException();
		}
	}
}
