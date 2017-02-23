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
public class College {
    private String name;
    private final ReportService RS;
    private final List<ProgrammingCourse>[] semesterInventory;

    public College(String name) {
        setName(name);
        RS = new GUIReportOutput();
        this.semesterInventory = new ArrayList[3]; 
        this.semesterInventory[0] = new ArrayList();
        this.semesterInventory[1] = new ArrayList();
        this.semesterInventory[2] = new ArrayList();
    }
    //There are there semisters(1,2,3), This methods use to add cources to each semister
    public void addCourseToSemester(ProgrammingCourse course, int semester){
        this.semesterInventory[semester-1].add(course);
        RS.addData(course.getCourseName() + " is added to semester " + semester );
        RS.outputReport();
        RS.clearReport();
    }
    
    public List<ProgrammingCourse> getSemesterCourseList(int semister){
        if (semister < 1 || semister > 3){
            throw new IllegalArgumentException("Error: Semester should be 1 , 2 ,3");
        }
        return semesterInventory[semister-1];
    }
    
    public void displaySemesterCourseList(int semester){
        this.RS.addData("Semester " + (semester) + "  Course(s) Name");
        semesterInventory[semester-1].forEach((course) -> {
            this.RS.addData("\t" + course.getCourseName());
        });   
        this.RS.outputReport();
    }
    
    public void displayCourseList(){
        for (int i = 0; i < semesterInventory.length; i++){
            this.RS.addData("Semester " + (i+1) + "  Course(s) Name" + "\t" + "Credit");
            for(ProgrammingCourse course : semesterInventory[i]){
                this.RS.addData("\t" + course.getCourseName() + "\t" + course.getCredits());
            }   
        }
        this.RS.outputReport();
    }  
    
    public void reportService(String report){
        RS.clearReport();
        RS.addData(report);
        RS.outputReport();
        
    }

    public String getName() {
        return name;
    }
    
    public final void setName(String name){
        if (name == null || name.isEmpty()){
            this.RS.addData("Error: collegeName cannot be "
                    + "null of empty string");
            throw new IllegalArgumentException("Error: collegeName cannot be"
                    + " null of empty string");
        } 
        this.name = name;
    }
}
