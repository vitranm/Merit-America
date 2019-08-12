import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "User")
public class User extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String firstName = request.getParameter("first_name");
          String lastName = request.getParameter("last_name");
          String favlang = request.getParameter("favlang");
          String hometown = request.getParameter("hometown");
          if (firstName == null) { firstName  = "Unknown"; }
          if (lastName == null) {lastName = "Unknown"; }
          if (favlang == null) {favlang = "Unknown"; }
          if (hometown == null) {hometown = "Unknown"; }
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          out.write("<h1>Welcome, " + firstName + " " + lastName + "!" +
                  "\n Your favorite language is: " + favlang +
                  "\n Your hometown is: " + hometown + "</h1>");
    }
}
