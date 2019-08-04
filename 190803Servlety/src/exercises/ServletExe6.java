package exercises;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//        Zadanie 5
//        Skorzystaj z akcji JSP, aby przekazać obsługę żądania do widoku /blad.jsp, z parametrem
//        przyczyna o wartości wyrażenia EL pobranego z atrybutu przyczyna o zasięgu żądania.
//        Instrukcja rozwiązania:
//        1. Utwórz akcję jsp:forward, odwołującą się do podanego adresu.
//        2. Skorzystaj ze znacznika jsp:param, aby przekazać dodatkowy parametr.
// http://localhost:8080/exercises.ServletExe6?przyczyna=kuba
@WebServlet("/exercises.ServletExe6")
public class ServletExe6 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("/zad5.jsp");
        rd.forward(request, response);
    }
}
