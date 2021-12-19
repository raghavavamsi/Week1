package factoryPattern;

public class Unisys {
	abstract class Delta {
		Delta(){
			System.out.println("Delta() constructor");
		}
	
	}

	public class Unisy extends Delta{
		Unisy(){
			System.out.println("Teta() constructor");
		}
		
		public static void main(String[] args) {
			Unisys obj = new Unisys();
		}
	}
}
