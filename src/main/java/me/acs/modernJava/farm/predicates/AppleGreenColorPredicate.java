package me.acs.modernJava.farm.predicates;

import me.acs.modernJava.farm.Apple;
import me.acs.modernJava.farm.Inventory;


public class AppleGreenColorPredicate implements ApplePredicate {

  public boolean test(Apple apple) {
    return Inventory.Color.GREEN.equals(apple.getColor());
  }
}
