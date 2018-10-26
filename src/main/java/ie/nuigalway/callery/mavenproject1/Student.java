package ie.nuigalway.callery.mavenproject1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
    
    /*
    A student class should contain some attributes such as (Name, Age, DOB, ID,
username, courses and modules registered for, etc.).
A specific method (getUsername()) will generate the student’s username by
concatenating their name and age. 
    */
    
    private String name = "";
    private int age = 0;
    private DateTime dob;
    private int id = 0;
    private String username = "";
    private ArrayList<CourseProgramme> courses = new ArrayList<>();
    private int counter = 0;
    
    public Student(String n,int a, DateTime d, int i, CourseProgramme c){
        this.name = n;
        this.age = a;
        this.dob = d;
        this.id = i;
        this.courses.add(c);
        this.username = createUsername(name, age);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void setAge(int a) {
        this.age = a;
    }
    
    public DateTime getDOB()
    {
        return this.dob;
    }
    
    public void setDOB(DateTime d) {
        this.dob = d;
    }
    
    public int getID()
    {
        return this.id;
    }
    
    public void setID(int i) {
        this.id = i;
    }
    
    public String getUserame()
    {
        return this.username;
    }
            
    public String createUsername(String n, int a)
    {
        this.username = n.concat(Integer.toString(a));
        return username;
    }
    
    public CourseProgramme[] getCourseProgramme() {
        CourseProgramme[] course = new CourseProgramme[courses.size()];
        
        counter = 0;
        while(counter < courses.size()){
            course[counter] = courses.get(counter);
            counter++;
        }
        return course;
    }

    public void setCourseProgramme(CourseProgramme[] c) {
        counter = 0;
        
        while(counter < c.length){
            this.courses.add(c[counter]);
            counter++;
        }
    }
}
