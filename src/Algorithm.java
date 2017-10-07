import javafx.util.Pair;

import java.math.BigInteger;
import java.util.Random;

public class Algorithm {

    private BigInteger p;
    private BigInteger g;
    private BigInteger k;
    private BigInteger x;
    private BigInteger y;

    public Algorithm(BigInteger p, BigInteger x) {
        this.p = p;
        do {

            this.g = BigInteger.probablePrime(p.bitLength(), new Random());

        } while (!g.pow(p.intValue() - 1).mod(p).equals(BigInteger.ONE));

        this.k = BigInteger.probablePrime(p.bitLength() - 1, new Random());
        this.x = x;
        this.y =  g.pow(x.intValue()).mod(p);

    }

    public Pair<BigInteger, BigInteger> encrypt(int m) {

        BigInteger a = g.pow(k.intValue()).mod(p);
        BigInteger b = (y.pow(k.intValue())).multiply(BigInteger.valueOf(m)).mod(p);

        return new Pair<BigInteger, BigInteger>(a, b);

    }

    public int decrypt(BigInteger a, BigInteger b) {
        return b.multiply(a.pow(p.subtract(x).intValue() - 1) ).mod(p).intValue();
    }


}
