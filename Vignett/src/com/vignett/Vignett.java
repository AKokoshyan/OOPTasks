package com.vignett;

import java.time.LocalDate;
import java.time.Period;

import com.vignettTaskExeptions.InvalidVignettException;

public abstract class Vignett {

	protected String color;
	protected LocalDate issueDate;
	protected LocalDate expairDate;
	protected double price;

	public Vignett(String color) throws InvalidVignettException {
		setColor(color);
		this.issueDate = LocalDate.now();

	}

	private void setColor(String color) throws InvalidVignettException {
		if (color.toLowerCase().trim().equals("red") || color.toLowerCase().trim().equals("blue")
				|| color.toLowerCase().trim().equals("yellow")) {
			this.color = color;
		} else {
			throw new InvalidVignettException();
		}

	}

	abstract int stickVignett();

	public double getPrice() {
		return this.price;
	}

	public String toString() {
		String objectToText = "The color of vignett is " + this.color + " the issue date is " + this.issueDate
				+ " and expaird date is " + this.expairDate + " the price of the vignett is " + this.price;
		return objectToText;
	}

}
