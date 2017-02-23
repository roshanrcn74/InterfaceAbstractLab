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
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be"
                    + " null of empty string");
        }
        this.courseName = courseName;
    }
    
    public String getCourseNumber(){
        return this.courseNumber;
    }

    public void setCourseNumber(String courseNumber){
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be"
                    + " null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits(){
        return this.credits;
    }

    public void setCredits(double credits){
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the "
                    + "range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);  
    
    
}
