import spock.lang.*
import com.michaelr.Numbers

class NumbersSpec extends Specification {

  @Shared number = new Numbers()

  def "should return true for prime number"() {
    expect:
    number.isPrime(53) == true
    number.isPrime(2) == true
  }

  def "should return false for non-prime number"() {
    expect:
    number.isPrime(50) == false
    number.isPrime(1) == false
  }
}
