public class LatteMacchiato extends Milchkaffee{
    private static int milchschaum;
    public LatteMacchiato(){
        setWasser(150);
        setKaffeebohnen(50);
        setPreis(1.50);
        setMilch(250);
        this.milchschaum = 50;
    }
    public int getMilchschaum(){
        return milchschaum;
    }
}
