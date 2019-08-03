import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "InitFilter", urlPatterns = {"/Start"})
public class InitFilter implements Filter {
    public void destroy() {
        System.out.println("Destroy filter");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        if (req != null) {
            if (req.getParameterMap().containsKey("mail") && !req.getParameter("mail").isEmpty()) {
                ((HttpServletRequest)req).getSession().setAttribute("mail", req.getParameter("mail"));
                ((HttpServletResponse)resp).sendRedirect(((HttpServletRequest)req).getContextPath() + "/InfoServlet");
            }
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Init filter");
    }

}
