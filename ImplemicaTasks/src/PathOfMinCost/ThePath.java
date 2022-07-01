package PathOfMinCost;

import java.util.*;

public class ThePath {
	Set<City> path = new LinkedHashSet<>();

	// Method to add certain city to our path.
	public void addCity(City city) {
		path.add(city);
	}

	// Calculating the path from one city to another.
	public int getPathOfMinCost(ThePath path, City src, City dst) {

		// costSum - a variable which will return the minimum cost for our path
		// currentCost - variable we need to compare the cost of each connection to our
		// city
		int costSum = 0;
		int currentCost = 0;

		// Checking if we need to go in reverse direction from node with higher index to
		// the node with lower index
		if (src.cityIndex > dst.cityIndex) {
			costSum = getPathOfMinCostReverse(path, src, dst);
			return costSum;
		} else

			// Splitting our path to cities
			for (City city : path.getPath()) {
				// Checking if we already got to the destination city. If yes - quit from
				// iteration and return the sum cost of path.
				if (city.equals(dst)) {
					return costSum;
				}
				// Checking if the city we have in iteration is our start city so we can start
				// our path.
				if (city.equals(src)) {
					// If yes - split it to the connections it have with other cities
					for (Connection c : city.getConnections()) {
						// A check to help us not go backwards
						if (c.src.cityIndex < city.cityIndex || c.dst.cityIndex < city.cityIndex) {
							continue;
						}
						// If this our first iteration - we set the current cities cost to currentCost
						// variable to to compare costs in next iteration
						if (currentCost == 0) {
							currentCost = c.getCost();
							// If the cost of path to another city is lower than to the first city - we
							// choose its cost and add to costSum
						} else if (c.getCost() <= currentCost) {
							currentCost = c.getCost();
							// If the cost of path to another city if bigger than the to the first - we skip
							// it and go to the next iteration
						} else if (c.getCost() > currentCost) {
							continue;
						}
					}
					// When we compare all the paths from current city and chose the cheaper one -
					// we add its value to costSum
					costSum += currentCost;
				}
				// Check if the city we currently iterating is in the middle of our path and not
				// beyond it
				if (!city.equals(src) && !city.equals(dst) && city.getCityIndex() > src.getCityIndex()) {
					for (Connection c : city.getConnections()) {
						// Again, checking if we are not going backwards
						if (c.src.cityIndex < city.cityIndex || c.dst.cityIndex < city.cityIndex) {
							continue;
						}
						// Same as it was for starting city
						if (currentCost == 0) {
							currentCost = c.getCost();
						} else if (c.getCost() <= currentCost) {
							currentCost = c.getCost();
						} else if (c.getCost() > currentCost) {
							continue;
						}
					}
					costSum += currentCost;
				}
			}
		// When all iterations is done and we checked all our paths to the destination
		// and chose the cheapest - we return the sum of chosen paths
		return costSum;
	}

	// Method that does the same that the previous one, but in case if we want to go
	// in another direction: from city with the bigger index to city with the
	// smaller
	public int getPathOfMinCostReverse(ThePath path, City src, City dst) {

		int costSum = 0;
		int currentCost = 0;

		LinkedList<City> list = new LinkedList<>(path.getPath());
		Iterator<City> itr = list.descendingIterator();
		path.getPath().clear();
		while (itr.hasNext()) {
			path.addCity(itr.next());
		}

		for (City city : path.getPath()) {
			if (city.equals(dst)) {
				return costSum;
			}
			if (city.equals(src)) {
				for (Connection c : city.getConnections()) {
					// Changed the direction of verification of indexes from less to more to see if
					// we're not going backwards
					if (c.src.cityIndex > city.cityIndex || c.dst.cityIndex > city.cityIndex) {
						continue;
					}
					// Same as it was in the previous method
					if (currentCost == 0) {
						currentCost = c.getCost();
					} else if (c.getCost() <= currentCost) {
						currentCost = c.getCost();
					} else if (c.getCost() > currentCost) {
						continue;
					}
				}
				costSum += currentCost;
			}
			// Same as it was in previous method, only change the verification of indexes
			// from less to more
			if (!city.equals(src) && !city.equals(dst) && city.getCityIndex() < src.getCityIndex()) {
				for (Connection c : city.getConnections()) {
					if (c.src.cityIndex > city.cityIndex || c.dst.cityIndex > city.cityIndex) {
						continue;
					}
					if (currentCost == 0) {
						currentCost = c.getCost();
					} else if (c.getCost() <= currentCost) {
						currentCost = c.getCost();
					} else if (c.getCost() > currentCost) {
						continue;
					}
				}
				costSum += currentCost;
			}
		}
		return costSum;
	}

	// Getting the set of cities we added to our path. I used it to reverse the path
	// in the case we want to go in another direction - from city with the bigger
	// index to city with the smaller one
	public Set<City> getPath() {
		return path;
	}
}
