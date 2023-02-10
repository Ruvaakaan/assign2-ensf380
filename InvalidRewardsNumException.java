package edu.ucalgary.oop;

public class InvalidRewardsNumException extends Exception
{
  public InvalidRewardsNumException()
  {
    super("Error: Rewards numbers should only contain numbers");
  }
}
