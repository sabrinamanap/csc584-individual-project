package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Prevent garbled UTF-8 characters
        request.setCharacterEncoding("UTF-8");

        // Collect form data
        String name = request.getParameter("name");
        String studentId = request.getParameter("studentId");
        String program = request.getParameter("program");
        String email = request.getParameter("email");
        String intro = request.getParameter("intro");

        // Handle multiple hobbies (checkbox)
        String[] hobbiesArr = request.getParameterValues("hobbies");
        String hobbies;

        if (hobbiesArr != null && hobbiesArr.length > 0) {
            hobbies = String.join(", ", hobbiesArr);
        } else {
            hobbies = "None";
        }

        // Send data to JSP using attributes
        request.setAttribute("name", name);
        request.setAttribute("studentId", studentId);
        request.setAttribute("program", program);
        request.setAttribute("email", email);
        request.setAttribute("hobbies", hobbies);
        request.setAttribute("intro", intro);

        // Forward to JSP page to display
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }
}
