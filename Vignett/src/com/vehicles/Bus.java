package com.vehicles;

import com.vignett.BusVignett;
import com.vignett.CarVignett;
import com.vignett.Vignett;
import com.vignettTaskExeptions.InvalidVehicleException;
import com.vignettTaskExeptions.InvalidVignettException;

public class Bus extends Vehicle{

	private BusVignett vignett;
	
	public Bus(String model, int yearManufacture) throws InvalidVehicleException {
		super(model, yearManufacture);
		hasVignett(false);;
	}

	@Override
	protected void hasVignett(boolean hasVignett) {
		super.hasVignett = hasVignett;			
	}
	
	public void setVignett(BusVignett vignett) throws InvalidVignettException {
		if(vignett instanceof BusVignett && vignett!=null) {
			this.vignett = vignett;
			hasVignett(true);;
		}else {
			throw new InvalidVignettException();
		}
	}

}
