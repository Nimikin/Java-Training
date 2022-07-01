package ua.com.foxminded.carmanager;

import javax.imageio.IIOException;

public class Tractor implements Serviceable{
	
	int distance = 0;
	int distanceOnService = 0;

	public Tractor(int distance, int distanceOnService) {
		super();
		this.distance = distance;
		this.distanceOnService = distanceOnService;
	}

	@Override
	public String toString() {
		return "Tractor [distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 8000) {
			System.out.println("WARNING! The Tractor needs a service!");
	}
		return false;
	}

	@Override
	public void service() {
		if (distanceOnService > 8000) {
			distanceOnService = 0;
		}
	}

	@Override
	public int getDistanceOnService() {
		return distanceOnService;
	}

	@Override
	public void addDistance(int additinalDistance) throws IIOException {
		distance += additinalDistance;
		addDistanceOnService(additinalDistance);
		if (additinalDistance < 0) {
			throw new IIOException(null);
		}
	}

	@Override
	public void addDistance(double additinalDistance) throws IIOException {
		distance += additinalDistance;
		addDistanceOnService(additinalDistance);
		if (additinalDistance < 0) {
			throw new IIOException(null);	
		}
	}

	@Override
	public void addDistanceOnService(int additinalDistance) throws IIOException {
		distanceOnService += additinalDistance;
		if (additinalDistance < 0) {
			throw new IIOException(null);	
		}
	
	}

	@Override
	public void addDistanceOnService(double additinalDistance) throws IIOException {
		distanceOnService += additinalDistance;
		if (additinalDistance < 0) {
			throw new IIOException(null);	
		}
	
	}
}
