<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%@ taglib
prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <title>FilmChooser</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/style.css">
        <script
            src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"
            defer
        ></script>
        <script
            src="${pageContext.request.contextPath}/scripts/filmPageScript.js"
            defer
        ></script>
    </head>

    <body>
        <h4>Your genres:</h4>
        <c:forEach var="tempList" items="${tList}">
            <tr>
                ${tempList}
            </tr>
        </c:forEach>

        <h4>Choose films you liked the most..</h4>
        <h6>
            *(If there is no films you've watched/liked,<br />just push next
            button.)
        </h6>

        <div class="desc-container">
            <h3>Title</h3>
            <h3>Producer</h3>
            <h3>Year</h3>
            <h3>Genre</h3>
        </div>
        <br />
        <ul id="movie-list">
            <c:forEach var="fListTemp" items="${fList}">
                <li>
                  <div class="movie-element__image">
                    <img src="${movieItem.image}" alt="${movieItem.title}">
                </div>
                <div class="movie-element__info">
                  <h5 id="title">${fListTemp.title}</h5> 
                  <h5>${fListTemp.producer}</h5>
                  <h5>${fListTemp.yearOfProd}</h5>
                  <h5>${fListTemp.genre}</h5>
                </div>
                </li>
            </c:forEach>
        </ul>
        <button>Next</button>
    </body>
</html>
