package com.plasmit.icare.repo;





import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.plasmit.icare.model.Patient;

@Repository
public class PatientRepository  {

	@Autowired
	JdbcTemplate jt;
	
	private static final String INSERT_PATIENT_QUERY = "INSERT INTO patient(pid,pname,disease,address) VALUES(?,?,?,?)";
	private static final String UPDATE_PATIENT_BY_ID_QUERY = "UPDATE patient SET pname=?,disease=?,address=? WHERE pid=?";
	//private static final String GET_PATIENT_BY_ID_QUERY = "SELECT * FROM patient WHERE pid =?";
	private static final String DELETE_PATIENT_BY_ID_QUERY = "DELETE FROM patient WHERE pid =?";
	private static final String GET_PATIENT_QUERY = "SELECT * FROM Patient";
	
	
	  private RowMapper<Patient> rowMapper = (ResultSet rs,int rowNum) -> {
		  Patient  patient = new Patient();
		  patient.setPid(rs.getInt(1));
		  patient.setPname(rs.getString(2));
		  patient.setDisease(rs.getString(3));
		  patient.setAddress(rs.getString(4));
		  return patient;
		  };
	 
		  public List<Patient> findAll() {
				
				return jt.query(GET_PATIENT_QUERY,rowMapper);
			}
	
	
	public boolean savePatient(Patient p) {
		if (jt.update(INSERT_PATIENT_QUERY,p.getPid(),p.getPname(),p.getDisease(),p.getAddress()) > 0 );
		return true;
		
	}


	public boolean updatePatient(Patient patient) {
		if (jt.update(UPDATE_PATIENT_BY_ID_QUERY,patient.getPname(),patient.getDisease(),patient.getAddress(),patient.getPid()) > 0 );
		return true;
	}


	public boolean deletePatient(int id) {
		if (jt.update(DELETE_PATIENT_BY_ID_QUERY,id) > 0 );
		return true;
	}
	

	

}
