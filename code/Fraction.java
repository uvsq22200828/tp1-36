package code;

public class Fraction {
    private int numerator;
    private int denominator;

    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double doubleValue() {
        return (double) this.numerator / this.denominator;
    }


    private int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return pgcd(b, a % b);
    }
    
    public Fraction add(Fraction other) {
        int newNumerateur = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominateur = this.denominator * other.denominator;

        if (newNumerateur % newDenominateur == 0){
            newNumerateur = newNumerateur / newDenominateur;
            newDenominateur = 1;
        }

        if (pgcd(newNumerateur, newDenominateur) != 1) {
            int gcd = pgcd(newNumerateur, newDenominateur);
            newNumerateur = newNumerateur / gcd;
            newDenominateur = newDenominateur / gcd;
        }

        return new Fraction(newNumerateur, newDenominateur);
    }



    public String toString() {
        return numerator + "/" + denominator;
    }
}
