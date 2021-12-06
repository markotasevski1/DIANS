
import './App.css';
import React from 'react';

function Maindel() {
   return (
    <div className="App">
      <div className="sredina">
          <div className="selekcija" >
               <label> Избери град:</label>

<select  className="selektdel"name="gradovi"> 
  <option value="Skopje">Скопје</option>
  <option value="Kumanovo">Куманово</option>
  <option value="Ohrid"> Охрид </option>
  <option value="Prilep">Прилеп</option>
</select>
<br/>
<button className="selektdel" >  Претражи</button>
          </div>
           
      </div>
    </div>
  );
}

export default Maindel;
