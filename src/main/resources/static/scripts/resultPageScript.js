const movieElementInfo = document.querySelector(".movieElement");

function fillGaps(film) {
    document.getElementById("title").textContent = film.title;
    
    document.getElementById("yearOfProd").textContent = film.release_date.split('-')[0];
    document.getElementById("genre").textContent = film.runtime;
    document.getElementById("plot").textContent = film.overview;
    document.querySelector("img").src = `https://image.tmdb.org/t/p/w500${film.poster_path}`
    getFilmByIdAndShowRuntimeAndBudget(film.id);
}

async function getFilm() {
  const film = await axios.get(
    "https://api.themoviedb.org/3/movie/550?api_key=6a06e1571de96a8f78a4dc0215849826"
  );
}

async function getFilmByIdAndShowRuntimeAndBudget(id){
    const filmById = await axios.get(
        `https://api.themoviedb.org/3/movie/${id}?api_key=6a06e1571de96a8f78a4dc0215849826`
    ).then((response) => response.data);
    console.log(filmById);
    const budget = filmById.budget;
    if(budget == 0){
        document.getElementById("budg").textContent = "Unknown";
    } else {
        document.getElementById("budg").textContent = filmById.budget;
    }
    document.getElementById("runtime").textContent = filmById.runtime;
    
}

async function getGenres() {
  const genres = await axios
    .get(
      "https://api.themoviedb.org/3/genre/movie/list?api_key=6a06e1571de96a8f78a4dc0215849826&language=en-US"
    )
    .then((response) => response.data);
  return genres;
}

function getGenre() {
  const genre = document.getElementById("genre").textContent.toLowerCase();
  console.log(genre);

  return genre;
}

function getYear() {
  const year = document.getElementById("year").textContent.toLowerCase();
  console.log(year);

  return year;
}

async function getFilm() {
  const genres = await axios
    .get(
      "https://api.themoviedb.org/3/genre/movie/list?api_key=6a06e1571de96a8f78a4dc0215849826&language=en-US"
    )
    .then((response) => response.data);

  console.log(genres);
  let genreId;
  for (const genre of genres.genres) {
      if(genre.name.toLowerCase() == getGenre()) {
          genreId = genre.id;
          break; 
      }
  }
  console.log(genreId);

  const film = await axios
    .get(
      `
    https://api.themoviedb.org/3/discover/movie?api_key=6a06e1571de96a8f78a4dc0215849826&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&primary_release_year=${getYear()}&with_genres=${genreId}`
    )
    .then((response) => response.data);
   
    const resultFilm = film.results[Math.floor(Math.random() * 19 + 1)];
    console.log(resultFilm);
    fillGaps(resultFilm);
}



getFilm();
