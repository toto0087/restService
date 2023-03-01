// Call the dataTables jQuery plugin
$(document).ready(function() {

});

async function registrarUsuarios() {

    let datos={};

    datos.nombre = document.getElementById('txtNombre').value;
    datos.appelido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;

    let repetirPassword = document.getElementById('txtRepetirPassword').value;

      const request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({a: 1, b: 'Textual content'})
      });
      const usuarios = await request.json(datos);
}
