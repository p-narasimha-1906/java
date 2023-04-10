package com.parthu.runner;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.parthu.entity.CitizenPlan;
import com.parthu.repo.CitizenPlanRepository;
@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private CitizenPlanRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("Devid");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAmt(12000.0);
		
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denaied");
		c2.setDenialReason("Rental Income");
		
		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Smitha");
		c3.setGender("Female");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenifitAmt(12000.0);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminatedReason("Employeed");
		
		
		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("Tim");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitAmt(12000.0);
		
		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("Mick");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denaied");
		c5.setDenialReason("Rental Income");
		
		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Cathy");
		c6.setGender("Female");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenifitAmt(12000.0);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminatedReason("Employeed");
		
		CitizenPlan c7=new CitizenPlan();
		c7.setCitizenName("Rohit");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitAmt(12000.0);
		
		CitizenPlan c8=new CitizenPlan();
		c8.setCitizenName("Viral");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denaied");
		c8.setBenifitAmt(12000.0);
		c8.setDenialReason("Rental Income");
		
		CitizenPlan c9=new CitizenPlan();
		c9.setCitizenName("Kinny");
		c9.setGender("Female");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenifitAmt(12000.0);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminatedReason("Employeed");
		
		
		CitizenPlan c10=new CitizenPlan();
		c10.setCitizenName("Holder");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenifitAmt(12000.0);
		
		CitizenPlan c11=new CitizenPlan();
		c11.setCitizenName("Mick");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denaied");
		c11.setDenialReason("Rental Income");
		
		CitizenPlan c12=new CitizenPlan();
		c12.setCitizenName("Chinu");
		c12.setGender("Female");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminatedReason("Employeed");
		
		 List<CitizenPlan> asList = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		 repo.saveAll(asList);
		
		 
	}

}
