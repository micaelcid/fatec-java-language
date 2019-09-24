const express = require('express');
const app = express();
const bodyParser = require('body-parser');

app.use(bodyParser.json());

const PORT = 3000;
const HOST = 'localhost';

app.use(express.urlencoded())

app.listen(PORT, HOST, () => {
  console.log(`Server running on http://${HOST}:${PORT}`);
})


module.exports = app;