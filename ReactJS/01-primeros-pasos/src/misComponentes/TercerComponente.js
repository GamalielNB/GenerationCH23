import React from 'react'
const productos = [
    {titulo: "Motos", esFruta:false, id:1},
    {titulo: "Reloj", esFruta:false, id:2},
    {titulo: "pera", esFruta:true, id:3},
    {titulo: "Naranja", esFruta:true, id:4},
];




 function TercerComponente() {
    const lista = productos.map(producto=> <li key={producto.id}></li>)
  return (
    <div>TercerComponente</div>
  )
}

export default TercerComponente