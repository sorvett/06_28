package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class minato
 */
@WebServlet("/minato")
public class minato extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public minato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String name = "湊　雄輔";

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		SimpleDateFormat sd = new SimpleDateFormat("HH:mm");

		String today = sdf.format(date);
		String time = sd.format(date);

		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
			out.println("<title>" + name + "のプロフィール</title>");
		out.println("</head>");
		out.println("<body>");
			out.println("<p>" + today + "、" + name + "が" + time + "をお知らせします。</p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
