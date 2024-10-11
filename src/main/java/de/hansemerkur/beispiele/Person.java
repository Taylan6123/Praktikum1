package de.hansemerkur.beispiele;

public class Person {

   String vorname;
   String nachname;
   String geburstag;

    public Person(String vorname, String nachname, String geburstag) {
        this.vorname = vorname;
        this.nachname = nachname;    
        this.geburstag = geburstag;
        }



    public void anzeigePerson(){
        System.out.println("Person: " + vorname + nachname);
    }
}



