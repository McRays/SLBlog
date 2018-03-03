<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Hello World!</title>
    </head>
    <body>
       <center>
       <p>
           welcome ${name} to sl blog!
       </p>

       <form action="/" method="get">
         <p>First name: <input type="text" name="fname" /></p>
         <p>Last name: <input type="text" name="lname" /></p>
         <input type="submit" value="Submit" />
       </form>

       <h4>我的好友：</h4>
       <#list friends as item>
               姓名：${item.name} , 年龄${item.age}
           <br>
       </#list>
       </center>
    </body>
</html>