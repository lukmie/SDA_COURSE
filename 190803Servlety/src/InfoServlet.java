import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession(true).getAttribute("mail") == null) {
            response.sendRedirect(request.getContextPath() + "/Start");
        }

        response.getWriter().append("<html><strong>" + request.getSession(true).getAttribute("mail") + "<strong></html>");

    }
}
