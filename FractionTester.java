public class FractionTester {
    public static void main(String[] args) {
        //Fraction f = new Fraction();
        Fraction f = new Fraction(169,13);  //Aufruf Aufgabe 4
        //Fraction g = new Fraction();  //Test nachdem this(int,int) eingeführt wurde.
        //System.out.println(g);
        
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        //f.numerator = 12;
        //f.denominator = 0;
        //System.out.println(f);
        //System.out.println(f.numerator + "/" + f.denominator);
 
        // Aufgabe 2: toString():
        System.out.println(f.toString());
     
        // Aufgabe 3: Encapsulation, Getter und Setter:
        // The field Fraction.denominator is not visible
        // The field Fraction.nominator is not visible
        f.setDenominator(13);
        f.setNumerator(169);
        System.out.println("f:" + f.toString());

        // Aufgabe 5: Copy-Konstruktor und equals():
        // Fraction g = f; //gleiches Objekt
        //Fraction g = new Fraction(f); // neues Objekt mit gleichem Inhalt
        Fraction g = new Fraction(13,1);
        System.out.println("g:" + g.toString());
        if (f==g) {
            System.out.println("Objektgleichheit!");
        }

        if (g.equals(f)) {
            System.out.println("Inhaltsgleichheit!");
        }

        // Aufgabe 6: Klassen- und Instanzenmethoden:
        //Test für statische Methode
        Fraction a = new Fraction(1,3);
        Fraction b = new Fraction(4,3);
        //System.out.println(Fraction.add(a, b));
 
        //Test für dynamische Methode
        a.add(b);
        System.out.println(a.toString());


        // Aufgabe 7: statische Variablen:
        System.out.println(a.numberOfFractions);

    }

}
