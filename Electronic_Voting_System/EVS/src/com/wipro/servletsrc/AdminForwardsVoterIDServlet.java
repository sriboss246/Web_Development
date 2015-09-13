package com.wipro.servletsrc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminForwardsVoterIDServlet
 */
public class AdminForwardsVoterIDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminForwardsVoterIDServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("1userid");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		com.wipro.databasesrc.VoterID_Request_DAO x = new com.wipro.databasesrc.VoterID_Request_DAO ();
		String count= request.getParameter("countReq");
		System.out.println("1userid"+count);
		String userid,param;
		int i =Integer.parseInt(count);
		int flag1 = 0;
		for(int j=0;j<i;j++)
		{
			param="hid"+j;
			userid=request.getParameter(param);
			System.out.println(userid);
			 flag1=x.forward(userid);
		}
		if(flag1>0){  out.println("Successfully Forwarded"); }
		
		
		//System.out.println("Resultset Contains Display Function");
	/*	request.setAttribute("displayCandidate", rs);
		RequestDispatcher rd= request.getRequestDispatcher("DisplayCandidate.jsp");
		rd.forward(request, response);*/
	}

}
