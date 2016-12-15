import spock.lang.*
import com.michaelr.IsPrime

class IsPrimeSpec extends Specification {
  def setup() {
    IsPrime isPrime = new IsPrime()
  }          // run before every feature method

  def "should return true for prime number"() {
    expect:
    isPrime == true
  }

  def "should return false for non-prime number"() {
    expect:
    isPrime == false
  }
}
