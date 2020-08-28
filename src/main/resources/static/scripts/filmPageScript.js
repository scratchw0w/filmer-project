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

async function getPoster(){
    for (const item of listItems) {
        const title = item.querySelector("h5").textContent;
        const filmData = await axios.get(
            `http://www.omdbapi.com/?t=${title}&apikey=a3d4f820`
        );
        const posterUrl = filmData.data.Poster;
        const plot = filmData.data.Plot;
        const imgTag = item.querySelector("img");
        item.setAttribute("data-plot", plot);
        item.querySelector("#plot").textContent = plot
        console.log(imgTag);
        imgTag.src = posterUrl;
    }
}

getFilms();
getPoster();

movieListJsp.addEventListener("click", event =>{
    if(event.target.closest("li")){
        const listItem = event.target.closest("li");
        listItem.classList.toggle("liked");
        if(listItem.dataset.isliked === "true"){
            listItem.dataset.isliked = "false";
        } else {
            listItem.dataset.isliked = "true";
        }
        console.log(listItem.dataset.isliked);
    }
});

function enteringResult() {
  //Sending
  let arr = [];
  for (const item of listItems) {
      arr.push(item.dataset.isliked);
  }
  
  $.post(`${document.URL}/process`, {"arr[]": arr});
  //href:
  location.href="/result";
}

nextBtn.addEventListener("click", enteringResult);
