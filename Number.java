public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if (Math.round(getValue() - other.getValue()) == 0) {
      return 0;
    }
    else if (getValue() > other.getValue()){
      return 1;
    }
    else {
      return -1;
    }
  }

public boolean equals(RealNumber other){
  if (getValue()==0){
    return getValue() == other.getValue();
  }
  else if (other.getValue()==0){
    return getValue() == other.getValue();
  }
  else{
    return (((Math.abs((getValue()-other.getValue())/other.getValue()))*100) <= 0.00001);
  }
}
}
