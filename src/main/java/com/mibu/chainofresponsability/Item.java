package com.mibu.chainofresponsability;

import java.util.Objects;

public abstract class Item {
  private Item nextItem;

  public void addNextItem(Item nextItem) {
    this.nextItem = nextItem;
  }

  public void execute(String typeGenerated) {
    if (getTypeDefinition().equals(typeGenerated)) {
      System.out.println(getAction());
    } else if (Objects.nonNull(nextItem)) {
      nextItem.execute(nextItem.getTypeDefinition());
    }
  }

  public abstract String getAction();

  public abstract String getTypeDefinition();
}
