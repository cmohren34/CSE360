// a class that is going to be used to complete a series of calculations
// that include, adding, getting the total and subtracting as well as converting to a string

package cse360assignment02;

public class AddingMachine {
  private int total;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  // should return the current total
  public int getTotal () {
    return total;
  }
  
  // should add the parameter to the total variable
  public void add (int value) {
    value += total;
  }

  // should subtract the parameter from the total variable
  public void subtract (int value) {
    value -= total;
  }

  public String toString () {
    return "";
  }

  // should clear the "memory"
  public void clear() {
    total = 0;

  }

}