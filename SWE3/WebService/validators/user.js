const Shape = require('validate');

const userShape = new Shape({
  name: {
    type: String,
    match: /^[a-zA-Z]+$/u,
    required: true,
  },
  email: {
    type: String,
    required: true,
  },
});

userShape.message({
  required: (path) => `The ${path} is a required field.`,
  match: (path) => `The ${path} must contain only letters and spaces.`,
});

module.exports = userShape;