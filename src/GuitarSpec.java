public class GuitarSpec {
    private Builder builder;
    private String model;
    private int numStrings;
    private Type type;
    private Wood backWood;
    private Wood topWood;


    public GuitarSpec(Builder builder, String model,int numStrings, Type type, Wood backWood,Wood topWood){
        this.builder=builder;
        this.model=model;
        this.numStrings=numStrings;
        this.type=type;
        this.backWood=backWood;
        this.topWood=topWood;
    }
    public boolean matches(GuitarSpec searchGuitar){
        if(searchGuitar.getBuilder()!=(builder)) return false;
        if(!searchGuitar.getModel().equals("")&&!searchGuitar.getModel().toLowerCase().equals(model.toLowerCase())) return  false;
        if(!searchGuitar.getType().equals(type)) return false;
        if(!searchGuitar.getTopWood().equals(topWood)) return false;
        if(!searchGuitar.getBackWood().equals(backWood)) return false;
        if(searchGuitar.getNumStrings()!=numStrings) return false;
        return true;
    }
    public  Builder getBuilder(){
        return this.builder;
    }
    public String getModel(){
        return this.model;
    }
    public Type getType(){
        return this.type;
    }
    public Wood getBackWood(){
        return this.backWood;
    }
    public Wood getTopWood(){
        return this.topWood;
    }
    public int getNumStrings(){
        return this.numStrings;
    }
}
