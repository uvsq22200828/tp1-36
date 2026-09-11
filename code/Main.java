package code;
public class Main {
    public static void main(String[] args) {
        assert new Fraction(1, 2).toString().equals("1/2");
        assert new Fraction(1).toString().equals("1/1");
        assert new Fraction().toString().equals("0/1");
        Fraction fraction = new Fraction();
        System.out.println(fraction.toString());
    }

}
