package ua.com.foxminded.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, String color) {
		super(name, yearOfProduction, price, weight, color);
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 50000) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void service() {
		if (distanceOnService > 50000) {
			distanceOnService = 0;
		}
	}

	
	
	
}
