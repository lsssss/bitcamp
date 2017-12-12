// 파일 업로드 처리하기 V
//
package step8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet12")
@MultipartConfig(
        // location="/tmp"
        maxFileSize = 1024 * 1024 * 10, // 업로드 파일 한 개의 최대 크기
        maxRequestSize = 1024 * 1024 * 100 // 한 번 요청으로 보내는 데이터의 최대 크기
       // fileSizeThreshold = 1024 * 1024 // 파일을 업로드 할 떄 버퍼

)

public class Servlet12 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        // 멀티 파트로 전송된 데이터를 분석하여 값과 파일명을 꺼내
        // 다음 변수에 저장할 것이다.
        String name = null;
        String age = null;
        String photo1OriginalFilename = null;
        String photo1NewFilename = null;
        String photo2OriginalFilename = null;
        String photo2NewFilename = null;

        // 이 부분에 멀티파트로 전송된 데이터를 분석하는 코드를 작성하라!
        // => Apache FileUpload 라이브러리 사용하기
        //
        // 멀티파트 데이터를 받아서 각 파트 데이터를 FileItem 객체로 만들고,
        // 파일은 외부 저장장치(HDD)에 저장하는 역할을 수행한다.

        // 멀티 파트로 전송된 요청 정보를 다루는 역할을 수행한다.

        // List에 담겨 있는 FileItem 객체를 사용하기 쉽게 Map으로 옮긴다.
        try {
           
            ServletContext context = this.getServletContext();
            String path = context.getRealPath("/step8");
            
            name = req.getParameter("name");
            age = req.getParameter("age");
            
            Part photo1Part = req.getPart("photo1");
            photo1OriginalFilename = photo1Part.getSubmittedFileName();
            //  photo1NewFilename = getNewFilename(photo1OriginalFilename);
            //  photo1Part.write(photo1NewFilename);
            photo1NewFilename = writeUploadFile(photo1Part, path);
            
            
            Part photo2Part = req.getPart("photo2");
            photo2OriginalFilename = photo2Part.getSubmittedFileName();
            // photo2NewFilename = getNewFilename(photo2OriginalFilename);
            // photo2Part.write(photo2NewFilename);
            photo2NewFilename = writeUploadFile(photo2Part, path);
      
        

        } catch (Exception e) {
            throw new ServletException(e);
        }

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>파일 업로드 결과</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>파일 업로드 결과</h1>");

        out.printf("이름 = %s<br>\n", name);
        out.printf("나이 = %s<br>\n", age);

        out.printf("사진1 = %s<br>\n", photo1OriginalFilename);
        out.printf("<img src='%s' width='200'><br>\n", photo1NewFilename);

        out.printf("사진2 = %s<br>\n", photo2OriginalFilename);
        out.printf("<img src='%s'width='200'><br>\n", photo2NewFilename);

        out.println("</body>");
        out.println("</html>");
    }

    long prevMillis = 0;
    int count = 0;

    synchronized private String getNewFilename(String filename) {
        long currMillis = System.currentTimeMillis();
        if (prevMillis != currMillis) {
            count = 0;
            prevMillis = currMillis;
        }

        return currMillis + "_" + count++ + extractFileExtName(filename);
    }

    // 파일명에서 뒤의 확장자명을 추출한다.
    private String extractFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");

        if (dotPosition == -1)
            return "";

        return filename.substring(dotPosition);
    }
    
    private String writeUploadFile(Part part, String path) throws IOException {
        
        BufferedInputStream in =new BufferedInputStream( part.getInputStream());
        String filename = getNewFilename(part.getSubmittedFileName());
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path + "/" + filename ));
        
        int b;
        while((b = in.read()) != -1) {
            out.write(b);
        }
        out.flush();
        
        in.close();
        out.close();
        
        return filename;
    }
}

// 멀티파트 데이터 형식 예)
/*
 * POST /bitcamp-java-web/step8/Servlet08 HTTP/1.1 Host: localhost:9999
 * Content-Length: 16164 Pragma: no-cache Cache-Control: no-cache Origin:
 * http://localhost:9999 Upgrade-Insecure-Requests: 1 Content-Type:
 * multipart/form-data; boundary=----WebKitFormBoundaryOmN8vafzkCySzU9a
 * User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_2)
 * AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36
 * Accept:
 * text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng
 * Referer: http://localhost:9999/bitcamp-java-web/step8/Servlet08.html
 * Accept-Encoding: gzip, deflate, br Accept-Language:
 * ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
 * 
 * ------WebKitFormBoundaryOmN8vafzkCySzU9a Content-Disposition: form-data;
 * name="name"
 * 
 * 홍길동 ------WebKitFormBoundaryOmN8vafzkCySzU9a Content-Disposition: form-data;
 * name="age"
 * 
 * 20 ------WebKitFormBoundaryOmN8vafzkCySzU9a Content-Disposition: form-data;
 * name="photo1"; filename="photo11.jpeg" Content-Type: image/jpeg
 * 
 * 바이너리 데이터.... -----WebKitFormBoundaryOmN8vafzkCySzU9a Content-Disposition:
 * form-data; name="photo2"; filename="photo12.jpeg" Content-Type: image/jpeg
 * 
 * 바이너리 데이터... ------WebKitFormBoundaryOmN8vafzkCySzU9a--
 */
