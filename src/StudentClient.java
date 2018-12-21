public class StudentClient{  
  public static void main( String [] args ){
    Student student1 = new Student("Bob", 15); 
    Student student2 = new Student("Jan", 13);
    System.out.println("Name: " + student1.getName());
    System.out.println("Age: " + student1.getAge());
    System.out.println("Type of Student: " + student1.determineTypeOfStudent());

    System.out.println("\n" + student2.fullString());
    System.out.println("Type of Student: " + student2.determineTypeOfStudent());

    student1.setName("Ted");
    student1.setAge(35);

    System.out.println("\n" + student1.fullString());
    System.out.println("Type of Student: " + student1.determineTypeOfStudent());
  } 
}  