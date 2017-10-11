const {
  add,
  sub
} = require('../src/index.js')

exports['testsub'] = (assert) => {
  assert.equal(sub(3)(2), -1, '3-2=1')
  assert.equal(sub(2)(3), 1, '2-3=-1')
}

exports['testadd'] = (assert) => {
  assert.equal(add(3)(2), 5, '3+2=5')
  assert.equal(add(2)(3), 5, '2+3=5')
}

require('test').run(exports)
