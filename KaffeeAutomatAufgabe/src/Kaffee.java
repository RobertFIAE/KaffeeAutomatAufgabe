public class Kaffee {
    private int wasser, kaffeebohnen;
    private  int tassen = 1;
    private double preis;
    public Kaffee(){
        this.wasser = 250;
        this.kaffeebohnen = 50;
        this.preis = 1.00;
    }
    public void setWasser(int wasser){
        this.wasser = wasser;
    }
    public int getWasser(){
        return wasser;
    }
    public void setKaffeebohnen(int kaffeebohnen){
        this.kaffeebohnen = kaffeebohnen;
    }
    public int getKaffeebohnen(){
        return kaffeebohnen;
    }
    public int getTassen(){
        return tassen;
    }
    public void setPreis(double preis){
        this.preis = preis;
    }
    public double getPreis(){
        return preis;
    }
}
