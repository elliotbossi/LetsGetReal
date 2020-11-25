public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public RealNumber add(RealNumber other){
     double x = getValue() + other.getValue();
     RealNumber i = new RealNumber(x);
     return i;
  }

  public RealNumber multiply(RealNumber other){
    double x = getValue() * other.getValue();
    RealNumber i = new RealNumber(x);
    return i;
  }

  public RealNumber divide(RealNumber other){
    double x = getValue() / other.getValue();
    RealNumber i = new RealNumber(x);
    return i;
  }

  public RealNumber subtract(RealNumber other){
    double x = getValue() - other.getValue();
    RealNumber i = new RealNumber(x);
    return i;
  }
}
