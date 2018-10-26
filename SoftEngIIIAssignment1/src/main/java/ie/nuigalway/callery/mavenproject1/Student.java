package ie.nuigalway.callery.mavenproject1;

import org.joda.time.DateTime;

/*
a. A student class should contain some attributes such as (Name, Age, DOB, ID,
username, courses and modules registered for, etc.).
A specific method (getUsername()) will generate the student’s username by
concatenating their name and age. 
*/

public class Student {
    private String name = "";
    private int age = 0;
    private String dob;
    private int id = 0;
    private String username = "";
    CourseProgramme courses;
    
    public Student(String n,int a, String d, int i, CourseProgramme c){
        this.name = n;
        this.age = a;
        this.dob = d;
        this.id = i;
        this.courses = c;
        this.username = createUsername(name, age);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public String getDOB()
    {
        return this.dob;
    }
    
    public int getID()
    {
        return this.id;
    }
    
    public String getUserame()
    {
        return this.username;
    }
            
    public String createUsername(String name, int age)
    {
        this.username = this.name+(char)this.age;
        return username;
    }
}
