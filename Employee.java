package edu.ucalgary.oop;

public class Employee 
{

  private String name;
  private final String IDNUMBER;
  private String managerID;
  private Employee [] supervisedEmployees;

  public Employee(String name, String idNumber) 
  {
    this.name = name;
    this.IDNUMBER = idNumber;
  }
  
  public Employee(String name, String idNumber, String managerID) 
  {
    this.name = name;
    this.IDNUMBER = idNumber;
    this.managerID = managerID;
    this.supervisedEmployees = new Employee [0];
  }
  
  public String getName() 
  {
    return this.name;
  }
  
  public void setName(String name) 
  {
    this.name = name;
  }
  
  public String getIDNumber() 
  {
    return this.IDNUMBER;
  }
  
  public String getManagerID() 
  {
    return this.managerID;
  }
  
  public void setManagerID(String newManager)
  {
    this.managerID = newManager;
  }

  public void addEmployee(Employee newEmployee) 
  {
    this.supervisedEmployees = new Employee[this.supervisedEmployees.length + 1];
    if(this.supervisedEmployees.length < 10) 
    {
      this.supervisedEmployees[this.supervisedEmployees.length] = newEmployee;
    } 

    else 
    {
      System.out.println("Error: Cannot add more employees.");
    }
  }

  
  public Employee[] getEmployees() 
  {
    return this.supervisedEmployees;
  }
}

