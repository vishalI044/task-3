package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class getEmpDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getEmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	static Logger log = Logger.getLogger(getEmpDetails.class.getClass());

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			
			int empCode = Integer.parseInt(JsonRequestReader.main(request));
			
			getEmployeeDeatils getEm = new getEmployeeDeatils();
			//getEm.getDetails(empCode);
			
			PrintWriter prt = response.getWriter();
			response.setContentType("application/json");
			
		    prt.println(getEm.getDetails(empCode));
			log.info(empCode);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(""+e);
		}
	}

}
