let username = document.getElementById('username');
let password = document.getElementById('password');

let myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");
let raw = JSON.stringify({
    "username": "gertiepi",
    "password": "test"
});

let requestOptions = {
    method: 'POST',
    headers: myHeaders,
    body: raw,
    redirect: 'follow'
};

fetch("http://localhost:8075/auth/login", requestOptions)
    .then(response => response.text())
    .then(result => console.log(result))
    .catch(error => console.log('error', error));