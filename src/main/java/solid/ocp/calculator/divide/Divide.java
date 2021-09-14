package solid.ocp.calculator.divide;

import solid.ocp.calculator.Calculator;

public class Divide extends Calculator {

  public Divide(long[] numbers) {
    super(numbers);
  }

  public void calculate() {
    System.out.print(numbers[0] + " / " + numbers[1] + " = ");
    System.out.println(numbers[0] / numbers[1]);
  }
}
