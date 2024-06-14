public class Exponentiation {
    public static int exponentiation(int N, int M) {
        if (M == 0) return 1;
        if (M == 1) return N;

        N = N * exponentiation(N, M - 1);

        return N;
    }
}