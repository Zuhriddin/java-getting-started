/**
 * 
 */
package com.example.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zuhriddin
 *
 */
@Controller
public class MainController {

//	@Autowired
//	private DataSource dataSource;

	@RequestMapping("/")
	String index() {
		return "index";
	}

//	@RequestMapping("/db")
//	String db(Map<String, Object> model) {
//		try (Connection connection = dataSource.getConnection()) {
//			Statement stmt = connection.createStatement();
//			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
//			stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
//			ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");
//
//			ArrayList<String> output = new ArrayList<String>();
//			while (rs.next()) {
//				output.add("Read from DB: " + rs.getTimestamp("tick"));
//			}
//
//			model.put("records", output);
//			return "db";
//		} catch (Exception e) {
//			model.put("message", e.getMessage());
//			return "error";
//		}
//	}

}
