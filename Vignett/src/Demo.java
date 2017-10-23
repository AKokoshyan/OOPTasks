import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.driver.Driver;
import com.generator.Generator;
import com.tankStation.Tankstation;
import com.vehicles.Vehicle;
import com.vignettTaskExeptions.InvalidDriverDataException;
import com.vignettTaskExeptions.InvalidTankstationException;
import com.vignettTaskExeptions.InvalidVehicleException;
import com.vignettTaskExeptions.InvalidVignettException;

public class Demo {

	public static void main(String[] args) {
		try {
			Tankstation tankStation = new Tankstation(20000.0);

			List<Driver> driverList = new ArrayList<>();

			for (int i = 0; i <= 20; i++) {
				Driver tempDriver = new Driver(Generator.generateRandomDriverName(),
						Generator.generateRandomDriverMoney(), tankStation);
				driverList.add(tempDriver);
			}

			List<Vehicle> listOfVehicles = new ArrayList<>();

			for (int i = 0; i < 200; i++) {
				listOfVehicles.add(Generator.generateRandomVehicle());
			}

			int k = 1;
			for (int i = 0; i < driverList.size() - 1; i++) {
				for (int j = 0; j < 10; j++) {
					driverList.get(i).setDriverVehicle(listOfVehicles.get(j));
					listOfVehicles.remove(j);
				}
				System.out.println(k++);
				driverList.get(i).getDriverVehicles();
			}

		} catch (InvalidVignettException e) {
			e.getMessage();
		} catch (InvalidTankstationException e) {
			e.getMessage();
		} catch (InvalidDriverDataException e) {
			e.getMessage();
		} catch (InvalidVehicleException e) {
			e.getMessage();
		}
	}
}
