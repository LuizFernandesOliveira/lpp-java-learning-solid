package solid.ocp.calculator.subtract;

import solid.ocp.calculator.Calculator;

public class Subtract extends Calculator {
  public Subtract(long[] numbers) {
    super(numbers);
  }

  public void calculate() {
    System.out.print(numbers[0] + " - " + numbers[1] + " = ");
    System.out.println(numbers[0] - numbers[1]);
  }
}
