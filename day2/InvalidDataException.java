package day2;


public class InvalidDataException extends Exception{
    public InvalidDataException(String msg){
        super(msg);
        System.out.println("InvalidDataException:"+msg);
    }
}



 class StockLogic {
    public void compute_avg(String file_name) throws InvalidDataException{
        //read data from Excel
        if(true){
            throw new InvalidDataException("stock price invalid");
        }
    }
}

 class MainApp {
	public static void main(String[] args) {
		try {
			StockLogic slobj = new StockLogic();
			slobj.compute_avg("abc.xls");
		} catch(InvalidDataException ide) {
			System.out.println(ide.getMessage());
		}
	}
}