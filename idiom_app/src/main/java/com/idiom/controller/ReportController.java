package com.idiom.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

import com.idiom.repository.IdiomRepository;

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
	
	@GetMapping("/excel")
	public String exportReportToExcelFile() {
        try {
            // Step 1: Load the JRXML template
            JasperReport jasperReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/cherry.jrxml"));

            // Step 2: Prepare data for the report
            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(IR.findAll());

            // Step 3: Set report parameters
            Map<String, Object> parameters = new HashMap<>();

            // Step 4: Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanCollectionDataSource);

            // Step 5: Export the report to Excel format
            String outputPath = "src/main/resources/idiom.xlsx"; // Destination path
            File outputFile = new File(outputPath);

            // Create directories if they do not exist
            outputFile.getParentFile().mkdirs();

            // Export the file
            JRXlsxExporter exporter = new JRXlsxExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(new FileOutputStream(outputFile)));

            SimpleXlsxReportConfiguration config = new SimpleXlsxReportConfiguration();
            config.setOnePagePerSheet(false); // Customize as needed
            config.setDetectCellType(true);
            exporter.setConfiguration(config);

            exporter.exportReport();

            return "Excel file exported successfully to: " + outputPath;

        } catch (Exception e) {
            e.printStackTrace();
            return "Error while exporting Excel file: " + e.getMessage();
        }
    
    }
}