package com.parthu.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.parthu.entity.CitizenPlan;
import com.parthu.repo.CitizenPlanRepository;

@Component
public class ExportExcelGenerator {
	
	@Autowired
	private CitizenPlanRepository repo;
	
	public void excelGenerate(HttpServletResponse response, List<CitizenPlan> findAll,File file) throws Exception{
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("Plans-data");
		Row headerRow = sheet.createRow(0);
		
		headerRow.createCell(0).setCellValue("Id");
		headerRow.createCell(1).setCellValue("CitizenName");
		headerRow.createCell(2).setCellValue("PlanName");
		headerRow.createCell(3).setCellValue("PlanStatus");
		headerRow.createCell(4).setCellValue("Gender");
		headerRow.createCell(5).setCellValue("PlanStartDate");
		headerRow.createCell(6).setCellValue("PlanEndDate");
		headerRow.createCell(7).setCellValue("BenifitAmt");

		int dataRowIndex = 1;
		for (CitizenPlan plan : findAll) {
			Row dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(plan.getCitizenId());
			dataRow.createCell(1).setCellValue(plan.getCitizenName());
			dataRow.createCell(2).setCellValue(plan.getPlanName());
			dataRow.createCell(3).setCellValue(plan.getPlanStatus());
			dataRow.createCell(4).setCellValue(plan.getGender());
			
			if (null != plan.getPlanStartDate()) {
				dataRow.createCell(5).setCellValue(plan.getPlanStartDate() + "");
			} else {
				dataRow.createCell(5).setCellValue("N/A");
			}
			if (null != plan.getPlanEndDate()) {
				dataRow.createCell(6).setCellValue(plan.getPlanEndDate() + "");
			} else {
				dataRow.createCell(6).setCellValue("N/A");
			}
			if (null != plan.getBenifitAmt()) {
				dataRow.createCell(7).setCellValue(plan.getBenifitAmt());
			} else {
				dataRow.createCell(7).setCellValue("N/A");
			}

			dataRowIndex++;
			
		}
		
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
		
		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();
	}

}
