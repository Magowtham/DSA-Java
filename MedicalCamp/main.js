// flag for counter
// let flag = true;
// changing nav background on scroll
window.onscroll = () => {
  const nav = document.querySelector("#navbar");
  if (this.scrollY <= 30) nav.className = "";
  else nav.className = "nav-scroll-action";
};
// button redirect js
function redirectToUrl(url) {
  window.location.href = url;
}

const toggleButton = document.getElementById("toggle");
const sideBar = document.querySelector(".side-bar");
const bar1 = document.getElementById("bar1");
const bar2 = document.getElementById("bar2");
const bar3 = document.getElementById("bar3");

toggleButton.addEventListener("click", function () {
  sideBar.classList.toggle("side-bar-visible");
  bar1.classList.toggle("bar1-close");
  bar2.classList.toggle("bar2-close");
  bar3.classList.toggle("bar3-close");
});
// impact section counter js
document.addEventListener("DOMContentLoaded", () => {
  function counter(id, start, end, duration) {
    let obj = document.getElementById(id),
      current = start,
      range = end - start,
      increment = end > start ? 1 : -1,
      step = Math.abs(Math.floor(duration / range)),
      timer = setInterval(() => {
        current += increment;
        obj.textContent = current;
        if (current == end) {
          clearInterval(timer);
        }
      }, step);
  }
//   window.onscroll = () => {
//     if (this.scrollY > 2400 && flag != false) {
//       counter("camps-count", 0, 400, 3000);
//       counter("patients-count", 100, 50, 2500);
//       counter("who-are-we-count", 0, 40, 3000);
//       flag = false;
//     }
//   };
// });

//hero event slider section js
