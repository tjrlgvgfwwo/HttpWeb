package com.http.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.http.web.entity.Person;
import com.http.web.entity.Result;
import com.http.web.entity.SchoolInfo;

public class JsonServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3432344373295802689L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		List<Person> persons = new ArrayList<Person>();
		
		List<SchoolInfo> schools = new ArrayList<SchoolInfo>();
		SchoolInfo school1 = new SchoolInfo("清华");
		SchoolInfo school2 = new SchoolInfo("北大");
		schools.add(school1); 
		schools.add(school2); 
		Person person1 = new Person("杨云锋", "http://192.168.1.108:8080/HttpWeb/images/2.jpg", 24, schools);
		
		List<SchoolInfo> schools1 = new ArrayList<SchoolInfo>();
		SchoolInfo school3 = new SchoolInfo("人大");
		SchoolInfo school4 = new SchoolInfo("浙大");
		schools1.add(school3); 
		schools1.add(school4); 
		Person person2 = new Person("jark", "http://192.168.1.108:8080/HttpWeb/images/1.jpg", 24, schools1);
		
		persons.add(person1);
		persons.add(person2);
		Result result = new Result(1, persons);
		PrintWriter printWriter = 	resp.getWriter();
		Gson gson = new Gson();
		printWriter.write(gson.toJson(result));
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
