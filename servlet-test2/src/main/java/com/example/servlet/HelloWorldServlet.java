package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//URLをServletクラスにマッピング http://localhost:8080/servlet-test2/HelloWorld
//Tomcatがクラスをロード,インスタンス生成
//リクエスト度にservice()にreq,respオブジェクトを渡し service()がメソッドを分岐
@WebServlet("/HelloWorld")
//HttpServletを継承 (メソッドをオーバーライド)
public class HelloWorldServlet extends HttpServlet {

    // /HelloWorld に GET リクエストがきたら処理
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // レスポンスをHTMLで返す
        response.setContentType("text/html; charset=UTF-8");

        // responseへ書き込むための文字ストリームを取得
        PrintWriter out = response.getWriter();

        // out.println呼び出し度にHTMLをストリーム経由でレスポンスバッファに書き込む
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HELLO</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
        out.println("  <div>Hello, World!</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}