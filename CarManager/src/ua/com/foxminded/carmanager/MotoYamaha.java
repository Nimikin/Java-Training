package ua.com.foxminded.carmanager;

public class MotoYamaha extends Motorcycle {

	public MotoYamaha(String name, int yearOfProduction, int ptice, int weight, String color, String engineType) {
		super(name, yearOfProduction, ptice, weight, color, engineType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void isReadyToService() {
		if(distanceOnService > 8000) {
			System.out.println("WARNING! The MotoYamaha needs a service!");
	}
	}

	@Override
	public void service() {
		if (distanceOnService > 8000) {
				distanceOnService = 0;
			}
	}

}
