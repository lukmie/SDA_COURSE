import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class PostmasterServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        Enumeration<String> e = request.getParameterNames();

        while (e.hasMoreElements()) {
            String pname = e.nextElement();
            pw.println(pname + " = ");
            String pvalue = request.getParameter(pname);
            pw.println(pvalue);
        }

        pw.close();
    }
}
