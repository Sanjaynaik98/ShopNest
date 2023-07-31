<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="style.css">
</head>
<body>
  <!-- Container Start -->
  <div id="container">
    <!-- Form Wrap Start -->
    <div class="form-wrap">
      <h1>LOGIN</h1>
      <!-- Form Start -->
      <form action="log" method="post">
        <div class="form-group">
          <label for="first-name">User Name</label>
          <input type="text" name="username" id="first-name" required="required">
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" name="password" id="first-name" required="required">
        </div>  
        <button type="submit">Login</button>
      </form>
      <!-- Form Close -->
    </div>
    <!-- Form Wrap Close -->
    <footer>
      <p>New to ShopNest ? <a href="register.jsp">Join now</a></p>
    </footer>
  </div>
  <!-- Container Close -->
</body>
</html>