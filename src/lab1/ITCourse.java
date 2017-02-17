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
public abstract class ITCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    

    public abstract String getCourseName();
  

    public abstract void setCourseName(String courseName);
    
    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    public double getCredits(){
        return this.credits;
    }

    public abstract void setCredits(double credits);
    
}
