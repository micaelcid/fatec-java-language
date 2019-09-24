const app = require('./bootstrap');

const usersJson =  require('./users.json');

app.get('/user', (request, response) => {
  response.json(usersJson)
});

app.post('/user', (request, response) => {
  console.log(request.body);

  response.json(request.body)
});