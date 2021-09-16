package solid.ocp.calculator.multiply;

import solid.ocp.calculator.Calculator;

public class Multiply extends Calculator {
  public Multiply(long[] numbers) {
    super(numbers);
  }

  public void calculate() {
    System.out.print(numbers[0] + " * " + numbers[1] + " = ");
    System.out.println(numbers[0] * numbers[1]);
  }
}
