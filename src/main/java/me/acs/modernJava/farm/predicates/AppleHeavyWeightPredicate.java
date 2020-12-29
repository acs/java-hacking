package me.acs.modernJava.farm.predicates;

import me.acs.modernJava.farm.Apple;


public class AppleHeavyWeightPredicate implements ApplePredicate {

  public boolean test(Apple apple) {
    return apple.getWeight() > 150;
  }
}
