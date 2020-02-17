package com.mibu.chainofresponsability;

public class ItemFactory {

  public static Item generateItem(String type) {
    if (type.equals("Simple")) {
      return new SimpleItem();
    }
    if (type.equals("Punishment")) {
      return new PunishmentItem();
    }
    if (type.equals("Challenge")) {
      return new ChallengeItem();
    }
    return new SimpleItem();
  }
}
