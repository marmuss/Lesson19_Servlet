package tms.lesson19.registration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username").toLowerCase();
        String password = req.getParameter("password");

        User user = new User(name, username, password);
        InMemoryStorage inMemoryStorage = InMemoryStorage.getInstance();

        resp.getWriter().println(inMemoryStorage.add(user));

    }
}
