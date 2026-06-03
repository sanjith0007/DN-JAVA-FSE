console.log("Welcome to the Community Portal");

window.addEventListener("load", function () {
    alert("Page Loaded Successfully");
});



const eventName = "Music Night";
const eventDate = "2026-06-15";
let seats = 50;

console.log(`Event: ${eventName} | Date: ${eventDate} | Seats: ${seats}`);



class Event {

    constructor(name, category, seats, upcoming = true) {
        this.name = name;
        this.category = category;
        this.seats = seats;
        this.upcoming = upcoming;
    }
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};



let events = [

    new Event("Music Night", "Music", 20, true),

    new Event("Baking Workshop", "Workshop", 15, true),

    new Event("Football Tournament", "Sports", 25, true),

    new Event("Old Event", "Music", 0, false)

];



events.push(
    new Event("Dance Program", "Music", 30, true)
);



const musicEvents = events.filter(
    event => event.category === "Music"
);

console.log("Music Events");
console.log(musicEvents);



const formattedEvents = events.map(
    event => `Workshop on ${event.name}`
);

console.log(formattedEvents);



function displayValidEvents() {

    const container =
        document.querySelector("#eventContainer");

    container.innerHTML = "";

    events.forEach(event => {

        if (event.upcoming && event.seats > 0) {

            createEventCard(event);
        }
    });
}

function addEvent(event) {

    events.push(event);
}

function registerUser(eventObj) {

    try {

        if (eventObj.seats <= 0) {

            throw new Error(
                "No seats available"
            );
        }

        eventObj.seats--;

        updateEvents();

    } catch (error) {

        alert(error.message);
    }
}

function filterEventsByCategory(
    category,
    callback
) {

    const filtered =
        events.filter(event => {

            if (category === "All") {

                return true;
            }

            return (
                event.category === category
            );
        });

    callback(filtered);
}



function registrationCounter() {

    let total = 0;

    return function () {

        total++;

        console.log(
            "Total Registrations: " + total
        );
    };
}

const countRegistration =
    registrationCounter();



const objectInfo =
    document.getElementById("objectInfo");

Object.entries(events[0]).forEach(entry => {

    const p =
        document.createElement("p");

    p.textContent =
        `${entry[0]} : ${entry[1]}`;

    objectInfo.appendChild(p);
});



function createEventCard(event) {

    const container =
        document.querySelector(
            "#eventContainer"
        );

    const card =
        document.createElement("div");

    card.className = "eventCard";

    card.innerHTML = `
        <h3>${event.name}</h3>
        <p>Category: ${event.category}</p>
        <p>Seats Available: ${event.seats}</p>
        <button onclick="registerUserByName('${event.name}')">
            Register
        </button>
    `;

    container.appendChild(card);
}

function updateEvents() {

    displayValidEvents();
}

function registerUserByName(name) {

    const eventObj =
        events.find(
            event => event.name === name
        );

    registerUser(eventObj);

    countRegistration();
}



document
.getElementById("categoryFilter")
.addEventListener("change", function () {

    filterEventsByCategory(
        this.value,

        function (filtered) {

            const container =
                document.querySelector(
                    "#eventContainer"
                );

            container.innerHTML = "";

            filtered.forEach(event => {

                if (
                    event.upcoming &&
                    event.seats > 0
                ) {

                    createEventCard(event);
                }
            });
        }
    );
});



document
.getElementById("searchBox")
.addEventListener("keyup", function () {

    const value =
        this.value.toLowerCase();

    const filtered =
        events.filter(event =>
            event.name
            .toLowerCase()
            .includes(value)
        );

    const container =
        document.querySelector(
            "#eventContainer"
        );

    container.innerHTML = "";

    filtered.forEach(event => {

        if (
            event.upcoming &&
            event.seats > 0
        ) {

            createEventCard(event);
        }
    });
});



const spinner =
    document.getElementById(
        "loadingSpinner"
    );

spinner.style.display = "block";

fetch(
    "https://jsonplaceholder.typicode.com/posts"
)

.then(response => response.json())

.then(data => {

    console.log(
        "Fetch Using Then"
    );

    spinner.style.display = "none";
})

.catch(error => {

    console.log(error);

    spinner.style.display = "none";
});



async function fetchEvents() {

    try {

        spinner.style.display = "block";

        const response =
            await fetch(
                "https://jsonplaceholder.typicode.com/posts"
            );

        const data =
            await response.json();

        console.log(
            "Fetch Using Async Await"
        );

        spinner.style.display = "none";

        return data;

    } catch (error) {

        console.log(error);

        spinner.style.display = "none";
    }
}

fetchEvents();



function showEvent(
    name = "Default Event"
) {

    console.log(name);
}

showEvent();

const {
    name,
    category
} = events[0];

console.log(name);
console.log(category);

const clonedEvents =
    [...events];

console.log(clonedEvents);



const form =
    document.getElementById(
        "registrationForm"
    );

form.addEventListener(
    "submit",

    function (event) {

        event.preventDefault();

        let valid = true;

        document.getElementById(
            "nameError"
        ).textContent = "";

        document.getElementById(
            "emailError"
        ).textContent = "";

        document.getElementById(
            "eventError"
        ).textContent = "";

        const name =
            form.elements["name"].value;

        const email =
            form.elements["email"].value;

        const selectedEvent =
            form.elements["event"].value;

        if (name === "") {

            document.getElementById(
                "nameError"
            ).textContent =
                "Name Required";

            valid = false;
        }

        if (email === "") {

            document.getElementById(
                "emailError"
            ).textContent =
                "Email Required";

            valid = false;
        }

        if (selectedEvent === "") {

            document.getElementById(
                "eventError"
            ).textContent =
                "Select Event";

            valid = false;
        }

        if (valid) {

            submitRegistration(
                name,
                email,
                selectedEvent
            );
        }
    }
);



function submitRegistration(
    name,
    email,
    eventName
) {

    console.log(
        "Sending Registration..."
    );

    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method: "POST",

                headers: {
                    "Content-Type":
                    "application/json"
                },

                body: JSON.stringify({
                    name,
                    email,
                    eventName
                })
            }
        )

        .then(response =>
            response.json()
        )

        .then(data => {

            console.log(
                "Payload Sent",
                data
            );

            document
            .getElementById("message")
            .textContent =
            "Registration Successful";
        })

        .catch(error => {

            console.log(error);

            document
            .getElementById("message")
            .textContent =
            "Registration Failed";
        });

    }, 2000);
}



console.log("Debug Step 1");
console.log(events);
console.log("Check Network Tab");



$("#registerBtn").click(function () {

    console.log(
        "Register Button Clicked"
    );
});

$("#showBtn").click(function () {

    $(".eventCard").fadeIn();
});

$("#hideBtn").click(function () {

    $(".eventCard").fadeOut();
});

console.log(
    "React and Vue provide reusable components and better state management."
);



displayValidEvents();

