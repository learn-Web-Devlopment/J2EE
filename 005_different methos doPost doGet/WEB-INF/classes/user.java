import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class user extends HttpServlet {

  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
    String user = req.getParameter("t1");
    PrintWriter out = res.getWriter();
    out.print("Welcome " + user);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
    doPost(req, res);
  }
}
