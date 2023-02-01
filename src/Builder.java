public enum Builder {
    FENDER,MARTIN,GIBSON,COLLINGS,OLSON,RYAN,PRS,ANY;

    @Override
    public String toString() {
        switch (this){
            case PRS : return "Prs";
            case RYAN:return "Ryan";
            case OLSON:return "Olson";
            case FENDER:return "Fender";
            case GIBSON:return "Gibson";
            case MARTIN:return "Martin";
            case COLLINGS:return "Collings";
            case ANY:return "Any";
            default:return "";
        }
    }
}
