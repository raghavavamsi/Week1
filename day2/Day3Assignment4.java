package day2;


class MyWrapper{
	String str;
	String result = "";
}

public class Day3Assignment4 {
	public static MyWrapper mw = new MyWrapper();
	public static void main(String[] args) {
		NotifyWait b = new NotifyWait();
		b.start();
		
		synchronized (mw) {
			try {
				mw.str = "vamsi";
				System.out.println("The input string is : " + mw.str);
				mw.wait();
			} catch(Exception e) {
				System.out.println("Interrupted Exception:"+e.getMessage());
				e.printStackTrace();
			}
			System.out.println("The reversed string is : " + mw.result);
		}
	}

}

class NotifyWait extends Thread{
	public void run(){
		synchronized(Day3Assignment4.mw)
		{
			try
			{
				char ch;
				for(int i=0;i<Day3Assignment4.mw.str.length();i++) {
					ch = Day3Assignment4.mw.str.charAt(i);
					Day3Assignment4.mw.result = ch + Day3Assignment4.mw.result;
				}
			}
			catch(Exception e){ e.printStackTrace(); }
			Day3Assignment4.mw.notify();
		}	
	}
}