package com.parthu.service;

import java.util.List;

import com.parthu.entity.CitizenPlan;
import com.parthu.search.SearchRequest;

public interface ReportService {
	public List<String> getPlanNames();
	public List<String> getPlanStatus();
	public List<CitizenPlan> search(SearchRequest request);
	public boolean exportExcel();
	public boolean exportPdf();

}
