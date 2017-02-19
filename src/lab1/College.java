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
    private ReportService reportService;
    private List<ProgrammingCourse> semisterInventry [];

    public College() {
        reportService = new GUIReportOutput();
        this.semisterInventry = new ArrayList[3]; 
        this.semisterInventry[0] = new ArrayList();
        this.semisterInventry[1] = new ArrayList();
        this.semisterInventry[2] = new ArrayList();
    }
    //There are there semisters(1,2,3), This methods use to add cources to each semister
    public void addCourseToSemister(ProgrammingCourse course, int semister){
        this.semisterInventry[semister-1].add(course);
        reportService.addData(course.getCourseName() + " is added to semister " + semister );
        reportService.outputReport();
        reportService.clearReport();
    }
    
    public List<ProgrammingCourse> getSemisterCourseList(int semister){
        if (semister < 1 || semister > 3){
            throw new IllegalArgumentException("Error: Semister should be 1 , 2 ,3");
        }
        return semisterInventry[semister];
    }
    
    public void displayCourseList(){
        for (int i = 0; i < semisterInventry.length; i++){
            this.reportService.addData("Semister " + (i+1) + "  Course Nanme");
            for(ProgrammingCourse course : semisterInventry[i]){
                this.reportService.addData("\t" + course.getCourseName());
            }   
        }
        this.reportService.outputReport();
    }  
}
