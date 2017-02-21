/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author roshann
 */
public class GUIReportOutput extends ReportService {
    @Override
    public void outputReport() {
        JOptionPane.showMessageDialog(null, getReport());
        clearReport();
    }
    
}
