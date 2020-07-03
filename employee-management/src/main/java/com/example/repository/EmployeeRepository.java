package com.example.repository;

import com.example.domain.*;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Employee> EMPLOYEE_ROW_MAPPER = (rs, i) -> {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		employee.setAge(rs.getInt("age"));
		employee.setGender(rs.getString("gender"));
		employee.setDevelopmentId(rs.getInt("development_id"));
		return employee;
	};

	/**
	 * 主キー検索を行う
	 * 
	 * @param id ID
	 * @return 検索された従業員情報
	 */
	public Employee load(Integer id) {
		System.out.println("Repositoryのload()が呼ばれました");

		String sql = "SELECT id,name,age,gender,development_id FROM employees WHERE id=:id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		Employee employee = template.queryForObject(sql, param, EMPLOYEE_ROW_MAPPER);

		return employee;
	}

	/**
	 * 全件検索を行う
	 * 
	 * @return 全従業員一覧
	 */
	public List<Employee> findAll() {
		System.out.println("RepositoryのfindAll()が呼ばれました");

		String sql = "SELECT id,name,age,gender,development_id FROM employees ORDER BY age";

		List<Employee> employeeList = template.query(sql, EMPLOYEE_ROW_MAPPER);

		return employeeList;
	}

	/**
	 * 渡した従業員情報を保存または更新する
	 * 
	 * @param employee 従業員情報
	 * @return 追加 or 更新された後の従業員情報
	 */
	public Employee save(Employee employee) {
		System.out.println("Repositoryのsave()が呼ばれました");

		SqlParameterSource param = new BeanPropertySqlParameterSource(employee);

		if (employee.getId() == null) {
			String insertSql = "INSERT INTO employees(name,age,gender,development_id) VALUES(:name,:age,:gender,:developmentId)";
			template.update(insertSql, param);
		} else {
			String updateSql = "UPDATE employees SET name=:name, age=:age, gender=:gender, development_id=:developmentId WHERE id=:id";
			template.update(updateSql, param);
		}
		return employee;
	}

	/**
	 * 主キーを使って１件の従業員情報を削除する
	 * 
	 * @param id ID
	 */
	public void deleteById(Integer id) {
		System.out.println("RepositoryのdeleteById()が呼ばれました");

		String deleteSql = "DELETE FROM employees WHERE id=:id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		template.update(deleteSql, param);
	}
}
