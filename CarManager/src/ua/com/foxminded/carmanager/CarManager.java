package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.IIOException;

public class CarManager {

	public static void main(String[] args) throws IIOException {
/*
		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, "GREEN");

		Car renault = new Bus("Renault Laguna", 2007, 9700, 1600, "WHITE");
		
		Car renault2 = new Bus("Renault Laguna", 2007, 9700, 1600, "WHITE");
		/*
		Tractor tractor = new Tractor(0, 0);
		
		tractor.addDistance(9000);
		System.out.println(tractor);
		tractor.isReadyToService();
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(prius);
		cars.add(renault);
		cars.add(renault2);
		
		System.out.println(cars);
		
		prius.addDistance(11000);
		prius.addDistance(20.5);
		renault.addDistance(15000);
		
		
		System.out.println(prius);
		System.out.println(renault);
		
		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());

		prius.service();
		renault.service();
		
		System.out.println(prius);
		System.out.println(renault);
		*/
		
		//System.out.println(prius.equals(renault2));
		//System.out.println(renault.equals(renault2));
		
		Motorcycle suzuki = new MotoSuzuki("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel");
		Motorcycle yamaha = new MotoYamaha("Yamaha  FZ1", 2007, 9000, 700, "orangE ", "gas");

		List<Motorcycle> moto = new ArrayList<>();
		
		moto.add(yamaha);
		moto.add(suzuki);
		System.out.println(moto);
/*
		suzuki.addDistance(5000);
		yamaha.addDistance(10000);
		
		suzuki.destroyEngine();
		yamaha.destroyEngine();
		
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		suzuki.isReadyToService();
		yamaha.isReadyToService();
		
		suzuki.repair();
		yamaha.repair();
		
		yamaha.paintMoto("black");
		
		suzuki.service();
		yamaha.service();
		
		System.out.println(suzuki);
		System.out.println(yamaha);
		System.out.println(suzuki.equals(yamaha));*/
	}


}
