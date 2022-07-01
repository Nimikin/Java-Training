package ua.com.foxminded.carmanager;

public class MotoSuzuki extends Motorcycle {

	public MotoSuzuki(String name, int yearOfProduction, int ptice, int weight, String color, String engineType) {
		super(name, yearOfProduction, ptice, weight, color, engineType);
	}

	
	
	@Override
	public void isReadyToService() {
		if(distanceOnService > 8000) {
			System.out.println("WARNING! The MotoSuzuki needs a service!");
	}
	}

	@Override
	public void service() {
		if (distanceOnService > 8000) {
				distanceOnService = 0;
			}
	}
}
