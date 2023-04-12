package com.parthu.serviceimpl;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.parthu.entity.CitizenPlan;
import com.parthu.repo.CitizenPlanRepository;
import com.parthu.search.SearchRequest;
import com.parthu.service.ReportService;
import com.parthu.util.EmailSender;
import com.parthu.util.ExportExcelGenerator;
import com.parthu.util.ExportPdfGenerator;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private EmailSender emailSender;
	
	@Autowired
	private ExportPdfGenerator exportPdfGenerator;
	
	@Autowired
	private ExportExcelGenerator exportExcelGenerator;

	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public List<String> getPlanNames() {
		return repo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return repo.getPlaneStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		CitizenPlan entity = new CitizenPlan();
		if (null != request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if (null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}
		if (null != request.getGender() && !"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}
		if (null != request.getStartDate() && !"".equals(request.getStartDate())) {
			String startDate = request.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			// convert String to LocalDate
			LocalDate localDate = LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(localDate);
		}

		if (null != request.getEndDate() && !"".equals(request.getEndDate())) {
			String endDate = request.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			// convert String to LocalDate
			LocalDate localDate = LocalDate.parse(endDate, formatter);
			entity.setPlanEndDate(localDate);
		}

		// BeanUtils.copyProperties(request,entity);
		return repo.findAll(Example.of(entity));
	}

	@Override
	public boolean exportExcel(HttpServletResponse response) throws Exception {
		List<CitizenPlan> findAll = repo.findAll();
		
		File f=new File("Plans.xls");
		exportExcelGenerator.excelGenerate(response, findAll,f);
		
		String subject=" Registration";
		String body="<h1>Hi, Well come to  your email...........</h1>";
		String to="parthasaradhi1506@gmail.com";
		
		emailSender.sendEmail(subject,body,to,f);
		
		f.delete();
		return true;
	}

	@Override
	public boolean exportPdf(HttpServletResponse response) throws Exception {
		List<CitizenPlan> findAll = repo.findAll();
		File f=new File("Plans.pdf");
		exportPdfGenerator.pdfGenerator(response, findAll,f);
		
		String subject=" Registration";
		String body="<h1>Hi, Well come to  your email...........</h1>";
		String to="parthasaradhi1506@gmail.com";
		
		emailSender.sendEmail(subject,body,to,f);
		
		f.delete();
		return true;
	}

}
