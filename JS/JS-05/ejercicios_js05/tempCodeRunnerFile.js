var names = ["Maria", "Antony", "Joy", "Juan", "Gamaliel"];

function getNameLengths(nameListLength) {
    return nameListLength.map(function(name) {
        return name.length;
    });
}

console.log(getNameLengths(names));