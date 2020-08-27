async function getFilms() {
    const films = await axios.get(
        "http://www.omdbapi.com/?i=tt3896198&apikey=a3d4f820"
    );
    const film = films.data;
    console.log(film);
}

getFilms();
