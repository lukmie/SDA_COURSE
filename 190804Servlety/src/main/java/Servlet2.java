import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nameUser;
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            Connection connection = driver.connect("jdbc:mysql://localhost:3306/sda?user=root&password=admin&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", null);

            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into user value (null, ?, ?)");
            preparedStatement.setString(1, "Michal");
            preparedStatement.setString(2, "Cassssssssss");
            int i = preparedStatement.executeUpdate();
            if (i > 0 && i < 2) {
                response.getWriter().println("Rekord dodany.");
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
