<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
  <head>
    <title>FilmChooser</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/main-styles.css">
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.11.0.min.js" defer></script>
    <script
      src="${pageContext.request.contextPath}/scripts/mainPageScript.js"
      defer
    ></script>
  </head>

  <body>

    <header>
      <!-- LOGO + Title -->
      <h3>Film Finder</h3>

      <!-- yours (Max) -->
        <div class="searcher-class">
            <p id="find-text">Find your movie:</p> <input id = "text-input" type="text">
            <button id="find-movie-btn">Find</button>
        </div>


    </header>

    <!-- yours (Denys) -->
    <main>
      <div id="wrapper">
        <div id="header">
          <h3>Choose your favourite genre:</h3>
        </div>
      </div>
      <div class="genres-container">
        <div class="genres-container__nested">

          <div class="genres-items">
            <button id="action" class="genre-item" onclick="actionFunc()">Action</button>
  
            <button id="adventure" class="genre-item" onclick="adventureFunc()">Adventure</button>
  
            <button id="drama" class="genre-item" onclick="dramaFunc()">Drama</button>
  
            <button id="comedy" class="genre-item" onclick="comedyFunc()">Comedy</button>
  
            <button id="crime" class="genre-item" onclick="crimeFunc()">Crime</button>
          </div>
          <div class="genres-items">
            <button id="fantasy" class="genre-item" onclick="fantasyFunc()">Fantasy</button>
  
            <button id="horror" class="genre-item" onclick="horrorFunc()">Horror</button>
  
            <button id="historical" class="genre-item" onclick="historicalFunc()">Historical</button>
  
            <button id="mystery" class="genre-item" onclick="mysteryFunc()">Mystery</button>
  
            <button id="philosophical" class="genre-item" onclick="philosophicalFunc()">
              Philosophical
            </button>
          </div>
          <div class="genres-items">
            <button id="romance" class="genre-item" onclick="romanceFunc()">Romance</button>
  
            <button id="satire" class="genre-item" onclick="satireFunc()">Satire</button>
  
            <button id="social" class="genre-item" onclick="socialFunc()">Social</button>
  
            <button id="thriller" class="genre-item" onclick="thrillerFunc()">Thriller</button>
  
            <button id="western" class="genre-item" onclick="westernFunc()">Western</button>
  
          </div>
          <hr>
          <div class="genres-items__checkout">
            <input id="reset" type="button" value="Reset" class="genre-item brighter-red" onclick="clearFunc()" />
            <div class="next-container">
            <input
            id="checkout"
                type="button"
                onclick="checkoutFunc()"
                value="Next"
                class="genre-item brighter-green"
              />
            </div>
            </div>
          </div>
          
        </div>
      </div>
    </main>
  </body>
</html>
