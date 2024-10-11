package de.hansemerkur.beispiele;

public class Fahrrad {

    String hersteller;
    String system;
    String baujahr;
    String farbe;
    String preis;
    String geschwindigkeit;

    public Fahrrad(String hersteller, String system, String baujahr, String farbe, String preis, String geschwindigkeit) {
        this.hersteller = hersteller;
        this.system = system;    
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.preis = preis;
        this.geschwindigkeit = geschwindigkeit;
        }



    public void anzeigeHersteller(){
        System.out.println("Hersteller: " + hersteller);
    }
}




