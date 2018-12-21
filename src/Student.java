public class Student{ 
    //define instance variables
    private String name;
    private int age;

    //Student Constructor
    public Student(String newName, int newAge) {
        setName(newName);
        setAge(newAge);
    }

    //Mutator method to set the student name
    public void setName(String newName) {
        name = newName;
    }

    //Accessor method to get the student name
    public String getName() {
        return name;
    }

    //Mutator method to check validity of data and set the student age
    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    //Accessor method to get the student age
    public int getAge() {
        return age;
    }

    //method to return student name and age
    public String fullString() {
        return ("\nName: " + name + "\nAge: " + age);
    }

    //method that determines the most likely level of schooling for the student
    public String determineTypeOfStudent(){
        if (age >= 0 && age <= 4) 
            return "preschool";
        else if (age == 5)
            return "kindergarten";
        else if (age > 5 && age <= 10)
            return "elementary school";
        else if (age > 10 && age <= 13)
            return "middle school";
        else if (age > 13 && age <= 17)
            return "high school";
        else  
            return "college";    
    }
} 