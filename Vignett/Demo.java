import Vignett.src.com.tankStation.Tankstation;
import Vignett.src.*;
import Vignett.src.com.driver.*;
import Vignett.src.com.vehicles.*;


public class Demo {

	public static void main(String[] args) {
		try {
			try {
				Tankstation tank = new Tankstation(500000.0);
				tank.getVignettes();
			} catch (InvalidTankstationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (InvalidVignettException e) {
			e.getMessage();
		}
	}
}
