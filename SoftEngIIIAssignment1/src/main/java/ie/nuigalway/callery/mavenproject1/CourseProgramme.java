/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.callery.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Naoise Callery
 */
public class CourseProgramme {
    
    public enum course {
    CSIT, ECE, ENG, HIS,
    BIO, ETC
    }
    
    ArrayList<String> modules = new ArrayList<String>();
    ArrayList<String> students = new ArrayList<String>();
    
    /*A course programme class containing course name (CS & IT or ECE, etc.), list of
modules, list of students that are enrolled, academic start date and end date.
Start and end dates should use Joda Time classes (i.e. DateTime), which must be
added as a project dependency.*/

    
}
