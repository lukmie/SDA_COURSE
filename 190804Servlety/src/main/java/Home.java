import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet("/Home")
//public class Home extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Student> studentList = new ArrayList<Student>();
//        Student student1 = new Student();
//        student1.setId(1);
//        student1.setName("Adam");
//        student1.setRole("developer");
//
//        Student student2 = new Student();
//        student2.setId(2);
//        student2.setName("Szymon");
//        student2.setRole("manager");
//
//        studentList.add(student1);
//        studentList.add(student2);
//
//        request.setAttribute("studentList", studentList);
//        request.setAttribute("tresc", "stworzone w nowej linii");
//        request.setAttribute("url", "http://google.pl");
//
//        RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
//        rd.forward(request, response);
//
//    }
//}
@WebServlet("/Home")
public class Home extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<Student>();
        Student student = new Student();
        student.setId(1);
        student.setName("Bogusz");
        student.setRole("Developer");
        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Adam");
        student1.setRole("Manager");
        studentList.add(student);
        studentList.add(student1);
        request.setAttribute("studentList", studentList);
        request.setAttribute("tresc", " stworozne  wnowej lini");
        request.setAttribute("url", "http://google.pl");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
        rd.forward(request, response);
    }
}
