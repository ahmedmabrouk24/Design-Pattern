
public class SportsCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new SportsEngine();
	}

	@Override
	public Tires createTires() {
		return new SportsTires();
	}
}