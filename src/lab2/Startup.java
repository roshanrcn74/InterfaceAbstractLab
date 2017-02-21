/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


/**
 *
 * @author roshann
 */
public class Startup {
    public static void main(String[] args) {  
        College college = new College("Carrol College");
        IntroJavaCourse introJavaCource = new IntroJavaCourse("Introduction To Java", "C001");
        introJavaCource.setCredits(2.0);
        introJavaCource.setPrerequisites("Intro Programming");
        
        IntroToProgrammingCourse introToPro = new IntroToProgrammingCourse("Introduction To Programming", "C002");
        introToPro.setCredits(1.0);
        
        AdvancedJavaCourse advanceJava = new AdvancedJavaCourse("Advancne Java OOD ", "C003");
        advanceJava.setCredits(3.0);
        advanceJava.setPrerequisites("Intro Java");
        
        college.addCourseToSemester(introToPro, 1);
        
        college.addCourseToSemester(introToPro, 2);
        college.addCourseToSemester(introJavaCource, 2);
        
        college.addCourseToSemester(introToPro, 3);
        college.addCourseToSemester(introJavaCource, 3);
        college.addCourseToSemester(advanceJava, 3);
        college.reportService("College : " + college.getName());
        college.displayCourseList();
        
        college.displaySemesterCourseList(3);
        
        //System.out.println("course Name " + WCTC.getSemisterCourseList(1).get(0).getCourseName());
     

    }
}
