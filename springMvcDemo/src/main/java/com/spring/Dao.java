package com.spring;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    public void saveOrUpdate(Employee employee) {
        String sql = "INSERT INTO springEmployee (name, id)"
                + " VALUES (?, ?,)";
        jdbcTemplate.update(sql, employee.getName(), employee.getId());
    }

    public List<Employee> list() {
        String sql = "SELECT * FROM Employee";
        List<Employee> employees = jdbcTemplate.query(sql, new RowMapper<Employee>() {




            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee();

                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));


                return employee;
            }

        });

        return employees;
    }

    public Employee get(int contactId) {
        String sql = "SELECT * FROM contact WHERE contact_id=" + contactId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Employee>() {

            public Employee extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    Employee employee = new Employee();
                    employee.setId(rs.getInt("id"));
                    employee.setName(rs.getString("name"));

                    return employee;
                }

                return null;
            }

        });
    }

}
