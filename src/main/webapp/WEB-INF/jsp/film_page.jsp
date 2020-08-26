<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

    <head>
      <title>FilmChooser</title>
    </head>

    <body>
      <h4>Your genres: </h4>
      <c:forEach var="tempList" items="${tList}" >
        <tr>
          ${tempList}
        </tr>
      </c:forEach>

      <h4>Choose films you liked the most..</h4>
      <h6>*(If there is no films you've watched/liked,<br>just push next button.)</h6>


      <c:forEach var="fListTemp" items="${fList}" >
        <tr>
          <th><button>${fListTemp}</button></th>
        </tr>
      </c:forEach>

      <button>Next</button>
    </body>
</html>
