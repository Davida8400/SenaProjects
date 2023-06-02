async function traerPais() {
  const respuesta = await fetch("https://api.nationalize.io?name=carlos");
  const nombre = respuesta.json();
  return nombre;
}

function mostrarNombre(n) {
  document.getElementById("mensajito").innerHTML = n.country[0].country_id;
}

traerPais().then(mostrarNombre);
