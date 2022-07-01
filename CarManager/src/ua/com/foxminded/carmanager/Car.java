package ua.com.foxminded.carmanager;

import java.util.Objects;

import javax.imageio.IIOException;

public abstract class Car implements Serviceable{
	
	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	public Car(String name, int yearOfProduction, int price, int weight, String color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color);
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
		

	public int getDistanceOnService() {
			return distanceOnService;
		}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color.colorName + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, weight, yearOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && Objects.equals(name, other.name) && price == other.price
				&& weight == other.weight && yearOfProduction == other.yearOfProduction;
	}
	
	
	
}
