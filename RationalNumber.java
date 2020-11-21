public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if (denominator == 0){
      numerator = 0;
      denominator = 1;
    }
    if (denominator < 0){
      numerator = numerator * (-1);
      denominator = denominator * (-1);
    }
  }

  public double getValue(){
    double x = (double) getNumerator();
    double y = (double) getDenominator();
    return (x/y);
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber x = new RationalNumber(getDenominator(),getNumerator());
    return x;
  }

  public boolean equals(RationalNumber other){
    if ((getNumerator() == other.getNumerator()) && (getDenominator() == other.getDenominator())){
      return true;
    }
    return false;
  }

  public String toString(){
    return (Integer.toString(getNumerator()) + "/" + Integer.toString(getDenominator()));
  }

  private static int gcd(int a, int b){
    int r = 100;
    if (a > b){
      if (a%b == 0){
        return b;
      }
      if (b == 0){
        return a;
      }
      else {
        while (r != 0){
          r = a % b;
          a = b;
          b = r;
        }
        return a;
      }
    }
    else if (b > a){
      if (b%a == 0){
        return a;
      }
      if (a == 0){
        return b;
      }
      else {
        while (r != 0){
          r = b % a;
          b = a;
          a = r;
        }
        return b;
      }
    }
}

  private void reduce(){
    int x = gcd(getNumerator(),getDenominator());
    numerator = (getNumerator() / x);
    denominator = (getDenominator() / x);
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber x = new RationalNumber((getNumerator() * other.getNumerator()), (getDenominator() * other.getDenominator()));
    return x;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber x = new RationalNumber((getNumerator() / other.getNumerator()), (getDenominator() / other.getDenominator()));
    return x;
  }

  public RationalNumber add(RationalNumber other){
    RationalNumber x = new RationalNumber(((getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator())), (getDenominator() * other.getDenominator()));
    return x;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber x = new RationalNumber(((getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator())), (getDenominator() * other.getDenominator()));
    return x;
  }
}
