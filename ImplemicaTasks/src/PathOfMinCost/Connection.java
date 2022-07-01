package PathOfMinCost;

public class Connection {

	// Connection we'll store the name of starting city and destination city and
	// cost of path between them
	City src;
	City dst;
	int cost;

	// constructor
	public Connection(City src, City dst, int cost) {
		super();
		this.src = src;
		this.dst = dst;
		this.cost = cost;
	}

	// Getting the cost of connection between two cities
	public int getCost() {
		return cost;
	}
}
