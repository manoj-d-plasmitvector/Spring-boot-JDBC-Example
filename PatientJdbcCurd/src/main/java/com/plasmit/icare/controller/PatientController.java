package com.plasmit.icare.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plasmit.icare.model.Patient;
import com.plasmit.icare.services.PatientService;


@RestController
@RequestMapping("/patient")
public class PatientController  {

	@Autowired
	PatientService patientServices;
	
	@GetMapping("/")
	public List<Patient> getAll(){
		return patientServices.getAll();
	}
	
	
	  @PostMapping("/add") 
	  public String savePatient(@RequestBody Patient patient){
		  return patientServices.savePatient(patient); 
	}
	 
	  @PutMapping("/") 
	  public String updatePatient(@RequestBody Patient patient){
		  return patientServices.updatePatient(patient); 
	}
	  @DeleteMapping("/{id}") 
	  public String deletePatient(@PathVariable("id") int id){
		  return patientServices.deletePatient(id); 
	}
	 
}
  