package com.mibu.chainofresponsability;

public class Main {

  public static void main(String[] args) {

    // Genera automaticamente la cadena de responsabilidades,
    // de acuerdo a una lista, para esto permitiria armar la Cadena de forma dinamica
    Item game = GameGenerator.generateGame();

    System.out.println("Iniciando juego\n\n");

    for (int i = 0; i < 15; i++) {

      game.execute(Dice.throwDice());
      System.out.println("");
    }
  }
}
