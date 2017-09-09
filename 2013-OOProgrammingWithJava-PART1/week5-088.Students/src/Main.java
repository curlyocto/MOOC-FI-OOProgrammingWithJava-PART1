
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        String name;
        String studentnumber;
       ArrayList<Student> studentList = new ArrayList<Student>();
   
       
       Scanner reader = new Scanner(System.in);
       
       while(true){
           System.out.print("name: ");
            name = reader.nextLine();
            
            if(name.isEmpty()){
                  System.out.println(studentList.toString());
                break;
              
              
            }
            
            System.out.print("studentnumber:");
            studentnumber = reader.nextLine();
            
            studentList.add(new Student(name, studentnumber));
           
       }
       
        System.out.print("Give search term: ");
        String input = reader.nextLine();
        
        for(Student s: studentList){
            if(s.getName().contains(input)){
                 System.out.println("Result: ");
                System.out.println(s);
            }
        }
        
       
       
       
    }
    
}
  
