package com.generator;

import java.util.Random;

import com.vignett.BusVignett;
import com.vignett.CarVignett;
import com.vignett.TruckVignett;
import com.vignett.Vignett;
import com.vignettTaskExeptions.InvalidVignettException;

public class Generator {
	
	private int generator;
	
	public Generator() {
		this.generator = new Random().nextInt(3)+1;
	}

	public Vignett gnerateRandomVignetts() throws InvalidVignettException {
		Vignett temp = null;

		switch (this.generator) {
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
			System.out.println("Something went wrong !");
			break;
		}
		return temp;
	}

	private String typeGenerator() {
		String type = "";
	

		switch (this.generator) {
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
}
