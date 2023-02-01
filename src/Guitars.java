public class Guitars {
    private String serialNumber;
    private double price;

    private GuitarSpec guitarSpec;

    Guitars(String serialNumber,double price,GuitarSpec newGuitarSpec){
        this.serialNumber=serialNumber;
        this.price=price;
        this.guitarSpec=newGuitarSpec;
    }

    public String getName(){
        return this.serialNumber;
    }
    public double getPrice(){
        return this.price;
    }

    public GuitarSpec getSpec(){
        return this.guitarSpec;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
