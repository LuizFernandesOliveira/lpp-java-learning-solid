package solid.ocp.calculator.sum;

import solid.ocp.calculator.Calculator;

public class Sum extends Calculator {
  public Sum(long[] numbers) {
    super(numbers);
  }

  public void calculate() {
    System.out.print(numbers[0] + " / " + numbers[1] + " = ");
    System.out.println(numbers[0] / numbers[1]);
  }
}
