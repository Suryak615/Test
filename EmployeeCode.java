package com.dnpass.corejavatraining.day4;


class EmployeeDetails {
	   
       int employeeNumber;
       String lastName;
       String firstName;
       String email;
       String officeCode;
       int reportsTo;
       String jobTitle;   

       public int getEmployeeNumber() {
         return employeeNumber;
       }

       public void setEmployeeNumber(int employeeNumber) {
          this.employeeNumber = employeeNumber;
       }

       public String getLastName() {
          return lastName;
       }

       public void setLastName(String lastName) {
          this.lastName = lastName;
       }
       
       public String getFirstName() {
          return firstName;
       }

       public void setFirstName(String firstName) {
          this.firstName = firstName;
       }

      public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public String getOfficeCode() {
           return officeCode;
       }
 
       public void setOfficeCode(String officeCode) {
             this.officeCode = officeCode;
       }

       public int getReportsTo() {
             return reportsTo;
       }

       public void setReportsTo(int reportsTo) {
             this.reportsTo = reportsTo;
       }

       public String getJobTitle() {
              return jobTitle;
       }

       public void setJobTitle(String jobTitle) {
             this.jobTitle = jobTitle;
       }
       
       public String toString()
       {
    	   return " Employee Details : \n EmployeeNumber = " +employeeNumber+   "\n Lastname = " +lastName+  "\n Fisrtname = " +firstName+  "\n Email = " +email+  "\n Officecode = " +officeCode+  "\n Reportsto = " +reportsTo+  "\n Jobtitle = " +jobTitle+ " " ;
              
       }

}

public class EmployeeCode {
	    
	    public static void main(String args[]) {
	    	
	    	EmployeeDetails emp = new EmployeeDetails();
	    	emp.setEmployeeNumber(12345678);
	    	emp.setLastName("Billa");
	    	emp.setFirstName("David");
	    	emp.setEmail("david@gmail.com");
	    	emp.setOfficeCode("Chennai");
	    	emp.setReportsTo(2456789);
	    	emp.setJobTitle("SoftwareEngineer");
	    	
	    	System.out.println(emp);
	    	
	    }
	

}
