import java.math.BigInteger;
import static java.lang.Math.pow;
public class CyclesProg4 {
    public static void main(String[] args) {
        int n = 100;
        int square;
        BigInteger mult = new BigInteger("1");
        for (int i =1; i<=n; i++) {
            square = (int) pow(i, 2);
            mult = mult.multiply(BigInteger.valueOf(square));
        }
            System.out.println("Произведение квадратов первых 100 чисел = " + mult);
    }
}
