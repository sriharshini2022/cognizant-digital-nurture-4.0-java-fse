// Question 1: JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
window.addEventListener("load", () => {
  alert("Page is fully loaded!");
});

// Question 2: Syntax, Data Types, and Operators
const eventName = "Spring Festival";
const eventDate = "2025-06-10";
let availableSeats = 25;
let eventInfo = `${eventName} on ${eventDate} | Seats left: ${availableSeats}`;
console.log(eventInfo);
function registerSeat() {
  if (availableSeats > 0) {
    availableSeats--;
    console.log(`Registered! Seats left: ${availableSeats}`);
  } else {
    console.log("Sorry, event is full!");
  }
}

// Question 3: Conditionals, Loops, and Error Handling
const eventsList = [
  { name: "Spring Festival", date: "2025-06-10", seats: 25 },
  { name: "Charity Run", date: "2024-04-04", seats: 0 },
  { name: "Music Night", date: "2025-07-22", seats: 10 }
];
function displayUpcomingEvents() {
  const today = new Date();
  eventsList.forEach(evt => {
    const evtDate = new Date(evt.date);
    if (evtDate > today && evt.seats > 0) {
      console.log(`[Event] ${evt.name} on ${evt.date} | Seats: ${evt.seats}`);
    }
  });
}
function tryRegister(eventObj) {
  try {
    if (eventObj.seats <= 0) throw new Error("Event Full");
    eventObj.seats--;
    console.log(`Registered for ${eventObj.name}. Remaining: ${eventObj.seats}`);
  } catch (err) {
    console.error(err.message);
  }
}

// Question 4: Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, date, seats, category) {
  eventsList.push({ name, date, seats, category });
}
function registerUser(eventName) {
  const evt = eventsList.find(e => e.name === eventName);
  tryRegister(evt);
}
function filterEventsByCategory(cat) {
  return eventsList.filter(ev => ev.category === cat);
}
// Closure: track registrations by category
function createCategoryCounter(category) {
  let count = 0;
  return function increment() {
    count++;
    console.log(`Total registrations for ${category}: ${count}`);
    return count;
  };
}
// Higher-order function for dynamic search
function filterEvents(callback) {
  return eventsList.filter(callback);
}

// Question 5: Objects and Prototypes
function Event(name, date, seats, category) {
  this.name = name;
  this.date = date;
  this.seats = seats;
  this.category = category;
}
Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};
const musicEvent = new Event("Music Night", "2025-07-22", 10, "Music");
console.log(Object.entries(musicEvent));

// Question 6: Arrays and Methods
let allEvents = [
  { name: "Spring Festival", category: "Festival" },
  { name: "Music Night", category: "Music" }
];
allEvents.push({ name: "Art Workshop", category: "Workshop" });
const musicEvents = allEvents.filter(e => e.category === "Music");
const eventCards = allEvents.map(e => `Event: ${e.name} (${e.category})`);
console.log(eventCards);

// Question 7: DOM Manipulation
const eventsContainer = document.querySelector("#eventsContainer");
function renderEvents(events) {
  eventsContainer.innerHTML = "";
  events.forEach(evt => {
    const card = document.createElement("div");
    card.className = "eventCard";
    card.textContent = `${evt.name} (${evt.category})`;
    eventsContainer.appendChild(card);
  });
}
function updateUIOnRegister(eventName) {
  // For demo: just re-render
  renderEvents(allEvents);
}

// Question 8: Event Handling
document.addEventListener("DOMContentLoaded", () => {
  document.querySelectorAll(".registerBtn").forEach(btn => {
    btn.onclick = function() {
      registerUser(this.dataset.event);
      updateUIOnRegister(this.dataset.event);
    };
  });
  document.getElementById("categoryFilter").onchange = function() {
    const filtered = filterEventsByCategory(this.value);
    renderEvents(filtered);
  };
  document.getElementById("searchInput").onkeydown = function(e) {
    const query = e.target.value.toLowerCase();
    const filtered = allEvents.filter(ev => ev.name.toLowerCase().includes(query));
    renderEvents(filtered);
  };
});

// Question 9: Async JS, Promises, Async/Await
function fetchEvents() {
  document.getElementById("spinner").style.display = "block";
  return fetch("https://mockapi.io/events.json")
    .then(res => res.json())
    .then(data => {
      console.log("Fetched events:", data);
      document.getElementById("spinner").style.display = "none";
      renderEvents(data);
    })
    .catch(err => {
      document.getElementById("spinner").style.display = "none";
      console.error("Fetching events failed", err);
    });
}
// Async/await version
async function fetchEventsAsync() {
  document.getElementById("spinner").style.display = "block";
  try {
    const res = await fetch("https://mockapi.io/events.json");
    const data = await res.json();
    renderEvents(data);
  } catch (err) {
    console.error("Async fetch failed", err);
  }
  document.getElementById("spinner").style.display = "none";
}

// Question 10: Modern JavaScript Features
const newEvent = { name: "Dance Show", date: "2025-09-12", seats: 50, category: "Music" };
const { name, date, ...rest } = newEvent; // Destructuring
const allEventsClone = [...allEvents]; // Spread
function modernAddEvent(event, list = allEvents) {
  list.push({ ...event });
}

// Question 11: Working with Forms
document.getElementById("regForm").addEventListener("submit", function(e) {
  e.preventDefault();
  const { userName, userEmail, eventSelect } = this.elements;
  let valid = true;
  if (!userName.value) {
    userName.classList.add("error");
    valid = false;
  }
  if (!userEmail.value.includes("@")) {
    userEmail.classList.add("error");
    valid = false;
  }
  if (!eventSelect.value) {
    eventSelect.classList.add("error");
    valid = false;
  }
  if (!valid) {
    document.getElementById("formError").textContent = "Please fix errors above.";
    return;
  }
  document.getElementById("formError").textContent = "";
  submitRegistration(userName.value, userEmail.value, eventSelect.value);
});

// Question 12: AJAX & Fetch API
function submitRegistration(name, email, eventName) {
  document.getElementById("regStatus").textContent = "Submitting...";
  setTimeout(() => {
    fetch("https://mockapi.io/register", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ name, email, event: eventName })
    })
      .then(res => res.ok ? res.json() : Promise.reject("Failed"))
      .then(() => document.getElementById("regStatus").textContent = "Registration successful!")
      .catch(() => document.getElementById("regStatus").textContent = "Registration failed.");
  }, 1200); // simulate delay
}

// Question 13: Debugging and Testing
// Use Chrome DevTools: add breakpoints, inspect variables, watch fetch payloads
function debugSubmission() {
  console.log("Submitting form...");
  // Inspect this in the Network tab
}

// Question 14: jQuery and JS Frameworks
// (Assuming jQuery is loaded)
$(document).ready(function() {
  $("#registerBtn").click(function() {
    alert("Registered using jQuery handler!");
  });
  $(".eventCard").fadeIn();
  $(".eventCard").fadeOut(2000);
  // One benefit of React/Vue: Components manage state and UI efficiently, enabling scalable and maintainable apps.
});