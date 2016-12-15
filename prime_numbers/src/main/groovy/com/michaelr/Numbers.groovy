package com.michaelr

class Numbers {
  boolean isPrime(int number) {
    boolean prime = true

    (2..number).each {
      if (number == 1 || number % it == 0 && number != it) {
        prime = false
        return true
      }
    }

    return prime
  }
}
