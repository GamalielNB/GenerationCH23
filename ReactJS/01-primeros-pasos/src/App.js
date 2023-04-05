import logo from './logo.svg';
import './App.css';
import PrimerComponente from './misComponentes/PrimerComponente';

function App() {
  const datos={
    lugar: "Hermosilloi",
    gusto: "Aguachile"
  }
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
         Hola Mundo..!!
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <h1>Cohorte 23</h1>
        <div className= "componentes">
          <hr/>
          <SegundoComponente nombre="Octavio" apellido="Paz" />
          
          <hr/>
        <PrimerComponente />
        </div>
      </header>
    </div>
  );
}

export default App;
