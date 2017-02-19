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
public class ConsoleOutput extends ReportService{

    @Override
    public void outputReport() {
        System.out.println(getReport());
        clearReport();
    }
    
}
