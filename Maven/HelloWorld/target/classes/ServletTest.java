

import com.tmaventopic.App;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTest extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {
        String zip = request.getParameter("zip" );
        App testApp = new App();
        testApp.testMethod();
        out.flush();
        out.close();
    }
}
