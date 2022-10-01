import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Prime {

  public BigInteger getNthPrime(int n) {
    List<BigInteger> primes = new ArrayList<>();
    for (BigInteger number = BigInteger.valueOf(2); primes.size() < n; ) {
      if (isPrime(number))
        primes.add(number);
      number = number.add(BigInteger.ONE);
    }
    return primes.get(primes.size() - 1);
  }

  public boolean isPrime(BigInteger number) {
    if (number.compareTo(BigInteger.valueOf(1)) == 0)
      return false;
    for (BigInteger i = BigInteger.valueOf(2); i.compareTo(number.divide(BigInteger.valueOf(2))) <= 0; ) {
      if (number.mod(i).compareTo(BigInteger.ZERO) == 0 && number.compareTo(i) != 0)
        return false;
      else
        i = i.add(BigInteger.ONE);
    }
    return true;
  }
}