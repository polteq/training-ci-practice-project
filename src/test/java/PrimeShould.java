import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PrimeShould {
  private Prime prime;

  @Before
  public void setUp() {
    prime = new Prime();
  }


  @Test
  public void indicate1AsNoPrime() {
    assertThat(prime.isPrime(BigInteger.valueOf(1)), is(false));
  }

  @Test
  public void indicate2AsPrime() {
    assertThat(prime.isPrime(BigInteger.valueOf(2)), is(true));
  }

  @Test
  public void indicate3AsPrime() {
    assertThat(prime.isPrime(BigInteger.valueOf(3)), is(true));
  }

  @Test
  public void indicate4AsNoPrime() {
    assertThat(prime.isPrime(BigInteger.valueOf(4)), is(false));
  }

  @Test
  public void give2AsFirstPrime() {
    assertThat(prime.getNthPrime(1), is(BigInteger.valueOf(2)));
  }

  @Test
  public void give3AsSecondPrime() {
    assertThat(prime.getNthPrime(2), is(BigInteger.valueOf(3)));
  }

  @Test
  public void give5AsThirdPrime() {
    assertThat(prime.getNthPrime(3), is(BigInteger.valueOf(5)));
  }

  @Test
  public void give541As100thPrime() {
    assertThat(prime.getNthPrime(100), is(BigInteger.valueOf(541)));
  }
}
