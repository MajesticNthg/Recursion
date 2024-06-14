public class SumOfDigitsNumber {
    public static int sum (int S) {
        if (S < 10) return S;
        int sum = S % 10 + sum( S / 10);
        return sum;
    }
}