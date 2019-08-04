import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Browser", urlPatterns = {"/Browser"})
//@WebServlet("/Browser")
public class Browser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String browser = request.getHeader("user-agent");
        HttpSession httpSession = request.getSession();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();

        printWriter.println("Przegladarka to: ");
        printWriter.println("<hr/>");

        if (browser.indexOf("Chrome") != -1){ //nie nie istnieje czyli istnieje
            printWriter.println("Masz chrome.");
        } else if (browser.indexOf("Firefox") != -1) {
            printWriter.println("Masz firefox.");
        } else {
            printWriter.println("Masz co innego.");
        }
    }
}
