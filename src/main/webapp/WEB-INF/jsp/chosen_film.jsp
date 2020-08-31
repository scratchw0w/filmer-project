<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/style.css">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js" defer></script>
    <script src="${pageContext.request.contextPath}/scripts/userFilm.js" defer></script>
    <title>FilmChooser</title>
</head>
<body>
    <li class="movie-element" data-isliked="false">
        <div class="movie-element__image">
            <img src="${movieItem.image}" alt="${movieItem.title}">
        </div>
        <div class="movie-element__info">
            <h5 id="title">${filmTitle}</h5>
            <div class="info">
                <span style="font-weight: bold;">Director: </span><p id="director"></p>
                <span style="font-weight: bold;">Year: </span><p id="year"></p>
                <span style="font-weight: bold;">Genre: </span><p id="genre"></p>
                <span style="font-weight: bold;">Plot: </span><p id="plot"></p>
                <div class="rate">
                    <span style="font-weight: bold;" id="imdbR">IMDB Rate: </span><p id="imdbRate"></p>
                    <span style="font-weight: bold;" id="metascoreR">Metascore: </span><p id="metascore"></p>
                </div>
            </div>
        </div>
    </li>
</body>
</html>