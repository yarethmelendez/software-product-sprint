package com.google.sps.servlets;

import java.io.IOException;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  String[] arrayString = {"Welcome to Portfolio", "Glad to be part of the SPS Program", "The beautiful thing about learning is that nobody can take it away from you", "Learning never exhausts the mind"};

    

  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    Random ran = new Random();
    String arr_ran = arrayString[ran.nextInt(arrayString.length)];
    response.setContentType("text/html;");
    response.getWriter().println("<h1>"+ arr_ran +"</h1>");
  }
}
