package exercises;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// http://localhost:8080/zad3.jsp?user=Kuba
@WebServlet("/exercises.ServletExe4")
public class ServletExe4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.sendRedirect("/zad3.jsp");
//        RequestDispatcher rd = request.getRequestDispatcher("/zad3.jsp");
//        rd.forward(request, response);
//
//        response.getWriter().print("Welcome from servlet");


//        RequestDispatcher rd2 = request.getRequestDispatcher("/exercises.ServletExe2");
//        rd2.forward(request, response);
    }
}
