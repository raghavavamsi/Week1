package factoryPattern;

public class FactoryPatternEg {
public static void main(String[] args) {
    	
    	Car sObj = Carfactory.buildCar(CarType.SMALL);
    	
    	Car snObj = Carfactory.buildCar(CarType.SEDAN);
    	
    	Car lObj = Carfactory.buildCar(CarType.LUXURY);
    	
    	Car spObj = Carfactory.buildCar(CarType.SPORTS);
    	
    	
    	//How to avoid printing of Class name along with hashcode
        System.out.println(sObj);
        
        System.out.println(snObj);
        
        System.out.println(lObj);
        
        System.out.println(spObj);
    }

}