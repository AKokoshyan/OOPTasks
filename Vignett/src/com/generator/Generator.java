package com.generator;

import java.util.Random;

import com.vehicles.Bus;
import com.vehicles.Car;
import com.vehicles.Truck;
import com.vehicles.Vehicle;
import com.vignett.BusVignett;
import com.vignett.CarVignett;
import com.vignett.TruckVignett;
import com.vignett.Vignett;
import com.vignettTaskExeptions.InvalidDriverDataException;
import com.vignettTaskExeptions.InvalidVehicleException;
import com.vignettTaskExeptions.InvalidVignettException;

public class Generator {

	private static final Random generator = new Random();

	public static Vignett gnerateRandomVignetts() throws InvalidVignettException {
		Vignett temp = null;

		int randomNumber = generator.nextInt(3) + 1;

		switch (randomNumber) {
		case 1:
			temp = new CarVignett(typeGenerator());
			break;
		case 2:
			temp = new TruckVignett(typeGenerator());
			break;
		case 3:
			temp = new BusVignett(typeGenerator());
			break;
		default:
			throw new InvalidVignettException();
		}
		return temp;
	}

	private static String typeGenerator() {
		String type = "";

		int x = generator.nextInt(3) + 1;

		switch (x) {
		case 1:
			type = "yearly";
			break;
		case 2:
			type = "monthly";
			break;
		case 3:
			type = "dayly";
			break;
		default:
			System.out.println("Something went wrong!");
			break;
		}
		return type;
	}

	public static String generateRandomDriverName() throws InvalidDriverDataException {
		String firstName = "";
		String secondName = "";

		int x = generator.nextInt(5) + 1;

		switch (x) {
		case 1:
			firstName = "Gosho";
			break;
		case 2:
			firstName = "Ivan";
			break;
		case 3:
			firstName = "Petkan";
			break;
		case 4:
			firstName = "Petrocvet";
			break;
		case 5:
			firstName = "Jivko";
			break;
		default:
			throw new InvalidDriverDataException();
		}
		int y = generator.nextInt(5) + 1;

		switch (y) {
		case 1:
			secondName = "Ihtimanov";
			break;
		case 2:
			secondName = "Georgiev";
			break;
		case 3:
			secondName = "Cvetanov";
			break;
		case 4:
			secondName = "Deonisiev";
			break;
		case 5:
			secondName = "Djibrev";
			break;
		default:
			throw new InvalidDriverDataException();
		}

		String fullName = firstName + " " + secondName;
		return fullName;

	}

	public static double generateRandomDriverMoney() throws InvalidDriverDataException {
		int randomNumber = generator.nextInt(3) + 1;

		double money = 0.0;

		switch (randomNumber) {
		case 1:
			money = 5000.0;
			break;
		case 2:
			money = 7500.0;
			break;
		case 3:
			money = 15000.0;
			break;
		default:
			throw new InvalidDriverDataException();
		}
		return money;
	}

	public static Vehicle generateRandomVehicle() throws InvalidVehicleException {
		Vehicle temp = null;

		int randomNumber = generator.nextInt(3) + 1;

		switch (randomNumber) {
		case 1:
			temp = new Car(generateRandomCarModel(), generator.nextInt(27) + 1990);
			break;
		case 2:
			temp = new Truck(generateRandomTruckModel(), generator.nextInt(27) + 1990);
			break;
		case 3:
			temp = new Bus(generateRandomBusModel(), generator.nextInt(27) + 1990);
			break;
		default:
			throw new InvalidVehicleException();
		}
		return temp;
	}

	private static String generateRandomCarModel() throws InvalidVehicleException {
		String model = "";

		int randomNumber = generator.nextInt(3) + 1;

		switch (randomNumber) {
		case 1:
			model = "Ferrari";
			break;
		case 2:
			model = "Lamborghini";
			break;
		case 3:
			model = "Pagani";
			break;
		default:
			throw new InvalidVehicleException();
		}

		return model;
	}
	
	private static String generateRandomTruckModel() throws InvalidVehicleException {
		String model = "";

		int randomNumber = generator.nextInt(3) + 1;

		switch (randomNumber) {
		case 1:
			model = "MAN";
			break;
		case 2:
			model = "Volvo";
			break;
		case 3:
			model = "Mercedes";
			break;
		default:
			throw new InvalidVehicleException();
		}

		return model;
	}
	
	private static String generateRandomBusModel() throws InvalidVehicleException {
		String model = "";

		int randomNumber = generator.nextInt(3) + 1;

		switch (randomNumber) {
		case 1:
			model = "Ikarus";
			break;
		case 2:
			model = "Chavdar";
			break;
		case 3:
			model = "Solaris";
			break;
		default:
			throw new InvalidVehicleException();
		}

		return model;
	}
}
