<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="style.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 
</head>
<body>
  <!-- Container Start -->
  <div id="container">
    <!-- Form Wrap Start -->
    <div class="form-wrap">
      <h1>REGISTRATION</h1>
      <!-- Form Start -->
      <form action="reg" method="post">
        <div class="form-group">
          <label for="first-name">User Name</label>
          <input type="text" name="username" id="first-name" required="required">
        </div>
        <div class="form-group">
          <label for="email">Email</label>
          <input type="email" name="email" id="email" required="required">
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" name="password" id="first-name" required="required">
        </div>
        <div class="form-group">
         
          <label for="cpass">Gender</label>
          </div>
          <input type="radio" name="radio" value="male" id="first-name"> Male
          <input type="radio" name="radio" value="female" id="first-name">    Female
          <input type="radio" name="radio" value="others" id="first-name">    Others
          <div class="form-group">
          <label for="password">ADDRESS</label>
          <textarea  style="width: 100%;height: 59px; border: #ddd 1px solid; border-radius: 5px;" name="address" id="first-name" required="required"></textarea>
        </div>       
        <button type="submit">Sign Up</button>
      </form>
      <!-- Form Close -->
    </div>
    <!-- Form Wrap Close -->
    <footer>
      <p>Already Have an Account? <a href="login.jsp">Login Here</a></p>
    </footer>
  </div>
  <!-- Container Close -->
</body>
</html>