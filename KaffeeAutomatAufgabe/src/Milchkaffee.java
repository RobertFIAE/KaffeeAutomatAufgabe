public class Milchkaffee extends Kaffee {
    private int milch;
    public Milchkaffee(){
        setWasser(250);
        setKaffeebohnen(50);
        setPreis(1.20);
        this.milch=100;
    }
    public void setMilch(int milch){
        this.milch = milch;
    }
    public int getMilch(){
        return milch;
    }

}
