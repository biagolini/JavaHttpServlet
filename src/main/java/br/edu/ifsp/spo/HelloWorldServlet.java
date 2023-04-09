package main.java.br.edu.ifsp.spo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/")
public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println("  #movingBox {");
        out.println("    position: absolute;");
        out.println("    width: 100px;");
        out.println("    height: 100px;");
        out.println("    text-align: center;");
        out.println("    line-height: 100px;");
        out.println("  }");
        out.println("</style>");
        out.println("<script>");
        out.println("  let movingBox, posX, posY, dx, dy, intervalId, colorChangeIntervalId;");
        out.println("  const colors = ['red', 'green', 'blue', 'yellow', 'purple', 'orange'];");
        out.println("  const randomColor = () => colors[Math.floor(Math.random() * colors.length)];");
        out.println("  function init() {");
        out.println("    movingBox = document.getElementById('movingBox');");
        out.println("    posX = 0;");
        out.println("    posY = 0;");
        out.println("    dx = 2;");
        out.println("    dy = 2;");
        out.println("    intervalId = setInterval(move, 10);");
        out.println("    colorChangeIntervalId = setInterval(changeColor, 500);");
        out.println("  }");
        out.println("  function move() {");
        out.println("    posX += dx;");
        out.println("    posY += dy;");
        out.println("    if (posX < 0 || posX > window.innerWidth - 100) {");
        out.println("      dx = -dx;");
        out.println("    }");
        out.println("    if (posY < 0 || posY > window.innerHeight - 100) {");
        out.println("      dy = -dy;");
        out.println("    }");
        out.println("    movingBox.style.left = posX + 'px';");
        out.println("    movingBox.style.top = posY + 'px';");
        out.println("  }");
        out.println("  function changeColor() {");
        out.println("    movingBox.style.backgroundColor = randomColor();");
        out.println("  }");
        out.println("</script>");
        out.println("</head>");
        out.println("<body onload='init()'>");
        out.println("  <div id='movingBox' style='background-color: red'>HelloWorld!</div>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
