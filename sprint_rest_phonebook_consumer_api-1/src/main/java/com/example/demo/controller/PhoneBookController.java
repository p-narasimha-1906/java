package com.example.demo.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.PhoneBookData;

@Controller
public class PhoneBookController {
	private String getData = "http://localhost:8080/getData";
	private String insert = "http://localhost:8080/insert";
	private String deleteData = "http://localhost:8080/delete/{i}";
	private String update = "http://localhost:8080/update/{i}";

	@GetMapping("/")
	public String getForm(Model model) {
		model.addAttribute("phone", new PhoneBookData());
		return "index";
	}

	@GetMapping("/viewForm")
	public String getData(Model model) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<List<PhoneBookData>> response = rt.exchange(getData, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<PhoneBookData>>() {
				});
		List<PhoneBookData> list = response.getBody();
		System.out.println(list);

		model.addAttribute("phone", new PhoneBookData());
		model.addAttribute("contacts", list);
		return "phonedata";
	}

	@PostMapping("/saveContact")
	public String insert(@ModelAttribute("phone") PhoneBookData p, Model model) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<PhoneBookData> re = rt.postForEntity(insert, p, PhoneBookData.class);
		model.addAttribute("msg", "contact saved");
		return "index";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") Integer id, Model model) {
		RestTemplate rt = new RestTemplate();
		rt.getForEntity(deleteData, PhoneBookData.class, id);
		ResponseEntity<List<PhoneBookData>> response = rt.exchange(getData, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<PhoneBookData>>() {
				});
		List<PhoneBookData> list = response.getBody();
		System.out.println(list);

		model.addAttribute("phone", new PhoneBookData());
		model.addAttribute("contacts", list);
		return "phonedata";
	}
  @GetMapping("/edit")
	public String update(@RequestParam("id") Integer id, Model model) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<PhoneBookData> p = rt.getForEntity(update, PhoneBookData.class, id);
		PhoneBookData m=p.getBody();
		model.addAttribute("phone",m);
		return "update";
	}

}
