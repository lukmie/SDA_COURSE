import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession = req.getSession();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println();

        Date date = (Date) httpSession.getAttribute("date");

        if (date != null) {
            printWriter.println("Ostatni dostęp do strony:" + date + "</br>");
        }

        date = new Date();
        httpSession.setAttribute("date", date);
        printWriter.print("Aktualna data: " + date);
        printWriter.print("</br>");
    }
}
