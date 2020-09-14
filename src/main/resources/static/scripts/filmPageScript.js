const movieListJsp = document.getElementById("movie-list");
const listItems = movieListJsp.querySelectorAll("li");
const nextBtn = document.getElementById("next-btn");

async function getFilms() {
    const title = "Titanic";
    const year = 1997;
    const films = await axios.get(
        `http://www.omdbapi.com/?t=${title}&y=${year}&apikey=a3d4f820`
    );
    const film = films.data;
    console.log(film);
}
async function getPoster() {
    for (const item of listItems) {
        const title = item.querySelector("h5").textContent;
        const filmData = await axios.get(
            `http://www.omdbapi.com/?t=${title}&apikey=a3d4f820`
        );
        const posterUrl = filmData.data.Poster;
        const plot = filmData.data.Plot;
        const imgTag = item.querySelector("img");
        item.setAttribute("data-plot", plot);
        item.querySelector("#plot").textContent = plot;
        console.log(imgTag);
        imgTag.src = posterUrl;
    }
}

function setHoverForFilmItem() {
    for (const item of listItems) {
        item.addEventListener("mouseenter", (event) => {
            console.log(event.target.tagName === "LI");
            console.log("entering...");
            if (item.classList.contains("liked")) {
                item.classList.add("brighter-green");
            } else {
                item.classList.add("brighter-white");
            }
        });

        item.addEventListener("mouseleave", (event) => {
            console.log(event.target.tagName === "LI");
            console.log("leaving...");
            if (item.classList.contains("liked")) {
                item.classList.remove("brighter-green");
            } else {
                item.classList.remove("brighter-white");
            }
        });
    }
}

function toggleLiked(item) {
    if (item.classList.contains("liked")) {
        item.classList.add("brighter-white");
        item.classList.remove("liked");
        item.classList.remove("brighter-green");
    } else {
        item.classList.remove("brighter-white");
        item.classList.add("brighter-green");
        item.classList.add("liked");
    }
}

function enteringResult() {
    //Sending
    let arr = [];
    for (const item of listItems) {
        arr.push(item.dataset.isliked);
    }
    $.post(`${document.URL}/process`, { "arr[]": arr });
    //href:

    setTimeout(20);
    location.href = "/result";
}

getFilms();
getPoster();
setHoverForFilmItem();

movieListJsp.addEventListener("click", (event) => {
    if (event.target.closest("li")) {
        const listItem = event.target.closest("li");
        toggleLiked(listItem);
        if (listItem.dataset.isliked === "true") {
            listItem.dataset.isliked = "false";
        } else {
            listItem.dataset.isliked = "true";
        }
        console.log(listItem.dataset.isliked);
    }
});
nextBtn.addEventListener("click", enteringResult);
