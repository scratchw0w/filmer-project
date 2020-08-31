async function getInfo() {
        const title = document.querySelector("#title").textContent;
        const filmData = await axios.get(
            `http://www.omdbapi.com/?t=${title}&apikey=a3d4f820`
        );
        
        const posterUrl = filmData.data.Poster;
        const year = filmData.data.Year;
        const genre = filmData.data.Genre;
        const director = filmData.data.Director;
        const plot = filmData.data.Plot;
        const rate = filmData.data.imdbRating;
        const metascore = filmData.data.Metascore;
        
        const imgTag = document.querySelector("img");
        
        document.querySelector("#plot").textContent = plot;
        document.querySelector("#director").textContent = director;
        document.querySelector("#year").textContent = year;
        document.querySelector("#genre").textContent = genre;
        document.querySelector("#imdbRate").textContent = rate;
        document.querySelector("#metascore").textContent = metascore;
        console.log(imgTag);
        imgTag.src = posterUrl;
    
}

getInfo();