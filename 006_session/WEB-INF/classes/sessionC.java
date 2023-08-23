import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sessionC extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
    HttpSession session = req.getSession();
    
    String ses = (String)session.getAttribute("user");

    PrintWriter out = res.getWriter();

    out.println("User : " + ses);
    out.print("Session Id : " + session.getId());
  }
}
