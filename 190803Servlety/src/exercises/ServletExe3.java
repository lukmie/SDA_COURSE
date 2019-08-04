package exercises;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// http://localhost:8080/exercises.ServletExe3?index=2
@WebServlet("/exercises.ServletExe3")
public class ServletExe3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        if (request.getParameterMap().containsKey("index") && !request.getParameter("index").isEmpty()) {
            response.sendRedirect(request.getContextPath() + "/stronabledu.jsp");
        }

    }
}
