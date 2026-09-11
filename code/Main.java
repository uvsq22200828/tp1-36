package code;
public class Main {
    public static void main(String[] args) {
        assert new Fraction(1, 2).toString().equals("1/2");
        assert new Fraction(1).toString().equals("1/1");
        assert new Fraction().toString().equals("0/1");
        assert Math.abs(new Fraction(1, 3).doubleValue() - 0.3333333333333333) < 1E-8;
        assert new Fraction(1,4).add(new Fraction(1,2)).toString().equals("3/4");
        assert new Fraction(3,4).add(new Fraction(2,5)).toString().equals("23/20");
        assert new Fraction(2,4).add(new Fraction(2,4)).toString().equals("1/1");
        Fraction fraction = new Fraction();
        System.out.println(fraction.toString());
    }

}
