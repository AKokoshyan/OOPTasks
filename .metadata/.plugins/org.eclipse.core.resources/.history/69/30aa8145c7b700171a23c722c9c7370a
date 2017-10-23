package com.driver;

import java.util.ArrayList;
import java.util.List;

import com.tankStation.Tankstation;
import com.vehicles.Vehicle;
import com.vignettTaskExeptions.InvalidDriverDataException;

public class Driver {

	private String name;
	private List<Vehicle> vehicles;
	private double money;
	private Tankstation tankstation;

	public Driver(String name, double money, Tankstation tankstation) throws InvalidDriverDataException {
		setName(name);
		setTankstation(tankstation);
		setMoney(money);
		this.vehicles = new ArrayList<Vehicle>();
	}

	private void setTankstation(Tankstation tankstation) throws InvalidDriverDataException {
		if (tankstation != null) {
			this.tankstation = tankstation;
		} else {
			throw new InvalidDriverDataException();
		}

	}

	private void setMoney(double money) throws InvalidDriverDataException {
		if (money > 0) {
			this.money = money;
		} else {
			throw new InvalidDriverDataException();
		}
	}

	private void setName(String name) throws InvalidDriverDataException {
		if (name != null || name != "") {
			this.name = name;
		} else {
			throw new InvalidDriverDataException();
		}
	}

	public void setDriverVehicle(Vehicle vehicle) {
		if (vehicle != null) {
			this.vehicles.add(vehicle);
		}
	}

	public void byeVignettForAllVehicles() {
		
	}
	
	public void byeVignettForOneVehicle() {
		
	}

}