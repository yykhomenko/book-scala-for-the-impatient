package org.cbi.scala_for_the_impatient.unit1

import org.specs2.mutable.Specification

class Ex8Test extends Specification {
  "U1 Ex8Test" should {
    "The string should not be empty" in { Ex8.value.isEmpty mustEqual false }
  }
}