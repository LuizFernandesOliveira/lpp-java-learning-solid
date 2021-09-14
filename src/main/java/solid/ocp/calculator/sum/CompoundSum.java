package solid.ocp.calculator.sum;

import java.util.Arrays;

public class CompoundSum extends Sum {
  public CompoundSum(long[] numbers) {
    super(numbers);
  }

  @Override
  public void calculate() {
    for (var index = 0; index < numbers.length; index++) {
      if (index != numbers.length - 1) {
        System.out.print(numbers[index] + " + ");
      } else {
        System.out.print(numbers[index]);
      }
    }
    System.out.println(" = " + Arrays.stream(numbers).sum());
  }
}
