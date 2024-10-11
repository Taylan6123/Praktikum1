package de.hansemerkur.beispiele;

public class Rechteck extends Form {

private int hoehe;

 public Rechteck (int laenge, int hoehe, int x, int y, String farbe ) {
        super(laenge, x, y, farbe);       
        this.hoehe = hoehe;
 }
public void anzeigeRechteck () {
    anzeigeForm();
    System.out.println("hoehe:" + hoehe + "cm" + ",laenge: " + gebeLaenge() + ", x: " + gebeX() + ", y: " + gebeY() + ",farbe:" + gebeFarbe());
}

 }


