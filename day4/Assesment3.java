
package day4;

public class Assesment3 {
	class FileSystem{

		   public void readFile() {
		      System.out.println("readFile() in FileSystem");
		   }
		}

		class Network {

		   public void sendData() {
		      System.out.println("sendData() in Network");
		   }
		}


		class Display {

		   public void draw() {
		      System.out.println("draw() in Display");
		   }
		}

		class AppLifeCycle {

		   public void startApp() {
		      System.out.println("startApp() in AppLifeCycle");
		   }
		}

		class Hardware{
			
			public void getStatus() {
				System.out.println("getStatus() in Hardware");
			}
			public void sendData() {
				System.out.println("sendData() in Hardware");
			}
			public void recvData() {
				System.out.println("recvData() in Hardware");
			}
		}

		interface OSAPI{
		    public void readFileOS();
		    public void sendDataOS();
		    public void startAppOS();
		    public void drawOS();
		    public void getHardwareDtls();
		}

		class FacadeClass implements OSAPI{
		      public void readFileOS(){
		          new FileSystem().readFile();
		      }
		      
		    public void sendDataOS(){
		            new Network().sendData();
		    }
		    
		    public void startAppOS(){
		        new AppLifeCycle().startApp();
		    }
		    
		    public void drawOS(){
		        new Display().draw();
		    }

			
			public void getHardwareDtls() {
				// TODO Auto-generated method stub
				Hardware h = new Hardware();
				h.getStatus();
				h.sendData();
				h.recvData();
			}
		}

		public class FacadeExample {
		   public static void main(String[] args) {
		      FacadeClass obj = null;

		      obj.drawOS();
		      obj.readFileOS();
		      obj.sendDataOS();
		      obj.startAppOS();
		      obj.getHardwareDtls();
		   }
		}

}
