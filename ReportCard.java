package edu.ucalgary.oop;

public class ReportCard {

  private final Booking REPORT;

  public ReportCard (Booking reportInfo) 
  {
    this.REPORT = reportInfo;
  }

  public String printReport ()
  {
    return REPORT.getCaregiver() 
      + " enjoyed taking care of " 
        + REPORT.getBookedPet();
  } 
}