package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Employee> EMPLOYEE_ROW_MAPPER = (rs,i) -> {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setMailAddress(rs.getString("mail_address"));
		return employee;
	};
	
	public Employee findBy(String mailAddress) {
		String sql = "SELECT * FROM employees WHERE mail_address=:mailAddress";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("mailAddress", mailAddress);
		
		try {
			Employee employee = template.queryForObject(sql, param, EMPLOYEE_ROW_MAPPER);
			
			return employee;
		}catch(Exception ex) {
			Employee employee = new Employee();
			employee = null;
			
			return employee;
		}
	}
}
