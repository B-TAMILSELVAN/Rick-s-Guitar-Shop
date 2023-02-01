import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
      Inventory inventory=new Inventory();
      inventory.addGuitars("V95693",1499.45,new GuitarSpec(Builder.FENDER,"stratocastor",10,Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD));
      inventory.addGuitars("V9512",1549.95,new GuitarSpec(Builder.FENDER,"stratocastor",10,Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD));
      GuitarSpec whatJohnWants=new GuitarSpec(Builder.FENDER,"stratocastor",10,Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD);
        ArrayList<Guitars> matchingGuitars=inventory.search(whatJohnWants);
      if(matchingGuitars.size()!=0){
          System.out.println("John you might like these guitars.....");
          for(Guitars guitar:matchingGuitars){
              System.out.println("We have a "+guitar.getSpec().getBuilder() +" "+guitar.getSpec().getNumStrings()+"-string"+""+guitar.getSpec().getType()+"Guitar");
              System.out.println("    "+guitar.getSpec().getBackWood()+" back and sides");
              System.out.println("    "+guitar.getSpec().getTopWood()+" back");
              System.out.println("You can have it for only "+guitar.getPrice());

              System.out.println(".......................................");
          }

      }
      else {
          System.out.println("sorry we couldn't find you a perfect match");
      }
    }
}