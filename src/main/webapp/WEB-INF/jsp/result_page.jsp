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
    <div>
      
      <div class="film-container">
        <div class="logo-text-container">
          <h1 id="h1-logo-text">Our algorithm made this choice for you..</h1>
          </br>
          <h3 id = "h1-logo-text">Avarage year of film production is: <p id="year">${resultFilm[1]}</p></h3>
        </div>
    
    <div class="movie-element" data-isliked="false">
    <div class="movie-element__image">
      <img src="" alt="${movieItem.title}" />
    </div>
    <div class="movie-element__info">
      <h5 id="title"></h5>
      <div class="info">
        <span style="font-weight: bold">Year: </span>
        <p id="yearOfProd"></p>
        <span style="font-weight: bold">Genre: </span>
        <p id="genre">${resultFilm[0]}</p>
        <span style="font-weight: bold">Plot: </span>
        <p id="plot"></p>
        <span style="font-weight: bold">Runtime: </span>
        <p id="runtime"></p>
        <span style="font-weight: bold">Budget: </span>
        <p id="budg"></p>
      </div>
    </div>
  </div>
  </div>
  </div>
  </body>
</html>
