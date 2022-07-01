package PathOfMinCost;

public class Main {
	public static void main(String[] args) {

		// Cities we're working with and their indexes
		City gdansk = new City("gdansk", 1);
		City bydgoszcz = new City("bydgoszcz", 2);
		City torun = new City("torun", 3);
		City warszawa = new City("warszawa", 4);

		// Cities connected to gdansk and cost of path to reach them
		Connection gdanskBydgoszcz = new Connection(gdansk, bydgoszcz, 1);
		Connection gdanskTorun = new Connection(gdansk, torun, 3);
		gdansk.addConnections(gdanskBydgoszcz);
		gdansk.addConnections(gdanskTorun);

		// Cities connected to bydgoszcz and cost of path to reach them
		Connection bydgoszczGdansk = new Connection(bydgoszcz, gdansk, 1);
		Connection bydgoszczTorun = new Connection(bydgoszcz, torun, 1);
		Connection bydgoszczWarszawa = new Connection(bydgoszcz, warszawa, 4);
		bydgoszcz.addConnections(bydgoszczGdansk);
		bydgoszcz.addConnections(bydgoszczTorun);
		bydgoszcz.addConnections(bydgoszczWarszawa);

		// Cities connected to torun and cost of path to reach them
		Connection torunGdansk = new Connection(torun, gdansk, 3);
		Connection torunBydgoszcz = new Connection(torun, bydgoszcz, 1);
		Connection torunWarszawa = new Connection(torun, warszawa, 1);
		torun.addConnections(torunGdansk);
		torun.addConnections(torunBydgoszcz);
		torun.addConnections(torunWarszawa);

		// Cities connected to warszawa and cost of path to reach them
		Connection warszawaBydgoszcz = new Connection(warszawa, bydgoszcz, 4);
		Connection warszawaTorun = new Connection(warszawa, torun, 1);
		warszawa.addConnections(warszawaBydgoszcz);
		warszawa.addConnections(warszawaTorun);

		// Connecting all cities and connections into ThePath.
		ThePath path = new ThePath();
		path.addCity(gdansk);
		path.addCity(bydgoszcz);
		path.addCity(torun);
		path.addCity(warszawa);

		// Paths needed to be found.    (Total cities on our path, starting city, destination city)
		int dToW = path.getPathOfMinCost(path, gdansk, warszawa);
		int bToW = path.getPathOfMinCost(path, bydgoszcz, warszawa);

		// Checking if we able to go in another direction.
		int wToG = path.getPathOfMinCost(path, warszawa, gdansk);

		System.out.println(dToW + "\n" + bToW + "\n" + wToG);
	}
}
