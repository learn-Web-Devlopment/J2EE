import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class session extends HttpServlet {

  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
    res.setContentType("text/html");
    HttpSession session = req.getSession();

    String str = req.getParameter("t1");

    session.setAttribute("user", str);
    PrintWriter out = res.getWriter();

    out.println("welcome " + str);

    out.print("<a href='http://localhost:2141/session/sessionC'>Click Me</a>");
  }
}
