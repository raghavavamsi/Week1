package day3;

public class Day3Assignment4ReverseString {
	public static MyWrapper1 mw = new MyWrapper1();

	 

    public static void main(String[] args) {
        NotifyWait b = new NotifyWait();
        b.start();

 

        synchronized (mw) {
            try {
                mw.str = "VAMSI";
                System.out.println("The input string is : " + mw.str);
                mw.wait();
            } catch (Exception e) {
                System.out.println("Interrupted Exception:" + e.getMessage());
                e.printStackTrace();
            }
            System.out.println("The reversed string is : " + mw.result);
        }
    }

 

}

