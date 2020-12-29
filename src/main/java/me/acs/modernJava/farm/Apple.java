package me.acs.modernJava.farm;

public class Apple {

  Inventory.Color color;

  Integer weight;

  public Apple(Inventory.Color color, Integer weight) {
    this.color = color;
    this.weight = weight;
  }

  public Object getColor() {
    return color;
  }

  public Integer getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "Apple{" + "color=" + color + '}';
  }

}
