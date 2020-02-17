package com.mibu.chainofresponsability;

public class ChallengeItem extends Item {

  @Override
  public String getAction() {
    return "Te retamos a hacer XXX sino, tendras un castigo";
  }

  @Override
  public String getTypeDefinition() {
    return "Challenge";
  }

  public String getNewChallenge() {
    return "new Challenge";
  }
}
