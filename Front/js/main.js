(function () {
  const show = document.getElementById('show');
  const ul = document.getElementById('posts');
  const url = 'https://jsonplaceholder.typicode.com/posts?_limit=3';

  const showAdvertisments = () => {
    ul.innerHTML = '';

    fetch(url)
    .then((response) => response.json())
    .then((posts) => {
      
      posts.map((post) => {
        const id = post.id;

        let li = createNode('li');
        li.className += 'list__item';
        let title = createNode('h2');
        title.className += 'item__title';
        let img = createNode('img');
        img.className += 'item__img';
        img.src = `img/info${id}.jpg`;
        img.alt = 'Content';
        let body = createNode('p');
        body.className += 'item__description';
        
        title.innerHTML = `${post.title}`;
        body.innerHTML = `${post.body}`;
  
        append(li, title);
        append(li, img);
        append(li, body);
        append(ul, li);
      })
    })
    .catch((error) => {
      console.log(error);
    });
  };

  show.addEventListener("click", showAdvertisments);

  function createNode(element) {
    return document.createElement(element);
  }

  function append(parent, el) {
    parent.appendChild(el);
  }
  
})();