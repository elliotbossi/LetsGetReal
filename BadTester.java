public class BadTester {
    public static void main(String[] args) {
      RealNumber a = new RealNumber(2);
      RealNumber b = new RealNumber(1);
      System.out.println(a.equals(b));
      System.out.println(a.add(b));
      System.out.println(a.subtract(b));
      System.out.println(a.divide(b));
      System.out.println(a.multiply(b));
      RationalNumber c = new RationalNumber(-1, 2);
      RationalNumber d = new RationalNumber(1, -2);
      RationalNumber e = new RationalNumber(-2, 4);
      System.out.println(c.getValue());
      System.out.println(c.getNumerator());
      System.out.println(c.getDenominator());
      System.out.println(c.reciprocal());
      System.out.println(c.equals(d));
      System.out.println(c.equals(e));
      System.out.println(c.toString());
      System.out.println("hi");
      System.out.println();

      RealNumber n = new RealNumber(1.5);
      RealNumber o = new RealNumber(1.5000001);

      System.out.println(n.equals(o));

      o = new RealNumber(42.3);
      System.out.println(n.equals(o));

      RationalNumber o1 = new RationalNumber(3, 2);
      System.out.println(n.equals(o1));


      RationalNumber z1 = new RationalNumber(1, 0);
      RationalNumber z2 = new RationalNumber(0, 1);

      System.out.println(z1.toString().equals("0"));
      System.out.println(z2.toString().equals("0"));

    }
  }
