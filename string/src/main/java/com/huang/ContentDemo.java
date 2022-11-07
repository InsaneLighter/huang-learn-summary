package com.huang;

/**
 * @Time 2022-11-01 11:28
 * Created by Huang
 * className: ContentDemo
 * Description:
 */
public class ContentDemo {
    public static void main(String[] args) {
        String content =  "<!DOCTYPE html>" +
                "<html lang=\"en\">" +
                "<head>" +
                "    <meta charset=\"UTF-8\">" +
                "    <title>Title</title>" +
                "    <script type=\"application/javascript\" src=\"../js/jquery.min.js\"></script>" +
                "</head>" +
                "<body>" +
                "    <h1>page1</h1>" +
                "</body>" +
                "<script type=\"application/javascript\">" +
                "    var method = function() {" +
                "        alert(\"page1\");" +
                "    }" +
                "" +
                "    $(function () {" +
                "        var item1 = window.localStorage.getItem('page1');" +
                "        clearInterval(item1);" +
                "        var t1 = setInterval(" +
                "            method" +
                "            , 5 * 1000);" +
                "        window.localStorage.setItem(\"page1\", t1);" +
                "    })" +
                "</script>" +
                "</html>";
    }
}
