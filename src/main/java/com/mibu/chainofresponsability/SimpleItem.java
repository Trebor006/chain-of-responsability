package com.mibu.chainofresponsability;

public class SimpleItem extends Item {

  @Override
  public String getAction() {
    return "Avanza XXX casillas...";
  }

  @Override
  public String getTypeDefinition() {
    return "Simple";
  }
}
