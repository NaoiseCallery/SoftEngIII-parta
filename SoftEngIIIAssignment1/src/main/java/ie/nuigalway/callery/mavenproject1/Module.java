package ie.nuigalway.callery.mavenproject1;

import java.util.ArrayList;

public class Module {
    
    /*
    A module class, which should contain information such as module name, id (e.g.
CT417), list of students, courses it is associated with).
    */
    
    private String moduleName = "";
    private ArrayList<CourseProgramme> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private int counter = 0;
    
    public Module(String n,Student s,CourseProgramme c ) {
        this.moduleName = n;
        this.students.add(s);
        this.courses.add(c);
    }
    
    public String getName() {
        return moduleName;
    }

    public void setName(String Name) {
        this.moduleName = Name;
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
    
    public Student[] getStudent() {
        Student[] stu = new Student[students.size()];
        
        counter = 0;
        while(counter < students.size()){
            stu[counter] = students.get(counter);
            counter++;
        }
        return stu;
    }

    public void setStudents(Student[] s) {
        counter = 0;
        
        while(counter < s.length){
            this.students.add(s[counter]);
            counter++;
        }
    }
}
