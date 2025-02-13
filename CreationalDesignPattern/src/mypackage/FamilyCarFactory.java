package mypackage;

public class FamilyCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new FamilyEngine();
	}

	@Override
	public Tires createTires() {
		return new FamilyTires();
	}
}
