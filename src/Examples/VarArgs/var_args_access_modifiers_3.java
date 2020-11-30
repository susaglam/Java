package Examples.VarArgs;

public class var_args_access_modifiers_3 {
    public static void main (String[] args) {
        calculate("sum", 1, 2, 3, 4, 5, 6);
        calculate("subtract", 15, 5, 4, 3);
        calculate("multiply", 1, 2, 3, 4, 5, 6);
        calculate("divide", 100, 2, 2);
        calculate("error", 100, 2, 2);
    }

    public static void calculate (String calculate, int... numbers) {
        int result = 0;

        switch (calculate) {
            case "sum":
                for (int number : numbers) {
                    result += number;
                }
                System.out.println(result);
                break;
            case "subtract":
                for (int i = 0; i < numbers.length; i++) {
                    if(i<numbers.length-1) {
                        if (i == 0) {
                            result = numbers[i] - numbers[i + 1];
                        } else {
                            result = result - numbers[i + 1];
                        }
                    }
                }

                System.out.println(result);
                break;
            case "multiply":
                result = 1;
                for (int number : numbers) {
                    result *= number;
                }
                System.out.println(result);
                break;
            case "divide":
                for (int i = 0; i < numbers.length; i++) {
                    if(i<numbers.length-1) {
                        if (i == 0) {
                            result = numbers[i] / numbers[i + 1];
                        } else {
                            result = result / numbers[i + 1];
                        }
                    }
                }
                System.out.println(result);
                break;
            default:
                System.out.println("oops Somethings wrong....");
                break;
        }
    }
}
