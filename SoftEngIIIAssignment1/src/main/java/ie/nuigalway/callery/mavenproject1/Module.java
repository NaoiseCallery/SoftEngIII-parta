package ie.nuigalway.callery.mavenproject1;

import java.util.ArrayList;

public class Module {
    private String moduleName = "";
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<CourseProgramme> courses = new ArrayList<>();
    private int counter;
    
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
        Student[] res = new Student[students.size()];
        
        counter = 0;
        while(counter < students.size()){
            res[counter] = students.get(counter);
            counter++;
        }
        return res;
    }

    public void setStudents(Student[] s) {
        counter = 0;
        
        while(counter < s.length){
            this.students.add(s[counter]);
            counter++;
        }
    }
}
