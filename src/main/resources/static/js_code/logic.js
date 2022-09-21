// fetch('/get')
//     .then(function (response) {
//         console.log('response')
//     })

var str;
const xhr = new XMLHttpRequest();
// GET-запрос к ресурсу /hello
xhr.open("GET", "/get");
xhr.onload = () => {
    str = JSON.parse(xhr.response).name;
    console.log(str);
}
xhr.send();
