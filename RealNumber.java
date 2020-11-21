public class RealNumber{
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

  public boolean equals(RealNumber other){
    if (getValue()==0){
      return getValue() == other.getValue();
    }
    else if (other.getValue()==0){
      return getValue() == other.getValue();
    }
    else{
      return (((Math.abs((getValue()-other.getValue())/other.getValue()))*100) <= 0.001);
    }
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
