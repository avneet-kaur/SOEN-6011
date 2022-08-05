public class ScientificCalculator {

    public static double naturalExponential(int x) {
        //calculate e^x
        int n_terms = 25;
        double expo_sum = 1;
        for (int i = n_terms - 1; i > 0; --i)
            expo_sum = 1 + x * expo_sum / i;
        return expo_sum;
    }

    public static double calculatePower(double x, int n) {
        if (n < 0) {
//			if n is -ve
            return 1.0 / powHelper(x, Math.abs(n));
        }
//		n is +ve
        return powHelper(x, n);
    }

    public static double powHelper(double x, int n) {
//		recursive logic for power
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n % 2 == 0)
            return powHelper(x * x, n / 2);
        return x * powHelper(x * x, n / 2);
    }

    public static String calculateExponentialFunction(String a, String b, String x) {
        double res;
        double t_a = 0, t_b = 0;
        int t_x = 0;
        t_a = Long.parseLong(a);

        if (b.equals("e")) {
            res = naturalExponential(Integer.parseInt(x));
            res = t_a * res;
        }
        else {
            t_b = Double.parseDouble(b);
            t_x = Integer.parseInt(x);
            res = calculatePower(t_b, t_x);
            res = t_a * res;
        }
//		Result -> a*b^x
        System.out.println("Result = " + res + "\n");
        return Double.toString(res);
    }
}
