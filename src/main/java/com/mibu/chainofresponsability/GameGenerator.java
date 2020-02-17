package com.mibu.chainofresponsability;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GameGenerator {

  public static Item generateGame() {
    Item initialItem = null;
    Item lastItem = null;
    System.out.println("generando nuevo Juego");
    // generateGame in order by Types

    for (String typeToAddedInGame : getAllowedTypes()) {
      Item nextItem = ItemFactory.generateItem(typeToAddedInGame);
      System.out.println(nextItem.getTypeDefinition());

      if (Objects.isNull(initialItem)) {
        initialItem = nextItem;
        lastItem = initialItem;
      } else {
        lastItem.addNextItem(nextItem);
        lastItem = nextItem;
      }
    }
    return initialItem;
  }

  public static List<String> getAllowedTypes() {
    return Arrays.asList("Simple", "Punishment", "Challenge");
  }
}
