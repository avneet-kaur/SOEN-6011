public class ScientificCalculator {

    public static double naturalExponential(int x) {
        int n_terms = 25;
        double expo_sum = 1;
        for (int i = n_terms - 1; i > 0; --i)
            expo_sum = 1 + x * expo_sum / i;
        return expo_sum;
    }

    public static double calculatePower(double x, int n) {
        if (n < 0) {
            return 1.0 / powHelper(x, Math.abs(n));
        }
        return powHelper(x, n);
    }

    public static double powHelper(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n % 2 == 0)
            return powHelper(x * x, n / 2);
        return x * powHelper(x * x, n / 2);
    }

    public static String calculateExponentialFunction(String a, String b, String x) {
        double res;
        double t_a, t_b;
        int t_x;
        t_a = Long.parseLong(a);

        if (b.equals("e")) {
            res = naturalExponential(Integer.parseInt(x));
        }
        else {
            t_b = Double.parseDouble(b);
            t_x = Integer.parseInt(x);
            res = calculatePower(t_b, t_x);
        }
        res = t_a * res;
        System.out.println("Result = " + res + "\n");
        return Double.toString(res);
    }
}
