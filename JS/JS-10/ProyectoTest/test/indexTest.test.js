//Prueba efectiva

// const indexTest = require("../calculadora"); ecma5
import {indexTest} from "../calculadora"; // ecma6
test('test suma', () => {
    const resultado = indexTest.suma(1,2);
    expect (resultado).toBe(3);
});
test.todo('test resta');
test.todo('test mult');
test.todo('test divide');