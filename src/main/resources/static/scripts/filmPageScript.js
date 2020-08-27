const movieListJsp = document.getElementById("movie-list");
async function getFilms() {
    const title = "Titanic";
    const year = 1997;
    const films = await axios.get(
        `http://www.omdbapi.com/?t=${title}&y=${year}&apikey=a3d4f820`
    );
    const film = films.data;
    console.log(film);
}

async function getPoster(){
    const listItems = movieListJsp.querySelectorAll("li");
    for (const item of listItems) {
        const title = item.querySelector("h5").textContent;
        const filmData = await axios.get(
            `http://www.omdbapi.com/?t=${title}&apikey=a3d4f820`
        ); 
        const posterUrl = filmData.data.Poster;
        const imgTag = item.querySelector("img");
        console.log(imgTag);
        imgTag.src = posterUrl;
    }
    console.log(listItems);
}

getFilms();
getPoster();
