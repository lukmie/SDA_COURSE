package exercises;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//        1. Uruchom servlet w wersji API 4.0
//        2. W metodzie doGet przekieruj na index.jsp
//        3. Za pomocą metody include servletu dołącz tekst np: ”Informacja z servletu”, aby wyświetlił
//        się na stronie.
//        4. Po tym jak dodasz tekst zmień include na forward i zobacz efekt.
@WebServlet("/exercises.ServletExe2")
public class ServletExe2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("/index2.jsp");
        rd.forward(request, response);

        response.getWriter().print("Welcome from servlet");


//        RequestDispatcher rd2 = request.getRequestDispatcher("/exercises.ServletExe2");
//        rd2.forward(request, response);
    }
}
