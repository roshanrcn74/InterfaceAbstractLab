/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roshann
 */
public class Startup {
    public static void main(String[] args) {
        IntroJavaCourse introJavaCource = new IntroJavaCourse("Introduction To Java", "C001");
        introJavaCource.setCredits(3.0);
        introJavaCource.setPrerequisites("Intro Programming");
        
        IntroToProgrammingCourse introToPro = new IntroToProgrammingCourse("Introduction To Programming", "C002");
        introToPro.setCredits(4.0);
        
        AdvancedJavaCourse advanceJava = new AdvancedJavaCourse("Advancne Java OOD ", "C003");
        advanceJava.setCredits(3.0);
        advanceJava.setPrerequisites("Intro Java");
        
        List <ITCourse> courseList = new ArrayList();
        courseList.add(advanceJava);
        courseList.add(introToPro);
        courseList.add(introJavaCource);
        
        for (ITCourse cource : courseList){
            System.out.println("Course Name : " + cource.getCourseName() + "\t\t Credit ---> " + cource.getCredits());
            //System.out.println("No of Credit: " + cource.getCredits());
            
        }
    }
}
