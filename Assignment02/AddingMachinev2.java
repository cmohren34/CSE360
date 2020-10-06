package cse360assignment02;
import java.lang.*;

public class AddingMachinev2 {
  private int total;
  StringBuffer history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new StringBuffer("0");
  }
  
  // should return the current total
  public int getTotal () {
    return total;
  }
  
  // should add the parameter to the total variable
  public void add (int value) {
    value += total;
    history.append(" + " + value);
  }

  // should subtract the parameter from the total variable
  public void subtract (int value) {
    value -= total;
    history.append(" - " + value)
  }

  public String toString () {
    return history.toString();
  }

  // should clear the "memory"
  public void clear() {
    total = 0;
    history.delete(0, history.length());
  }

}