import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

@WebServlet("/WitajSwiecieServlet")
public class WitajSwiecieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setWiek(36);
        user.setId(1);
        user.setImie("Sylwia");
        user.setNazwisko("Ciacho");

        User user1 = new User();
        user.setWiek(20);
        user.setId(2);
        user.setImie("Marek");
        user.setNazwisko("Marecki");

        request.setAttribute("lista", Arrays.asList(user, user1));
        request.setAttribute("cena", 29.9);
        request.setAttribute("data", new Date());

        request.setAttribute("user", user);
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        rd.include(request, response);
    }
}