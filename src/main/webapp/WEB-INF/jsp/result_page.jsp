<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/styles/style.css"
    />
    <script src="https://unpkg.com/axios/dist/axios.min.js" defer></script>
    <script
      src="${pageContext.request.contextPath}/scripts/resultPageScript.js"
      defer
    ></script>
    <title>Filmer</title>
  </head>
  <body>
    <h1>Result_page</h1>
    <h3 id="genre">${resultFilm[0]}</h3>
    <h3 id="year">${resultFilm[1]}</h3>
    <div class="movie-element" data-isliked="false">
    <div class="movie-element__image">
      <img src="" alt="${movieItem.title}" />
    </div>
    <div class="movie-element__info">
      <h5 id="title"></h5>
      <div class="info">
        <span style="font-weight: bold">Director: </span>
        <p id="director"></p>
        <span style="font-weight: bold">Year: </span>
        <p id="yearOfProd"></p>
        <span style="font-weight: bold">Genre: </span>
        <p id="genre"></p>
        <span style="font-weight: bold">Plot: </span>
        <p id="plot"></p>
      </div>
    </div>
  </div>
  </body>
</html>
