

public class ClassRoster
   {
       //instance variables
       
       
       
   public ClassRoster(  )//create a two-arg constructor here
      {
          
    
          
      }
      
   public String studentWithMaxGPA()
      {
        
      
      return null;//return the last name of the highest GPA
      } // end method studentWithMaxGPA 
       
   public int dropStudent( double minGPALevel )
      {
          
      return 0;
      } // end method dropStudent
      
   public void addStudent( Student newStudent )
      {
         
      } // end method addStudent
     
      
   public void addStudent(int index, Student newStudent)
      {
         
      } // end method addStudent
      
   public String toString()
      {
      String output = new String();
       output += "Class: " + courseName + "\n";
       
       for( Student student: studentList )
          {
          output += student + "\n";  
          } // end for
      return output;
      } // end method toString
   } // end ClassRoster