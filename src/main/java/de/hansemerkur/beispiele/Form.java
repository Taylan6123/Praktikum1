package de.hansemerkur.beispiele;


public class Form {

 private int laenge;
 private int x;
 private int y;
 private String farbe;  

    public Form (int laenge,int x,int y,String farbe) {
        this.laenge = laenge;
        this.x = x;
        this.y = y;
        this.farbe = farbe;    
    }

    public void anzeigeForm () {
         System.out.println("laenge: " + laenge + ", x: " + x + ", y: " + y + ",farbe:" + farbe);
    }
    public int gebeLaenge(){
    return laenge;
}

    public int gebeX(){
    return x;

}
    public int gebeY(){
    return y;
}
    public String gebeFarbe(){
    return farbe;
}
}