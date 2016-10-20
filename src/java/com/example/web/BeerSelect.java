/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.model.BeerExpert;
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

        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> result = be.getBrands(c);
    
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("results.jsp");
        view.forward(request, response);

    }

}