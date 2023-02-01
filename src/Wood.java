public enum Wood {
    INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD,MAHOGANY,MAPLE,COCOBOLO,CEDAR;

    @Override
    public String toString() {
        switch (this){
            case CEDAR:return "Cedar";
            case MAPLE:return "Maple";
            case COCOBOLO:return  "Cocobolo";
            case MAHOGANY:return "Mahogany";
            case INDIAN_ROSEWOOD:return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:return "Brazilian Rosewood";
            default:return "";
        }
    }
}
