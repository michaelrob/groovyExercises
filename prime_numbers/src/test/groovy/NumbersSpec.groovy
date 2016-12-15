import spock.lang.*
import com.michaelr.Numbers

class IsPrimeSpec extends Specification {

  def "should return true for prime number"() {
    setup:
    def prime = new Numbers()

    expect:
    prime.isPrime(53) == true
  }

  def "should return false for non-prime number"() {
    setup:
    def prime = new Numbers()

    expect:
    prime.isPrime(50) == false
  }
}
