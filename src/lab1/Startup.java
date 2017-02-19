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
public class Startup {
    public static void main(String[] args) {  
        College WCTC = new College();
        IntroJavaCourse introJavaCource = new IntroJavaCourse("Introduction To Java", "C001");
        introJavaCource.setCredits(2.0);
        introJavaCource.setPrerequisites("Intro Programming");
        
        IntroToProgrammingCourse introToPro = new IntroToProgrammingCourse("Introduction To Programming", "C002");
        introToPro.setCredits(1.0);
        
        AdvancedJavaCourse advanceJava = new AdvancedJavaCourse("Advancne Java OOD ", "C003");
        advanceJava.setCredits(3.0);
        advanceJava.setPrerequisites("Intro Java");
        
        WCTC.addCourseToSemister(introToPro, 1);
        
        WCTC.addCourseToSemister(introToPro, 2);
        WCTC.addCourseToSemister(introJavaCource, 2);
        
        WCTC.addCourseToSemister(introToPro, 3);
        WCTC.addCourseToSemister(introJavaCource, 3);
        WCTC.addCourseToSemister(advanceJava, 3);
        
        WCTC.displayCourseList();
        
        WCTC.displaySemesterCourseList(3);
        
        //System.out.println("course Name " + WCTC.getSemisterCourseList(1).get(0).getCourseName());
     

    }
}
