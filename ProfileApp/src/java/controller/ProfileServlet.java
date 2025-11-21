package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String step = request.getParameter("step");

        // ------------------------------------
        // STEP 1 → FROM PERSONAL PAGE
        // ------------------------------------
        if ("1".equals(step)) {

            request.setAttribute("fullname", request.getParameter("fullname"));
            request.setAttribute("age", request.getParameter("age"));
            request.setAttribute("birthdate", request.getParameter("birthdate"));
            request.setAttribute("hobby", request.getParameter("hobby"));
            request.setAttribute("hobbyDesc", request.getParameter("hobbyDesc"));
            request.setAttribute("selfIntro", request.getParameter("selfIntro"));

            // Forward to Academic Page
            RequestDispatcher rd = request.getRequestDispatcher("academic.jsp");
            rd.forward(request, response);
            return;
        }

        // ------------------------------------
        // STEP 2 → FROM ACADEMIC PAGE
        // ------------------------------------
        request.setAttribute("fullname", request.getParameter("fullname"));
        request.setAttribute("age", request.getParameter("age"));
        request.setAttribute("birthdate", request.getParameter("birthdate"));
        request.setAttribute("hobby", request.getParameter("hobby"));
        request.setAttribute("hobbyDesc", request.getParameter("hobbyDesc"));
        request.setAttribute("selfIntro", request.getParameter("selfIntro"));

        request.setAttribute("studentID", request.getParameter("studentID"));
        request.setAttribute("personalEmail", request.getParameter("personalEmail"));
        request.setAttribute("studentEmail", request.getParameter("studentEmail"));
        request.setAttribute("faculty", request.getParameter("faculty"));
        request.setAttribute("course", request.getParameter("course"));
        request.setAttribute("semester", request.getParameter("semester"));

        RequestDispatcher rd = request.getRequestDispatcher("allInfo.jsp");
        rd.forward(request, response);
    }
}
