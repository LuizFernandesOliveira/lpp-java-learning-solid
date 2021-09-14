package solid.srp;

public class Calculator {
  public void sum(long x, long y) {
    System.out.print(x + " + " + y + " = ");
    System.out.println(x + y);
  }

  public void subtract(long x, long y) {
    System.out.print(x + " - " + y + " = ");
    System.out.println(x - y);
  }

  public void multiply(long x, long y) {
    System.out.print(x + " * " + y + " = ");
    System.out.println(x * y);
  }

  public void divide(long x, long y) {
    System.out.print(x + " / " + y + " = ");
    System.out.println(x / y);
  }
}
