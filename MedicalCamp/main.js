// changing nav background on scroll

window.onscroll = () => {
  const nav = document.querySelector("#navbar");
  if (this.scrollY <= 30) nav.className = "";
  else {
    nav.className = "nav-scroll-action";
  }
  if ((this, scrollY > 2400 && this.scrollY < 2500)) {
    counter("camps-count", 0, 400, 3000);
    counter("patients-count", 100, 50, 2500);
    counter("locations-count", 0, 40, 3000);
  }
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
document.addEventListener("DOMContentLoaded", () => {
  counter("camps-count", 0, 400, 3000);
  counter("patients-count", 100, 50, 2500);
  counter("locations-count", 0, 40, 3000);
});

// testimonial section js
var getTranslate;
var slideWidth;

var mySwiper = new Swiper(".slider .swiper", {
  speed: 7000,
  // ▼画像サイズに合わせて数値変更する
  slidesPerView: 3,
  loop: true,
  freeMode: true,
  freeModeMomentum: false,
  centeredSlides: true,
  autoplay: {
    delay: 0,
    disableOnInteraction: false,
  },
});

// contact form js
const nameEl = document.querySelector("#name");
const emailEl = document.querySelector("#email");
const companyNameEl = document.querySelector("#company-name");
const messageEl = document.querySelector("#message");

const form = document.querySelector("#submit-form");

function checkValidations() {
  let letters = /^[a-zA-Z\s]*$/;
  const name = nameEl.value.trim();
  const email = emailEl.value.trim();
  const companyName = companyNameEl.value.trim();
  const message = messageEl.value.trim();
  if (name === "") {
    document.querySelector(".name-error").classList.add("error");
    document.querySelector(".name-error").innerText =
      "Please fill out this field!";
  } else {
    if (!letters.test(name)) {
      document.querySelector(".name-error").classList.add("error");
      document.querySelector(".name-error").innerText =
        "Please enter only characters!";
    } else {
    }
  }
  if (email === "") {
    document.querySelector(".name-error").classList.add("error");
    document.querySelector(".name-error").innerText =
      "Please fill out this field!";
  } else {
    if (!letters.test(name)) {
      document.querySelector(".name-error").classList.add("error");
      document.querySelector(".name-error").innerText =
        "Please enter only characters!";
    } else {
    }
  }
}

function reset() {
  nameEl = "";
  emailEl = "";
  companyNameEl = "";
  messageEl = "";
  document.querySelector(".name-error").innerText = "";
}
