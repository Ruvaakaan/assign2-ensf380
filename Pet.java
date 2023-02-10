package edu.ucalgary.oop;

public class Pet 
{
  private final String NAME;
  private final String SPECIES;
  private final String BREED;
  private final String COLOUR;
  private boolean vaccineStatus = false;
  private Client owner;
  private EmergVet vet;
  private CareProfile care;

  public Pet (String name, String species, String breed, String colour, Client owner)
  {
    this.NAME = name;
    this.SPECIES = species;
    this.BREED = breed;
    this.COLOUR = colour;
    this.owner = owner;
  }

  public void setVet(EmergVet vet)
  {
    this.vet = vet;
  }

  public EmergVet getVet()
  {
    return this.vet;
  }

  public void updateVaccineStatus(boolean change) 
  {
    this.vaccineStatus = change;
  }
  
  public boolean getVaccineStatus() 
  {
    return this.vaccineStatus;
  }
  
  public void setCare(String[] meds, String medInstr, String feedingInstr) 
  {
    this.care = new CareProfile(meds, medInstr, feedingInstr);
  }
  
  public String getCareSummary() 
  {
    StringBuilder CareSummary = new StringBuilder("");
    CareSummary.append("Care for " 
      + getName() + ":" + "\n"
        + this.care.summarizeCareInstructions());

    return CareSummary.toString();
  }
  
  public Client getOwner() 
  {
    return this.owner;
  }
  
  public void setOwner(Client updateOwner) 
  {
    this.owner = updateOwner;
  }
  
  public String getName() 
  {
    return this.NAME;
  }
  
  public String getSpecies() 
  {
    return this.SPECIES;
  }
  
  public String getBreed() 
  {
    return this.BREED;
  }
  
  public String getColour() 
  {
    return this.COLOUR;
  }
}