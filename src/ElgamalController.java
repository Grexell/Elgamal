import javafx.util.Pair;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.*;

public class ElgamalController {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        Elgamal elgamal = new Elgamal();

        int[] mess = elgamal.chars(message);


        Algorithm algorithm = new Algorithm(BigInteger.probablePrime(5, new Random()), BigInteger.probablePrime(4, new Random()));

        List<Pair<BigInteger, BigInteger>> pairs = new LinkedList<>();

        for (int i: mess) {

            pairs.add(algorithm.encrypt(i));

        }

        System.out.println(pairs.toString());

        for (Pair<BigInteger, BigInteger> i: pairs) {

            System.out.print(elgamal.charsTo(algorithm.decrypt(i.getKey(), i.getValue())));

        }

    }


}
