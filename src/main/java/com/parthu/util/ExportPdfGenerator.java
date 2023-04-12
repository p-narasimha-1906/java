package com.parthu.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.parthu.entity.CitizenPlan;
import com.parthu.repo.CitizenPlanRepository;

@Component
public class ExportPdfGenerator {
	
	
	private CitizenPlanRepository repo;
	public void pdfGenerator(HttpServletResponse response, List<CitizenPlan> plans,File f) throws Exception{
		Document document = new Document(PageSize.A4);
		
		PdfWriter.getInstance(document, response.getOutputStream());
		PdfWriter.getInstance(document, new FileOutputStream(f));
		
		document.open();

		// Creating font
		// Setting font style and size
		Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		fontTiltle.setSize(20);

		// Creating paragraph
		Paragraph paragraph = new Paragraph("Citizen Plans", fontTiltle);

		// Aligning the paragraph in document
		paragraph.setAlignment(Paragraph.ALIGN_CENTER);

		// Adding the created paragraph in document
		document.add(paragraph);
		PdfPTable table = new PdfPTable(8);

		table.addCell("Id");
		table.addCell("CitizenPlan");
		table.addCell("PlanName");
		table.addCell("PlanStatus");
		table.addCell("Gender");
		table.addCell("StartDate");
		table.addCell("EndDate");
		table.addCell("BenifiAmount");

		for (CitizenPlan plan : plans) {
			table.addCell(String.valueOf(plan.getCitizenId()));
			table.addCell(plan.getCitizenName());
			table.addCell(plan.getPlanName());
			table.addCell(plan.getPlanStatus());
			table.addCell(plan.getGender());
			table.addCell(String.valueOf(plan.getPlanStartDate()) + "");
			table.addCell(String.valueOf(plan.getPlanEndDate()) + "");
			table.addCell(String.valueOf(plan.getBenifitAmt()));
		}
		document.add(table);
		document.close();
	}

}
