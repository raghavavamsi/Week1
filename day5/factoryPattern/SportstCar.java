package factoryPattern;

public class SportstCar extends Car {
	SportstCar() {
		super(CarType.SPORTS);
		construct();
	}
	
	@Override
    protected void construct() {
        System.out.println("Building Sports car");
        // add accessories
    }


}
