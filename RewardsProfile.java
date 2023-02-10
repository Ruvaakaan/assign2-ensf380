package edu.ucalgary.oop;

public class RewardsProfile 
{
  private String rewardsNum = "Not enrolled";
  private int pointsTotal = 10;

  public RewardsProfile() {}

  public RewardsProfile(String newNumber) throws InvalidRewardsNumException
  {
    if(newNumber.matches("[a-zA-Z]+")) 
    {
      throw new InvalidRewardsNumException();
    }
    this.rewardsNum = newNumber;  //this isnt being called for some reason
  }

  public void setPoints(int addPoints)
  {
    this.pointsTotal += addPoints;
  }

  public int getPoints()
  {
    return this.pointsTotal;
  }

  public String getNumber()
  {
    return this.rewardsNum;
  }

}