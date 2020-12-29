package me.acs.modernJava.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.acs.modernJava.farm.predicates.AppleGreenColorPredicate;
import me.acs.modernJava.farm.predicates.AppleHeavyWeightPredicate;
import me.acs.modernJava.farm.predicates.ApplePredicate;


public class Inventory {

  public enum Color {RED, GREEN};

  public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple: inventory) {
      if (color.equals(apple.getColor())) {
        result.add(apple);
      }
    }

    return result;
  }

  public static List<Apple> filterApplesByWeight(List<Apple> inventory, Integer weight) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple: inventory) {
      if (apple.getWeight() > weight) {
        result.add(apple);
      }
    }

    return result;
  }

  public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple: inventory) {
      if (predicate.test(apple)) {
        result.add(apple);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    List<Apple> inventory = new ArrayList<>(Arrays.asList(
      new Apple(Color.RED, 150),
      new Apple(Color.GREEN, 200)
    ));

    System.out.println(filterApplesByColor(inventory, Color.RED));
    System.out.println(filterApplesByColor(inventory, Color.GREEN));

    System.out.println(filterApples(inventory, new AppleGreenColorPredicate()));

    System.out.println(filterApples(inventory, new AppleHeavyWeightPredicate()));

    System.out.println(filterApples(inventory, new ApplePredicate() {
        public boolean test(Apple apple) {
          return Color.RED.equals(apple.getColor());
        }
      }
    ));

  }

}
