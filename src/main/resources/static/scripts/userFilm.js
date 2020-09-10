let type = 0;
console.log(type + 2 + 2);

const goBack = document.getElementById("back-btn");

async function getInfo() {
        const title = document.querySelector("#title").textContent;
        const filmData = await axios.get(
            `http://www.omdbapi.com/?t=${title}&plot=full&apikey=a3d4f820`
        );
        
        const imgTag = document.querySelector("img");
        
        document.querySelector("#plot").textContent = filmData.data.Plot;
        document.querySelector("#director").textContent = filmData.data.Director;
        document.querySelector("#year").textContent = filmData.data.Year;
        document.querySelector("#genre").textContent = filmData.data.Genre;
        document.querySelector("#imdbRate").textContent = filmData.data.imdbRating;
        document.querySelector("#metascore").textContent = filmData.data.Metascore;
        console.log(imgTag);
        imgTag.src = filmData.data.Poster;
    
}

getInfo();
