package com.idiom.controller;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import com.idiom.dao.IdiomRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@RestController
public class ReportController {
	@Autowired
    private IdiomRepository IR;
	
	@GetMapping("/pdf")
    public String generatePdf() throws FileNotFoundException, JRException {
		JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(IR.findAll());
		JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/cherry.jrxml"));
		
		HashMap<String, Object> map = new HashMap<>();
		JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
		
		JasperExportManager.exportReportToPdfFile(report, "src/main/resources/idiom.pdf");
		
		return "PDF Generated";
    }
}
