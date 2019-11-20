<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Operation Page</title> 
</head>
<body>
<body style="background-color:#feb236;">

 </center ><form action="addPerson"> 
<center>

 <input type="text" name="personId"  placeholder="UserID Number"> <br>
<input type="text" name="personName"  placeholder="UserNane" > <br> 
<button type="submit"> Add User  </button>  <center> <br>  <br>  <br> 




</form>
<form action="getPerson">
<input type="text" name="personId"   placeholder="UserID Number"> <br>
  <button type="submit"> Check user </button><br>  <br>
</form> <br>  <br>




// DELETE
<form action="deletedPerson" method="post" >
<input type="text" name="personId"    placeholder="UserID Number"> <br>
  <button type="submit"> Delete user </button><br>   Write the number of the user for deleting
</form> <br>  <br> 


<!--
<form action="updatePerson">
<input type="text" name="personId"    placeholder="UserID Number"> <br>
  <button type="submit"> Delete user </button><br>    Write the number of the user for deleting
</form> <br>  <br> 
--> 



 </form>
 




</form>



</body>
</html>
