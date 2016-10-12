/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.model.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author nick
 */
public class BeerSelect extends HttpServlet {
    public void doPost (HttpServletRequest request,
                        HttpServletResponse response)
                        throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br>");
        String c = request.getParameter("color");

        out.println("<br>Got beer color " + c);
        
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    }

}