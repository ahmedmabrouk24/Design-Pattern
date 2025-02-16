public class DatabaseConnection {

	private static DatabaseConnection instance;

	private DatabaseConnection() {
		System.out.println("Connecting to database...");
	}

	public static DatabaseConnection getInstance() {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
}