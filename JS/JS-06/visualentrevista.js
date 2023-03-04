class randomPerson{
    constructor(name, age, city){
    this.name = name;
    this.age = age;
    this.city = city;
    }
    toString(){
    return ('Name: ${this.name}, Age: ${this.age}, City: ${this.city}') }
    }
    let Person = new randomPerson("Fernando", 21, "CDMX");
    console.log(Person.toString());