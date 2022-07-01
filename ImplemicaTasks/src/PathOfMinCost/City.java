package PathOfMinCost;

import java.util.*;

public class City {

	// The city which we want to add must have a name and own index
	String city;
	int cityIndex;
	Set<Connection> connections = new LinkedHashSet<>();

	// constructor
	public City(String city, int cityIndex) {
		super();
		this.city = city;
		this.cityIndex = cityIndex;
	}

	// Methods

	// Adding connections between our city and the nearest ones.
	public void addConnections(Connection connection) {
		connections.add(connection);
	}

	// Getters
	public Set<Connection> getConnections() {
		return connections;
	}

	public int getCityIndex() {
		return cityIndex;
	}

	// hashcode and equals. I'll need them when I'll be iterating through the path
	// and check if we've gone through the current city already or if it's not.

	@Override
	public int hashCode() {
		return Objects.hash(city, cityIndex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(city, other.city) && cityIndex == other.cityIndex;
	}
}
