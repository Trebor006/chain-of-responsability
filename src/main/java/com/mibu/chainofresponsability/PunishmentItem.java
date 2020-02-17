package com.mibu.chainofresponsability;

public class PunishmentItem extends Item {

  @Override
  public String getAction() {
    return "Tienes que hacer XXX como castigo";
  }

  @Override
  public String getTypeDefinition() {
    return "Punishment";
  }

  public String getNewPunishment() {
    return "new Punishment";
  }
}
