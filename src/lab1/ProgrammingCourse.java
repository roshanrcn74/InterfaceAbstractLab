/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author roshann
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;


    public String getCourseName(){
        return this.courseName;
    }
  

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseNumber(){
        return this.courseNumber;
    }

    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }

    public double getCredits(){
        return this.credits;
    }

    public void setCredits(double credits){
        this.credits = credits;
    }

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);  
    
    
}
