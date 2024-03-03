<%-- 
    Document   : index
    Created on : Mar 2, 2024, 7:52:09 PM
    Author     : Student99
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Controller</h1>

        <form method="post">
            <div>
                <h2>Subscribe</h2>
                <div>
                    <label>Name</label>
                    <input type="text" name="name" placeholder="Enter your name">
                </div>
                <div>
                    <label>Email</label>
                    <input type="email" name="email" placeholder="Enter your email">
                </div>
                <button type="submit">Subscribe</button>
            </div>
        </form>
    </body>
</html>
