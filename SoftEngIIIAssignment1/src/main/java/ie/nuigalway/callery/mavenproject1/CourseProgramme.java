package ie.nuigalway.callery.mavenproject1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
    
    /*
    A course programme class containing course name (CS & IT or ECE, etc.), list of
modules, list of students that are enrolled, academic start date and end date.
Start and end dates should use Joda Time classes (i.e. DateTime), which must be
added as a project dependency.
    */
    
    private String courseName = "";
    private DateTime start;
    private DateTime end;
    private ArrayList<Module> modules = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private int counter = 0;
    
    public CourseProgramme(String n, DateTime s, DateTime e, ArrayList<Module> m, ArrayList<Student> st){
        this.courseName = n;
        this.start = s;
        this.end = e;
        this.modules = m;
        this.students = st;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setName(String n) {
        this.courseName = n;
    }
    
    public DateTime getStartDate() {
        return start;
    }

    public void setStartDate(DateTime s) {
        this.start = s;
    }

    public DateTime getEndDate() {
        return end;
    }

    public void setEndDate(DateTime e) {
        this.end = e;
    }
    
    public Module[] getModules() {
        Module[] mod = new Module[modules.size()];
        
        counter = 0;
        while(counter < modules.size()){
            mod[counter] = modules.get(counter);
            counter++;
        }
        return mod;
    }

    public void setModules(Module[] m) {
        counter = 0;
        
        while(counter < m.length){
            this.modules.add(m[counter]);
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
