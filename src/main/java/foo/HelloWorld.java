package foo;// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {
    private static byte[] pixelImage = "1x1 pixel".getBytes();
    private static byte[] pixel2KB = new byte[2048];

    private static String GARBAGE = "blablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla";

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentLength(pixelImage.length);
        response.setContentType("image/gif");
        response.setHeader("foo", GARBAGE);
        response.setHeader("bar", GARBAGE);
        response.setHeader("baz", GARBAGE);
        response.setHeader("bas", GARBAGE);


        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(pixelImage);
    }

    public void destroy()
    {
        // do nothing.
    }
}
