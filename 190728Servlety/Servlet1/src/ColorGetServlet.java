import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ColorGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String kolor = req.getParameter("kolor");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("Wybrany kolor: ");
        printWriter.println(kolor);
        printWriter.close();
    }
}
