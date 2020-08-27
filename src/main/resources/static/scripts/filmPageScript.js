

async function getFilms() {
    const title = "Titanic";
    const year = 1997;

    const films = await axios.get(
        `http://www.omdbapi.com/?t=${title}&y=${year}&apikey=a3d4f820`
    );
    const film = films.data;
    console.log(film);
}

getFilms();
