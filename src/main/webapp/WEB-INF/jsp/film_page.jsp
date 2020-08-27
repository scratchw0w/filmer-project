<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

    <head>
      <title>FilmChooser</title>
      <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js" defer></script>
      <script src="${pageContext.request.contextPath}/scripts/filmPageScript.js" defer></script>
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

      <tr>
        <th>Title</th>
        <th>Producer</th>
        <th>Year</th>
        <th>Genre</th>
      </tr>
      <br>
      <c:forEach var="fListTemp" items="${fList}" >
        <tr>
          <th>${fListTemp.title}</th>
          <th>${fListTemp.producer}</th>
          <th>${fListTemp.yearOfProd}</th>
          <th>${fListTemp.genre}</th>
          <br>
        </tr>
      </c:forEach>

      <button>Next</button>
    </body>
</html>
