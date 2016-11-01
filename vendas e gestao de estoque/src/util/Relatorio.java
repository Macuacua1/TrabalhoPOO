/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import Modelo.PagamentoEmprestimo;
import Modelo.Venda;
import java.io.InputStream;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ILIDIOP
 */
public class Relatorio {
    
    public void gerarRelatorio(List<PagamentoEmprestimo> lista ) throws JRException{
        
        InputStream font=Relatorio.class.getResourceAsStream("Relatorios//recibs.jrxml");
        JasperReport report = JasperCompileManager.compileReport(font);
        JasperPrint print = JasperFillManager.fillReport(report, null,new JRBeanCollectionDataSource(lista));
                
        JasperViewer.viewReport(print,false);
        
    
 }
    
}
