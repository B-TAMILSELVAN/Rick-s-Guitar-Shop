import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    ArrayList<Guitars> guitars;

    Inventory(){
        guitars=new ArrayList<>();
    }

    public void addGuitars(String serialNumber,double price,GuitarSpec newGuitarSpec){
        Guitars guitar=new Guitars(serialNumber,price,newGuitarSpec);
        guitars.add(guitar);
    }

    public Guitars getGuitars(String model){
        for(Guitars guitar:guitars){
            if(guitar.getSpec().getModel().equals(model))
                return guitar;
        }
        return null;
    }
    public ArrayList search(GuitarSpec searchGuitar){
        ArrayList<Guitars> matchingGuitar=new ArrayList<>();
        for(Iterator i=guitars.iterator(); i.hasNext();){
            Guitars guitar=(Guitars) i.next();
            GuitarSpec guitarSpec=guitar.getSpec();
            if(guitar.getSpec().matches(searchGuitar))
            matchingGuitar.add(guitar);

        }
        return  matchingGuitar;
    }


}
