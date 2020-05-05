import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Object title = "Login Form";
        request.setAttribute("title",title);
        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      response.setContentType("text/html; charset=UTF-8");

      Object title, body;
      String log = request.getParameter("login");
      String pass = request.getParameter("password");

        String login = "illya";
        String password = "123";

        if(log.equals(login) && pass.equals(password)){
          title = "Illya's page";
          body = "<h1 style=\"color:00b300\">Hello world!</h1>";

          request.setAttribute("title",title);
          request.setAttribute("body",body);

          request.getRequestDispatcher("/result.jsp").forward(request,response);
      }else{
          title = "ERROR";
          body = "<h1 style=\"color:#ff0000\">INVALID DATA!</h1>";

          request.setAttribute("title",title);
          request.setAttribute("body",body);

          request.getRequestDispatcher("/index.jsp").forward(request,response);
      }
    }
}