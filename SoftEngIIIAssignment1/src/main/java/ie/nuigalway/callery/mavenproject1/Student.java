package ie.nuigalway.callery.mavenproject1;

import org.joda.time.DateTime;

/**
 *
 * @author Naoise Callery
 */
public class Student {
    private String name = "";
    private int age = 0;
    private DateTime dob;
    private int id = 0;
    private String username = "";
    //courses
    //modules registered
    
    public String getName()
    {
        return this.name;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public DateTime getDOB()
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
            
    public void createUsername(String name, int age)
    {
        this.username = this.name+(char)this.age;
    }
}
