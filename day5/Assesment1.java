package day5;

public class Assesment1 {
	public static void main(String args[]) {
	      
        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder().sugar(1)
					        .butter(0.5)
					        .eggs(2)
					        .vanila(2)
					        .flour(1.5)
					        .bakingpowder(0.75)
					        .milk(0.5).honey(1.0).build();
      
        //Cake is ready to eat :)
        System.out.println(whiteCake);
    }

static class Cake {

    private final double sugar;   //cup
    private final double butter;  //cup
    private final int eggs;
    private final int vanila;     //spoon
    private final double flour;   //cup
    private final double bakingpowder; //spoon
    private final double milk;  //cup
    private final int cherry;
    private final double honey;

    /*static void met1()
    {
    	System.out.println(this);
    	
    }*/
    //inner class
    public static class Builder {

        private double sugar;   //cup
        private double butter;  //cup
        private int eggs;
        private int vanila;     //spoon
        private double flour;   //cup
        private double bakingpowder; //spoon
        private double milk;  //cup
        private int cherry;
        private double honey;

        //builder methods for setting property
        public Builder sugar(double cup){this.sugar = cup; System.out.println(this); return this; }
        public Builder butter(double cup){this.butter = cup; System.out.println(this); return this; }
        public Builder eggs(int number){this.eggs = number; System.out.println(this); return this; }
        public Builder vanila(int spoon){this.vanila = spoon; System.out.println(this); return this; }
        public Builder flour(double cup){this.flour = cup; System.out.println(this); return this; }
        public Builder bakingpowder(double spoon){this.sugar = spoon; return this; }
        public Builder milk(double cup){this.milk = cup; return this; }
        public Builder cherry(int number){this.cherry = number; return this; }
        public Builder honey(double cup){this.honey = cup; System.out.println(this); return this; }
      
      
        //return fully build object
        public Cake build() {
            return new Cake(this);
        }
    }

    //private constructor to enforce object creation through builder
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
        this.honey=builder.honey;
    }

    //any other business methods can exist here
    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour=" + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + ", honey=" + honey + '}';

    } 
}
}
