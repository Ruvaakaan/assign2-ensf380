package edu.ucalgary.oop;

public class CareProfile 
{

  private String [] medList;
  private String medInstructions;
  private String feedingInstructions;

  public CareProfile(String [] medList, String meds, String feeding) 
  {
    
    this.medList = medList;
    this.medInstructions = meds;
    this.feedingInstructions = feeding;

  }

  //NOT TOO SURE ABOUT OUTPUT BEING CORRECTLY FORMATTED
  public String summarizeCareInstructions() 
  {
    StringBuilder careInstructions = new StringBuilder("");

    for(int i = 0; i < medList.length; i++) 
    {
      careInstructions.append(medList[i]);

      if(i < medList.length - 1) 
      {
        careInstructions.append(", ");
      }
    }

    careInstructions.append("\n");
    careInstructions.append(medInstructions);
    careInstructions.append("\n");
    careInstructions.append(feedingInstructions);

    return careInstructions.toString();

  }

  


}