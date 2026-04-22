import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class VisitCounterServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
        int visits = 0;
        Cookie[] c= request.getCookies();
        if (c != null)
 {
            for (int i=0;i<c.length;i++) 
          {
                if (c[i].getName().equals("visitCount"))
              {
                   visits = Integer.parseInt(c[i].getValue());
                }
            }
        }
        visits++;
        Cookie v = new Cookie("visitCount", Integer.toString(visits));
        response.addCookie(v);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (visits == 1) 
{
            out.println("<html><head><title>Welcome</title></head><body>");
            out.println("<h2>Welcome to my website!</h2>");
            out.println("</body></html>");
  } 
else 
{
            out.println("<html><head><title>Visit Count</title></head><body>");
            out.println("<h2>You have visited this website " + visits + " times.</h2>");
            out.println("</body></html>");
        }
        out.close();
    }
}
