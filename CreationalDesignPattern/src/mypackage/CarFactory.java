package mypackage;

//Abstract Factory Interface
interface CarFactory {
	Engine createEngine();
	Tires createTires();
}
