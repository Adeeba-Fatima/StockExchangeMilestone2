package com.example.SpringBoot.Service;

import java.sql.SQLException;
import java.util.List;

import com.example.SpringBoot.Model.Company;



public interface CompanyService {

	
	  public boolean insertCompany(Company company) throws SQLException;
	 //   public Company updateCompany(Company company);
		public List<Company> getCompanyList() throws SQLException;
		
}
