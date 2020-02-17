package com.mibu.chainofresponsability;

import java.util.List;
import java.util.Random;

public class Dice {

  public static String throwDice() {
    List<String> allowedTypes = GameGenerator.getAllowedTypes();
    Random randomGenerator = new Random();

    // nuevo lanzamiento de dado, genera un nuevo tipo de item.
    String typeGenerated = allowedTypes.get(randomGenerator.nextInt(allowedTypes.size() - 1));
    System.out.println("nuevo lanzamiento, tipo Generado : " + typeGenerated);
    return typeGenerated;
  }
}
