import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class KaffeeAutomat {

    private int wasser, kaffeebohnen, tassen, milch;
    private double guthaben, einnahmen;

    public KaffeeAutomat() {
        this.wasser = 3000;
        this.kaffeebohnen = 3000;
        this.milch = 3000;
        this.tassen = 25;
        this.guthaben = 0;
        this.einnahmen = 0;
    }

    private void getFuellstaende() {
        System.out.println("|-----Kaffeeautomat-----Füllstände-----|" +
                "\nWasser : " + getWasser() + " ml." +
                "\nKaffeebohnen : " + getKaffeebohnen() + " gramm." +
                "\nMilch : " + getMilch() + " ml." +
                "\nTassen : " + getTassen() + " Tassen." +
                "\nGuthaben : " + getDezimalGuthaben() + " € Guthaben." +
                "\nEinnahmen : " + getDezimalEinnahmen() + " € Einnahmen.");
    }

    //-------------------------------------WASSER------------------------------------------------------------------------
    public int getWasser() {
        return wasser;
    }

    private void wasserBefuellen(int wasser) {
        if (wasser > 0) {
            if (this.wasser + wasser <= 3000) {
                this.wasser += wasser;
            } else if (this.wasser + wasser > 3000) {
                this.wasser += wasser;
                System.out.println("Der Wassertank ist voll, die restlichen : " + (this.wasser - 3000) + " ml Wasser,passen nicht mehr rein.");
                this.wasser = 3000;
            }
        } else {
            gueltigerIntWertSout();
        }
    }

    private void wasserEntnehmen(int wasser) {
        if (this.wasser > 0 && this.wasser - wasser >= 0) {
            this.wasser -= wasser;
        } else {
            System.out.println("Es ist leider nicht genügend Wasser im tank, bitte ausreichend Wasser nachfüllen. Aktueller Wasserstand: " + getWasser() + " ml." +
                    "\nIhnen fehlen " + (wasser - this.wasser) + " ml Wasser.");
        }
    }

    private boolean wasserstandPruefen(int wasser) {
        if (this.wasser >= wasser) {
            return true;
        } else {
            System.out.println("Es ist leider nicht genug Wasser im Tank, bitte füllen sie mindestens: " + (wasser - this.wasser) + " ml Wasser nach.");
            return false;
        }
    }

    //-----------------------------------------KAFFEEBOHNEN----------------------------------------------------------
    public int getKaffeebohnen() {
        return kaffeebohnen;
    }

    private void kaffeebohnenBefuellen(int kaffeebohnen) {
        if (kaffeebohnen > 0) {
            if (this.kaffeebohnen + kaffeebohnen <= 3000) {
                this.kaffeebohnen += kaffeebohnen;
            } else if (this.kaffeebohnen + kaffeebohnen > 3000) {
                this.kaffeebohnen += kaffeebohnen;
                System.out.println("Der Kaffeebohnentank ist voll, die restlichen : " + (this.kaffeebohnen - 3000) + " gramm Kaffeebohnen, passen nicht mehr rein.");
                this.kaffeebohnen = 3000;
            }
        } else {
            gueltigerIntWertSout();
        }
    }

    private void kaffeebohnenEntnehmen(int kaffeebohnen) {
        if (this.kaffeebohnen > 0 && this.kaffeebohnen - kaffeebohnen >= 0) {
            this.kaffeebohnen -= kaffeebohnen;
        } else {
            System.out.println("Es sind leider nicht genügend Kaffeebohnen im tank, bitte ausreichend Kaffeebohnen nachfüllen. Aktueller Kaffeebohnenstand: " + getKaffeebohnen() + " gramm." +
                    "\nIhnen fehlen " + (kaffeebohnen - this.kaffeebohnen) + "gramm Kaffeebohnen.");
        }
    }

    private boolean kaffeebohnenPruefen(int kaffeebohnen) {
        if (this.kaffeebohnen >= kaffeebohnen) {
            return true;
        } else {
            System.out.println("Es sind leider nicht genug Kaffeebohnen im Tank, bitte füllen sie mindestens: " + (kaffeebohnen - this.kaffeebohnen) + " gramm Kaffeebohnen nach.");
            return false;
        }
    }

    //-----------------------------------------MILCH--------------------------------------------------------
    public int getMilch() {
        return milch;
    }

    private void milchBefuellen(int milch) {
        if (milch > 0) {
            if (this.milch + milch <= 3000) {
                this.milch += milch;
            } else if (this.milch + milch > 3000) {
                this.milch += milch;
                System.out.println("Der Milchtank ist voll, die restlichen : " + (this.milch - 3000) + " ml Milch, passen nicht mehr rein.");
                this.milch = 3000;
            }
        } else {
            gueltigerIntWertSout();
        }
    }

    private void milchEntnehmen(int milch) {
        if (this.milch > 0 && this.milch - milch >= 0) {
            this.milch -= milch;
        } else {
            System.out.println("Es ist leider nicht genügend Milch im tank, bitte ausreichend Milch nachfüllen. Aktueller Milchstand: " + getMilch() + " ml." +
                    "\nIhnen fehlen " + (milch - this.milch) + " ml Milch.");
        }
    }

    private boolean milchstandPruefen(int milch) {
        if (this.milch >= milch) {
            return true;
        } else {
            System.out.println("Es ist leider nicht genug Milch im Tank, bitte füllen sie mindestens: " + (milch - this.milch) + "ml Milch nach.");
            return false;
        }
    }

    //-----------------------------------------TASSEN----------------------------------------------------------------------
    public int getTassen() {
        return tassen;
    }

    private void tassenBefuellen(int tassen) {
        if (tassen > 0) {
            if (this.tassen + tassen <= 25) {
                this.tassen += tassen;
            } else if (this.tassen + tassen > 25) {
                this.tassen += tassen;
                System.out.println("Es sind genug Tassen vorhanden, die restlichen : " + (this.tassen - 25) + " Tassen, passen nicht mehr rein.");
                this.tassen = 25;
            }
        } else {
            gueltigerIntWertSout();
        }
    }

    private void tassenEntnehmen(int tassen) {
        if (this.tassen > 0 && this.tassen - tassen >= 0) {
            this.tassen -= tassen;
        } else {
            System.out.println("Es sind leider nicht genügend Tassen da, bitte ausreichend Tassen auffüllen. Aktuell sind: " + getTassen() + " Tassen vorhanden." +
                    "\nIhnen fehlen " + (tassen - this.tassen) + " Tassen.");

        }
    }

    private boolean tassenPruefen(int tassen) {
        if (this.tassen > 0 && this.tassen >= tassen) {
            return true;
        } else {
            System.out.println("Es sind leider nicht genug Tassen da, bitte füllen sie mindestens: " + (tassen - this.tassen) + " Tassen nach.");
            return false;
        }
    }

    //-----------------------------------------GUTHABEN && EINNAHMEN-----------------------------------------------
    public double getGuthaben() {
        return guthaben;
    }

    public String getDezimalGuthaben() {
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(getGuthaben());
    }

    public double getEinnahmen() {
        return einnahmen;
    }

    public String getDezimalEinnahmen() {
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(getEinnahmen());
    }

    private boolean guthabenPruefen(double geld) {
        DecimalFormat df = new DecimalFormat("#.###");
        if (guthaben >= geld) {
            return true;
        } else {
            System.out.println("Ihr Guthaben reicht leider nicht aus, werfen sie bitte mindestens: " + df.format((geld - guthaben)) + "€ ein.");
            return false;
        }
    }

    private boolean guthabenEinwerfen() {
        try {
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println("Wieviel Guthaben möchten sie einwerfen :");
            Scanner guthabenScanner = new Scanner(System.in);
            double guthaben = guthabenScanner.nextDouble();
            if (guthaben > 0) {
                this.guthaben += guthaben;
                System.out.println("           | Eingeworfen: " + df.format(guthaben) + " € | Guthaben: " + df.format(this.guthaben) + " € |");
                return true;
            } else if (guthaben == 0) {
                System.out.println("Kein Geld eingeworfen. Vorgang wurde abgebrochen.");
                mainMenue();
                return false;
            } else {
                gueltigerDoubleWertSout();
                return false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben sie einen gültigen positiven Zahlen-Wert, Dezimalzahlen sollten mit einem 'Komma' getrennt werden.");
        }
        return false;
    }

    private void guthabenEntnehmen() {
        if (guthaben > 0) {
            System.out.println("           | Guthaben: " + getDezimalGuthaben() + " € | ausgezahlt.");
            this.guthaben = 0;
        } else {
            System.out.println("Leider haben sie kein weiteres Guthaben zum auszahlen.");
        }
    }

    private void guthabenEinloesen(double preis) {
        if (preis <= guthaben) {
            guthaben -= preis;
            einnahmen += preis;
        } else {
            System.out.println("Ihr Guthaben reicht leider nicht aus, werfen sie bitte mindestens: " + (preis - guthaben) + " € ein.");
        }
    }

    private void getGeldInfo() {
        System.out.println("           | Guthaben: " + getDezimalGuthaben() + " € | Einnahmen: " + getDezimalEinnahmen() + " € |");
    }

    // -----------------------------------GÜLTIGER WERT--------------------------------
    private void gueltigerIntWertSout() {
        System.out.println("Bitte geben sie einen gültigen positiven Wert ein. Zwischen 1 bis zum maximalen Füllstand."
                + "\nBei Wasser, Milch und Kaffeebohnen zwischen 1 bis maximal 3000."
                + "\nbei den Tassen zwischen 1 bis maximal 25.");
    }

    private void gueltigerDoubleWertSout() {
        System.out.println("Bitte geben sie einen gültigen positiven Wert ein. Zum Beispiel den Wert '0.1'.");
    }

    // ------------------------------------AKTIONEN---------------------------------------------------
    private void maschineBefuellen() {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Bitte Wassermenge in ml eingeben:");
            wasserBefuellen(scanner.nextInt());
            System.out.println("Bitte Kaffeebohnen in gramm eingeben:");
            kaffeebohnenBefuellen(scanner.nextInt());
            System.out.println("Bitte Milch in ml eingeben:");
            milchBefuellen(scanner.nextInt());
            System.out.println("Bitte Anzahl Tassen eingeben:");
            tassenBefuellen(scanner.nextInt());
            ;
        } catch (NoSuchElementException e) {
            System.out.println("Bitte gib eine gültige positive Zahl ein.");
        }
    }

    private void geldEntnehmen() {
        if (einnahmen > 0) {
            System.out.println("| Einnahmen: " + getDezimalEinnahmen() + "€ | Erfolgreich abgehoben. |");
            einnahmen = 0;
        } else {
            System.out.println("Leider gibt es keine Einnahmen zum entnehmen.");
        }
    }

    //------------------------------------------Kaffee---Kaufen---------------------------------------------
    private void kaffeeKaufen(Kaffee kaffee) {
        boolean ausreichendFuellstaende = ausreichendFuellstaendeAbfragen(kaffee);
        if (guthaben >= kaffee.getPreis()) {
            if (ausreichendFuellstaende) {
                fuelstaendeAbziehen(kaffee);
                System.out.println("Bitteschön, hier ist ihr " + kaffee.getClass().getName() + ".");
            }
        } else {
            if (guthabenEinwerfen()) {
                kaffeeKaufen(kaffee);
            }
        }
    }


    private void fuelstaendeAbziehen(Kaffee kaffee) {
        wasserEntnehmen(kaffee.getWasser());
        kaffeebohnenEntnehmen(kaffee.getKaffeebohnen());
        tassenEntnehmen(kaffee.getTassen());
        guthabenEinloesen(kaffee.getPreis());
        if (kaffee instanceof Milchkaffee) {
            milchEntnehmen(((Milchkaffee) kaffee).getMilch());
        }
    }


    private boolean ausreichendFuellstaendeAbfragen(Kaffee kaffee) {
        boolean wasserstand = wasserstandPruefen(kaffee.getWasser());
        boolean kaffeebohnenstand = kaffeebohnenPruefen(kaffee.getKaffeebohnen());
        boolean tassenstand = tassenPruefen(kaffee.getTassen());
        boolean guthabenstand = guthabenPruefen(kaffee.getPreis());
        if (wasserstand && kaffeebohnenstand && tassenstand && guthabenstand) {
            if (kaffee instanceof Milchkaffee) {
                return milchstandPruefen(((Milchkaffee) kaffee).getMilch());
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    //---------------------------------------MENÜ--------------------------------------------------------
    public boolean mainMenue() {
        Kaffee kaffee = new Kaffee();
        Espresso espresso = new Espresso();
        Milchkaffee milchkaffee = new Milchkaffee();
        LatteMacchiato latteMacchiato = new LatteMacchiato();

        getGeldInfo();
        System.out.println("---------------------------MENÜ--------------------------" +
                "\n           Geben sie bitte folgende Nummer ein.          " +
                "\n 1:            Kaffee kaufen | Preis: 1,00€               " +
                "\n 2:          Espresso kaufen | Preis: 0,80€               " +
                "\n 3:       Milchkaffee kaufen | Preis: 1,20€               " +
                "\n 4:   Latte Macchiato kaufen | Preis: 1,50€               " +
                "\n 5:              zum Guthaben entnehmen" +
                "\n 6:              zum Einnahmen entnehmen" +
                "\n 7:               zur Füllstandsanzeige " +
                "\n 8:             zum befüllen der Maschine" +
                "\n 9:                 Gerät ausschalten");

        Scanner scanner = new Scanner(System.in);
        try {
            int eingabe = scanner.nextInt();
            switch (eingabe) {
                case (1) -> kaffeeKaufen(kaffee);
                case (2) -> kaffeeKaufen(espresso);
                case (3) -> kaffeeKaufen(milchkaffee);
                case (4) -> kaffeeKaufen(latteMacchiato);
                case (5) -> guthabenEntnehmen();
                case (6) -> geldEntnehmen();
                case (7) -> getFuellstaende();
                case (8) -> maschineBefuellen();

                case (9) -> {
                    return false;
                }
                default -> {
                    System.out.println("Bitte geben sie einen gültigen positiven Wert zwischen '1' und '8' ein.");
                }

            }
        } catch (NoSuchElementException e) {
            System.out.println("Bitte geben sie eine gültige Nummer zwischen '0' und '9' ein.");
            scanner.nextLine();
        }
        return true;
    }
}

