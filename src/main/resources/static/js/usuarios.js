// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
  actualizarEmail();
});

function actualizarEmail() {
    document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
}

async function cargarUsuarios() {
      const request = await fetch('api/usuarios', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': localStorage.token
            }
      });
      const usuarios = await request.json();

      listadoHTML=""


      for (usuario of usuarios) {
            let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

            let telefono = usuario.telefono == null ? "-" : usuario.telefono;
            let usuarioHtml = '<tr><td>'+usuario.id+'</td><td>' + usuario.nombre + ' ' + usuario.apellido + '</td><td>'
                            + usuario.email+'</td><td>'+telefono
                            + '</td><td>' + botonEliminar + '</td></tr>';
            listadoHTML += usuarioHtml;
  }
      document.querySelector('#usuarios tbody').outerHTML = listadoHTML;
}


async function eliminarUsuario(id) {

          if(!confirm('Desea eliminar este usuario?')) {
            return;
          }

          const request = await fetch('api/usuarios/' + id , {
            method: 'DELETE',
            headers:
                {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Authorization': localStorage.token
                }
          });
          location.reload()
}