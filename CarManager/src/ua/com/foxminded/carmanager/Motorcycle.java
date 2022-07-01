package ua.com.foxminded.carmanager;

import java.util.Objects;

import javax.imageio.IIOException;

public abstract class Motorcycle {

	String name;
	int yearOfProduction;
	int ptice;
	int weight;
	Color color;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;
	protected int distanceOnService = 0;

	public Motorcycle(String name, int yearOfProduction, int ptice, int weight, String color, String engineType) {
		super();
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.ptice = ptice;
		this.weight = weight;
		this.color = Color.valueOf(color.replaceAll(" ", "").toUpperCase());
		this.engineType = engineType;
	}

	public void addDistance(int additinalDistance) throws IIOException {
		distance += additinalDistance;
		addDistanceOnService(additinalDistance);
		if (additinalDistance < 0) {
			throw new IIOException(name, null);	
		}
	}
	
	public void addDistance(double additinalDistance) throws IIOException {
		distance += additinalDistance;
		addDistanceOnService(additinalDistance);
		if (additinalDistance < 0) {
			throw new IIOException(name, null);	
		}
	}
	
		public void addDistanceOnService(int additinalDistance) throws IIOException {
			distanceOnService += additinalDistance;
			if (additinalDistance < 0) {
				throw new IIOException(name, null);	
			}
		
		}
		
		public void addDistanceOnService(double additinalDistance) throws IIOException {
			distanceOnService += additinalDistance;
			if (additinalDistance < 0) {
				throw new IIOException(name, null);	
			}
		
		}

	public void destroyEngine() {
		if (distance >= 10000) {
			isReadyToDrive = false;
		}else {
			isReadyToDrive = true;
		}
	}

	public void repair() {
		isReadyToDrive = true;
	}
	
	public void paintMoto(String newColor) {
		this.color = Color.valueOf(newColor.toUpperCase().replace(" ", ""));
	}
	
	public abstract void service();
	
	public abstract void isReadyToService();

	public int getDistanceOnService() {
		return distanceOnService;
	}
	
	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", ptice=" + ptice + ", weight="
				+ weight + ", color=" + color.colorName + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, distance, isReadyToDrive);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && distance == other.distance && isReadyToDrive == other.isReadyToDrive;
	}

}
