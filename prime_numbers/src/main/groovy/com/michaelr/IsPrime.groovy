package com.michaelr

class IsPrime {
  boolean isPrime(int number) {
    boolean prime = true

    (2..number).each {
      if (number % it == 0 && number != it) {
        prime = false
        return true
      }
    }

    return prime
  }
}
