function getFilm(){
    const film = await axios.get(
        'https://api.themoviedb.org/3/movie/550?api_key=6a06e1571de96a8f78a4dc0215849826'
        );
}

function getGenre() {
    const genre = document.getElementById("genre").textContent.toLowerCase();
    console.log(genre);
    
    return genre;
}

function getYear() {
    const year = document.getElementById().textContent.toLowerCase();
    console.log(year);

    return year;
}
