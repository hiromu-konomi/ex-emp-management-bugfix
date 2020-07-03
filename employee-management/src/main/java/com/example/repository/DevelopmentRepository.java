package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.domain.Development;

@Repository
public class DevelopmentRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Development> DEVELOPMENT_ROW_MAPPER = (rs,i) -> {
		Development development = new Development();
		development.setDevelopmentId(rs.getInt("development_id"));
		development.setDevelopmentName(rs.getString("development_name"));
		return development;
	};

	public Development load(Integer developmentId) {
		System.out.println("Repositoryのload()が呼ばれました");
		
		String sql = "SELECT * FROM developments WHERE id=:id";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("development_id", developmentId);
		
		Development development = template.queryForObject(sql, param, DEVELOPMENT_ROW_MAPPER);
		
		return development;
	}

	public List<Development> findAll() {
		System.out.println("RepositoryのfindAll()が呼ばれました");
		
		String sql = "SELECT * FROM developments ORDER BY development_id";
		
		List<Development> devlopmentList = template.query(sql, DEVELOPMENT_ROW_MAPPER);
		
		return devlopmentList;
	}

	public Development save(Development development) {
		System.out.println("Repositoryのsave()が呼ばれました");
		
		SqlParameterSource param = new BeanPropertySqlParameterSource(development);
		
		if(development.getDevelopmentId() == null) {
			String insertSql = "INSERT INTO developments(development_id,development_name) VALUES(:developmentId,:developmentName)";
			template.update(insertSql, param);
		}else {
			String updateSql = "UPDATE developments SET development_id=:developmentId, development_name=:developmentName WHERE development_id=:developmentId";
			template.update(updateSql, param);
		}
		return development;
	}

	public void delete(Integer developmentId) {
		System.out.println("Repositoryのdelete()が呼ばれました");
		
		String deleteSql = "DELETE FROM developments WHERE development_id=:developmentId";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("development_id", developmentId);
		
		template.update(deleteSql, param);
	}
}
