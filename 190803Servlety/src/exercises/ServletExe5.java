package exercises;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// pol z zad4.jsp i zad3.jsp
// http://localhost:8080/exercises.ServletExe5?user=kuba

//      1. Skorzystaj z akcji JSP, aby przekazać obsługę żądania do widoku /menu.jsp, z parametrem
//      nameUser o wartości wyrażenia EL pobranego z atrybutu żądania.
@WebServlet("/exercises.ServletExe5")
public class ServletExe5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("/zad4.jsp");
        rd.forward(request, response);
    }
}
