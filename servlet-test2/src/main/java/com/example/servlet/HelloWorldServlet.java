package com.example.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
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

        // フォワード先のjspファイルパス
        String jsp_path = "/WEB-INF/jsp/hello.jsp";
        //JSP実行のためのハンドル生成
        RequestDispatcher dispatcher = request.getRequestDispatcher(jsp_path);
        //forwardでパスやリクエスト情報をJSPに渡す　レスポンスを生成させる
        dispatcher.forward(request, response);
    }
}