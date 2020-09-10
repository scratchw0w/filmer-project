<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%@ taglib
prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <title>FilmFinder</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/main-styles.css">
    
        <script
            src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"
            defer
        ></script>
        <script
            src="${pageContext.request.contextPath}/scripts/filmPageScript.js"
            defer
        ></script>
        <script
           src="http://code.jquery.com/jquery-1.11.0.min.js"
           defer
        ></script>
    </head>

<head>
    <title>FilmChooser</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/style.css">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js" defer></script>
    <script src="${pageContext.request.contextPath}/scripts/filmPageScript.js" defer></script>
</head>

<body>

    <div>
        <div class="film-container">
            <div class="top-panel">
            <img id = "logo" src="images/popcorn.png"/>
            </div>
            <ul id="movie-list">
                <c:forEach var="fListTemp" items="${fList}">
                    <li class="movie-element" data-isliked="false">
                        <div class="movie-element__image">
                            <img src="${movieItem.image}" alt="${movieItem.title}">
                        </div>
                        <div class="movie-element__info">
                            <h5 id="title">${fListTemp.title}</h5>
                            <div class="info">
                                <span style="font-weight: bold;">Director: </span><p> ${fListTemp.producer}</p>
                                <span style="font-weight: bold;">Year: </span><p>${fListTemp.yearOfProd}</p>
                                <span style="font-weight: bold;">Genre: </span><p>${fListTemp.genre}</p>
                                <span style="font-weight: bold;">Plot: </span><p id="plot"></p>
                            </div>
                        </div>
                    </li>
                </c:forEach>
            </ul>
            <div class="next-btn-container">
                <button id="next-btn">Next</button>
            </div>
        </div>
    </div>
</body>

</html>