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
        <hr>
        <ul id="movie-list">
            <c:forEach var="fListTemp" items="${fList}">
                <li class="movie-element" data-isliked="false">
                  <div class="movie-element__image">
                    <img src="${movieItem.image}" alt="${movieItem.title}">
                </div>
                <div class="movie-element__info">
                  <h5 id="title">${fListTemp.title}</h5> 
                  <h5 class="lighter"><span>Director: </span> ${fListTemp.producer}</h5>
                  <h5 class="lighter"><span>Year: </span>${fListTemp.yearOfProd}</h5>
                  <h5 class="lighter"><span>Genre: </span>${fListTemp.genre}</h5>
                </div>
                </li>
            </c:forEach>
        </ul>
        <div class="next-btn-container">
          <button id="next-btn">Next</button>
        </div>
    </body>
</html>
