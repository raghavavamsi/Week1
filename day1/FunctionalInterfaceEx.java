package day1;


@FunctionalInterface
interface Ixyz {
	public void met();
}
public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		met9(() -> {
			System.out.println("This is Lambda");
		});
	}
	
	static void met9(Ixyz oxyz) {
		oxyz.met();
	}
}