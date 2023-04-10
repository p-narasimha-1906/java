package com.parthu.serviceimpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.parthu.entity.CitizenPlan;
import com.parthu.repo.CitizenPlanRepository;
import com.parthu.search.SearchRequest;
import com.parthu.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
	
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
		CitizenPlan entity= new CitizenPlan();
		if(null!=request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if(null!=request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}
		if(null!=request.getGender() && !"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}
		//BeanUtils.copyProperties(request,entity);
		return repo.findAll(Example.of(entity));
	}
	
	@Override
	public boolean exportExcel() {
		return false;
	}

	@Override
	public boolean exportPdf() {
		return false;
	}

}
