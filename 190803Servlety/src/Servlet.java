import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Start")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("<html>");
        response.getWriter().append("<body>");
        response.getWriter().append("<form>");
        response.getWriter().append("<label for=\"email\">email:</label>");
        response.getWriter().append("<input type=\"text\" name=\"mail\" />");
        response.getWriter().append("<input type=\"submit\" />");
        response.getWriter().append("</form>");
        response.getWriter().append("</body>");
        response.getWriter().append("</html>");
    }
}
