package solid.ocp;

import solid.ocp.calculator.divide.Divide;
import solid.ocp.calculator.multiply.Multiply;
import solid.ocp.calculator.subtract.Subtract;
import solid.ocp.calculator.sum.compound_sum.CompoundSum;
import solid.ocp.calculator.sum.Sum;

public class App {
  public static void main(String[] args) {
    new Sum(new long[]{10, 10, 10}).calculate();
    new Subtract(new long[]{10, 10}).calculate();
    new Multiply(new long[]{10, 10}).calculate();
    new Divide(new long[]{10, 10}).calculate();

    new CompoundSum(new long[]{10, 10, 10, 10, 10, 10}).calculate();
  }
}
