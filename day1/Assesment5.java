package day1;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assesment5 {

	public static void main(String[] args) {
		 try
	      {
	    int idA = 1;
	    String nameA = "Testing Purpose";
	    int populationA = 100;
	    float tempA = 1.3f;
	    int pincodeA = 516127;
	    
	    int idB = 2;
	    String nameB = "ctCTcta";
	    int populationB = 200;
	    float tempB = 1.45f;
	    int pincodeB = 516115;

	    FileOutputStream fos = new FileOutputStream("cities1.dat");
	    DataOutputStream dos = new DataOutputStream(fos);

	    
	    dos.writeInt(idA);
	    dos.writeUTF(nameA);
	    dos.writeInt(populationA);
	    dos.writeFloat(tempA);
	    dos.writeInt(pincodeA);

	    dos.writeInt(idB);
	    dos.writeUTF(nameB);
	    dos.writeInt(populationB);
	    dos.writeFloat(tempB);
	    dos.writeInt(pincodeB);

	    
	    dos.flush();
	    
	    fos.close();
	    dos.close();
	    

	    FileInputStream fis = new FileInputStream("cities1.dat");
	    DataInputStream dis = new DataInputStream(fis);
	    
	    int cityId = dis.readInt();
	    System.out.println("City Id: " + cityId);
	    String cityName = dis.readUTF();
	    System.out.println("City Name: " + cityName);
	    int cityPopulation = dis.readInt();
	    System.out.println("City Population: " + cityPopulation);
	    float cityTemperature = dis.readFloat();
	    System.out.println("City Temperature: " + cityTemperature);
	    int pincode = dis.readInt();
	    System.out.println("City Pincode: " + pincode);
	    
	      int cityId1 = dis.readInt();
	    System.out.println("City Id: " + cityId1);
	    String cityName1 = dis.readUTF();
	    System.out.println("City Name: " + cityName1);
	    int cityPopulation1 = dis.readInt();
	    System.out.println("City Population: " + cityPopulation1);
	    float cityTemperature1 = dis.readFloat();
	    System.out.println("City Temperature: " + cityTemperature1);
	    int pincode1 = dis.readInt();
	    System.out.println("City Pincode: " + pincode1);
	    
	    
	   
	 
	      dis.close();
	      fis.close();
	      }
	      catch(Exception et)
	      {
	          et.printStackTrace();
	   
	      }
	}
}