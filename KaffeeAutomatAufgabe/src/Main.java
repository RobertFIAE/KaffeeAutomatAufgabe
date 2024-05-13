public class Main {

    public static void main(String[] args) {
        KaffeeAutomat kaffeeAutomat = new KaffeeAutomat();
        boolean on = true;
        while(on) {
            on = kaffeeAutomat.mainMenue();
        }
    }
}
