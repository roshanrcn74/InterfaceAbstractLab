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
public abstract class ObjectOrientedCourse extends ITCourse{
    private String prerequisites;
    
    public abstract void setPrerequisites(String prerequisites);

    public String getPrerequisites() {
        return prerequisites;
    }
    
}
