
 
 

package de.hansemerkur.beispiele;


 
 
 
public class Praktikum {

    public static void main(String[] args) {

        Fahrrad test = new Fahrrad("Lamborghini","Eauto","2012","Rot","400k","212km/h");
        Fahrrad test2 = new Fahrrad("Porsche","Efahrrad","2026","Metallic","200k","140km/h");
        test.anzeigeHersteller();
        test2.anzeigeHersteller();

        Person test3 = new Person ("Henry","eggers","27.6.2009");
        test3.anzeigePerson();

        Dreieck test4 = new Dreieck (50, 0, 50, "schwarz");
        test4.anzeigeDreieck(); 

        Rechteck test5 = new Rechteck (50, 100 , 0, 50, "schwarz");
        test5.anzeigeRechteck();

        Kreis test6 = new Kreis (50, 0, 50, "schwarz");
        test6.anzeigeKreis();



/*
        System.out.println("Hallo hier spricht taylan!");
        System.out.println("Hier ist Taylan!");

        String antwort;

        do { Passwort.setData(System.console().readLine("Passwort eingeben:"));

             if(false==Passwort.passwortTest()) {
              System.out.println("Das Passwort ist nicht sicher");

             } else {
              System.out.println("Dein Passwort ist sicher!");

            }

              antwort=System.console().readLine("willst du ein weiteres Passwort ausprobieren?");

        } while (antwort.equals("ja"));
       
       */

    }
}
