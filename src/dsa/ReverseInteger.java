package dsa;

public class ReverseInteger {

    public static void main(String[] args) {
        int num = 1092;
        int num2 = reverse(num, 0);
        System.out.println(num2);
    }

    private static int reverse(int num, int result) {
        if (num <= 0) {
            return result;
        }
        int mod = num % 10;
        int remainder = num / 10;
        result = result * 10 + mod;
        return reverse(remainder, result);
    }
}

