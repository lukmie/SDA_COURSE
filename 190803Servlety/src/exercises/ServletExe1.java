package exercises;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/exercises.ServletExe1")
public class ServletExe1 extends HttpServlet {
    int j = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();

        if (httpSession.getAttribute("sesja") != null) {
            resp.getWriter().println("Wszystko ok. Licznik: " + j);
            j++;
            printWriter.println("</hr>");
        } else {
            httpSession.setAttribute("sesja" , "1");
            resp.getWriter().println("Wszystko przed nami.");
            printWriter.println("</hr>");
        }

        Cookie[] cookies = req.getCookies();

        for (int i = 0; i < cookies.length; i++) {
            String name = cookies[i].getName();
            String value = cookies[i].getValue();
            printWriter.println(name + ": " + value);
        }
        printWriter.close();
    }
}