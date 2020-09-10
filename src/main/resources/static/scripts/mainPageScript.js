const movieText = document.getElementById("text-input");
const findButton = document.getElementById("find-movie-btn");


let counter = 0;
let arr = new Array();
let counterToShow;


findButton.addEventListener("click", () => {
  console.log(movieText.value);
  let title = movieText.value;
  
  $.post(`${document.URL}/filmprocessing`, {"title": title});
  location.href="/film";
});

function checkCounter(){
  counter=0;
  if (document.getElementById("action").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("adventure").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("drama").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("comedy").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("crime").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("fantasy").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("horror").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("historical").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("mystery").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("philosophical").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("romance").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("satire").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("social").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("thriller").style.color=="orange") {
    counter++;
  }
  if (document.getElementById("western").style.color=="orange") {
    counter++;
  }

  counterToShow = counter+1;
  console.log(counterToShow);
}

function arrFill(){
  if (document.getElementById("action").style.color=="orange") {
    arr.push('action');
  }
  if (document.getElementById("adventure").style.color=="orange") {
    arr.push('adventure');
  }
  if (document.getElementById("drama").style.color=="orange") {
    arr.push('drama');
  }
  if (document.getElementById("comedy").style.color=="orange") {
    arr.push('comedy');
  }
  if (document.getElementById("crime").style.color=="orange") {
    arr.push('crime');
  }
  if (document.getElementById("fantasy").style.color=="orange") {
    arr.push('fantasy');
  }
  if (document.getElementById("horror").style.color=="orange") {
    arr.push('horror');
  }
  if (document.getElementById("historical").style.color=="orange") {
    arr.push('historical');
  }
  if (document.getElementById("mystery").style.color=="orange") {
    arr.push('mystery');
  }
  if (document.getElementById("philosophical").style.color=="orange") {
    arr.push('philosophical');
  }
  if (document.getElementById("romance").style.color=="orange") {
    arr.push('romance');
  }
  if (document.getElementById("satire").style.color=="orange") {
    arr.push('satire');
  }
  if (document.getElementById("social").style.color=="orange") {
    arr.push('social');
  }
  if (document.getElementById("thriller").style.color=="orange") {
    arr.push('thriller');
  }
  if (document.getElementById("western").style.color=="orange") {
    arr.push('western');
  }
  console.log(arr, counter);
}

function checkoutFunc() {
  document.getElementById("checkout").style.color = "green";
  checkCounter();
  if(counter==0){
  location.href="/";
  return;
  }
  arrFill();
  $.post(`${document.URL}/process`, {"arr[]": arr});
  location.href="/films";
}

function clearFunc(){
  checkCounter();
  if(counter == 0) return;
  location.href="/";
}

function actionFunc(){
  if (document.getElementById("action").style.color=="orange") {
    counter--;
    document.getElementById("action").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("action").style.color = "orange";
}

function adventureFunc(){
  if (document.getElementById("adventure").style.color=="orange") {
    counter--;
    document.getElementById("adventure").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("adventure").style.color = "orange";
}
function dramaFunc(){
  if (document.getElementById("drama").style.color=="orange") {
    counter--;
    document.getElementById("drama").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("drama").style.color = "orange";
}
function comedyFunc(){
  if (document.getElementById("comedy").style.color=="orange") {
    counter--;
    document.getElementById("comedy").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("comedy").style.color = "orange";
}
function crimeFunc(){
  if (document.getElementById("crime").style.color=="orange") {
    counter--;
    document.getElementById("crime").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("crime").style.color = "orange";
}
function fantasyFunc(){
  if (document.getElementById("fantasy").style.color=="orange") {
    counter--;
    document.getElementById("fantasy").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("fantasy").style.color = "orange";
}
function horrorFunc(){
  if (document.getElementById("horror").style.color=="orange") {
    counter--;
    document.getElementById("horror").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("horror").style.color = "orange";
}
function historicalFunc(){
  if (document.getElementById("historical").style.color=="orange") {
    counter--;
    document.getElementById("historical").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("historical").style.color = "orange";
}
function mysteryFunc(){
  if (document.getElementById("mystery").style.color=="orange") {
    counter--;
    document.getElementById("mystery").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("mystery").style.color = "orange";
}
function philosophicalFunc(){
  if (document.getElementById("philosophical").style.color=="orange") {
    counter--;
    document.getElementById("philosophical").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("philosophical").style.color = "orange";
}
function romanceFunc(){
  if (document.getElementById("romance").style.color=="orange") {
    counter--;
    document.getElementById("romance").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("romance").style.color = "orange";
}
function satireFunc(){
  if (document.getElementById("satire").style.color=="orange") {
    counter--;
    document.getElementById("satire").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("satire").style.color = "orange";
}
function socialFunc(){
  if (document.getElementById("social").style.color=="orange") {
    counter--;
    document.getElementById("social").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("social").style.color = "orange";
}
function thrillerFunc(){
  if (document.getElementById("thriller").style.color=="orange") {
    counter--;
    document.getElementById("thriller").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("thriller").style.color = "orange";
}
function westernFunc(){
  if (document.getElementById("western").style.color=="orange") {
    counter--;
    document.getElementById("western").style.color = "rgb(250, 27, 64)";
    return;
  }
  checkCounter();
  if(counter >= 3)
    return;
  document.getElementById("western").style.color = "orange";
}
