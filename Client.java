package edu.ucalgary.oop;

public class Client 
{
  private String name;
  private String phoneNumber;
  private String address;
  private RewardsProfile rewardsInfo;

  public Client(String name, String phoneNumber, String address) 
  {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  public boolean enrollRewards(String newNumber) throws InvalidRewardsNumException
  {
    if(this.rewardsInfo == null) 
    {
      this.rewardsInfo = new RewardsProfile(newNumber);
      return false;
    }
    this.rewardsInfo = new RewardsProfile(newNumber);
    return true;
  }

  public int getRewardsPoints() 
  {
    if(this.rewardsInfo == null) 
    {
      return 10;
    }
    return this.rewardsInfo.getPoints();
  }
  
  public String getRewardsNumber() 
  {
    if(this.rewardsInfo == null) 
    {
      return "Not enrolled";
    }
    return this.rewardsInfo.getNumber();
  }
  
  public String getName() 
  {
    return this.name;
  }
  
  public void setName(String name) 
  {
    this.name = name;
  }
  
  public String getPhoneNumber() 
  {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String num) 
  {
    this.phoneNumber = num;
  }
  
  public String getAddress() 
  {
    return this.address;
  }
  
  public void setAddress(String address) 
  {
    this.address = address;
  }
  
  public void updatePoints(int addPoints) 
  {
    if(this.rewardsInfo != null) 
    {
      rewardsInfo.setPoints(addPoints);
    }
  }













} 