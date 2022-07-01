package ua.com.foxminded.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, String color) {
		super(name, yearOfProduction, price, weight, color);
	}

	@Override
	public String toString() {
		return "PassengerCar [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price
				+ ", weight=" + weight + ", color=" + color.colorName + ", distanceOnService=" + distanceOnService + "]";
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 10000) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void service() {
		if (distanceOnService > 10000) {
			distanceOnService = 0;
		}
}	
	
}
