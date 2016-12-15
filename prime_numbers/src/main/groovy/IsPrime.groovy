package michaelr.prime

class IsPrime {
  final int number

  IsPrime(int number) {
    this.number = number
  }

  void isPrime(int number) {
    def list = 1..100
    println list.findAll {
      x -> (2..Math.sqrt(x)).every { x % it != 0 }
    }
  }

  static void main(String[] args) {
    IsPrime prime = new IsPrime(5)
  }
}
