package com.vignett;

import com.vignettTaskExeptions.InvalidVignettException;

public class TruckVignett extends Vignett {

	private static final double PRICE_PER_DAY = 7.0;
	private static final double PRICE_PER_MONTH = PRICE_PER_DAY  * 10;
	private static final double PRICE_PER_YEAR = PRICE_PER_MONTH * 6;

	public TruckVignett(String type) throws InvalidVignettException {
		super("red");
		setVignettType(type);
	}

	private void setVignettType(String type) throws InvalidVignettException {
		if (type.trim().toLowerCase().equals("yearly") || type.trim().toLowerCase().equals("monthly")
				|| type.trim().toLowerCase().equals("dayly")) {
			if (type.trim().toLowerCase().equals("dayly")) {
				super.price = PRICE_PER_DAY;
				super.expairDate = super.issueDate.plusDays(1);
			} else if (type.trim().toLowerCase().equals("monthly")) {
				super.price = PRICE_PER_MONTH;
				super.expairDate = super.issueDate.plusMonths(1);
			} else if (type.trim().toLowerCase().equals("yearly")) {
				super.price = PRICE_PER_YEAR;
				super.expairDate = super.issueDate.plusYears(1);
			}
		} else {
			throw new InvalidVignettException();
		}
	}

	public int stickVignett() {
		int timeToStickVignett = 10;
		return timeToStickVignett;
	}
}
