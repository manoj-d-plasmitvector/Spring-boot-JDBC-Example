package com.plasmit.icare.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.plasmit.icare.model.Patient;
import com.plasmit.icare.repo.PatientRepository;

@Service
@ComponentScan("com.plasmit.icare.model")
public class PatientService {

	@Autowired
	PatientRepository patientRepo;

	public List<Patient> getAll() {
		
		return patientRepo.findAll();
	}

	public String savePatient(Patient patient) {
		 String response;
		 if (patientRepo.savePatient(patient));
		 response = "Successfully Added";
		return response;
	}

	public String updatePatient(Patient patient) {
		 String response;
		 if (patientRepo.updatePatient(patient));
		 response = "Successfully updated";
		return response;
	}

	public String deletePatient(int id) {
		String response;
		 if (patientRepo.deletePatient(id));
		 response = "Successfully Deleted...";
		return response;
	}
}
