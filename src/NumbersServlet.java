import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcmeter")
public class NumbersServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String meters = request.getParameter("metry");
        String centimeters = request.getParameter("centymetry");
        String milimeters = request.getParameter("milimetry");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        if (number != 1) {
            response.getWriter().println("<h3>wpisz tylko jedną wartość</h3>");
            return;
        }

        if (!"".eqals(metry)) {
            meters = Double.valueOf(metry);
            centimeters = meters * 100;
            milimeters = meters * 1000;
        }
        if (!"".equals(centymetry)) {
            centimeters = Double.valueOf(centymetry);
            meters = centimeters / 100;
            milimeters = centimeters * 10;
        }
        if (!"".equals(milimetry)) {
            milimeters = Double.valueOf(milimetry);
            meters = milimeters / 1000;
            centimeters = milimeters / 10;
        }
        response.getWriter().println("<h2>Przelicznik wartości:</h2>");
        response.getWriter().println("<h3>Metry:" + meters + "</h3>");
        response.getWriter().println("<h3>centymetry:" + centimeters + "</h3>");
        response.getWriter().println("<h2>milimetry:" + milimeters + "</h2>");
    }
    if(!"".eqals(metry)){
        calculator++;
    }
    if(!"".eqals(centymetry){
        calculator++;
    }
    if(!"".eqals(milimetry)){
        calculator++
    }
    return calculator;
}
}

