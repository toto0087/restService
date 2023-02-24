package com.restservice.rest.controllers;

import com.restservice.rest.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario( @PathVariable Long id ) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("toto");
        usuario.setApellido("occhiuzzi");
        usuario.setEmail("tobisape5@gmail.com");
        usuario.setTelefono("234234243");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public List<Usuario> getUsuario( @PathVariable Long id ) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("toto");
        usuario.setApellido("occhiuzzi");
        usuario.setEmail("tobisape5@gmail.com");
        usuario.setTelefono("234234243");

        Usuario usuario2 = new Usuario();
        usuario2.setId(id);
        usuario2.setNombre("toto2");
        usuario2.setApellido("occhiuzzi2");
        usuario2.setEmail("tobisape52@gmail.com");
        usuario2.setTelefono("234234243");

        Usuario usuario3 = new Usuario();
        usuario3.setId(id);
        usuario3.setNombre("toto3");
        usuario3.setApellido("occhiuzzi3");
        usuario3.setEmail("tobisape53@gmail.com");
        usuario3.setTelefono("234234243");

        return usuario;
    }

    @RequestMapping(value = "usuario7")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("toto");
        usuario.setApellido("occhiuzzi");
        usuario.setEmail("tobisape5@gmail.com");
        usuario.setTelefono("234234243");
        return usuario;
    }

    @RequestMapping(value = "usuario78")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("toto");
        usuario.setApellido("occhiuzzi");
        usuario.setEmail("tobisape5@gmail.com");
        usuario.setTelefono("234234243");
        return usuario;
    }

    @RequestMapping(value = "usuario789")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("toto");
        usuario.setApellido("occhiuzzi");
        usuario.setEmail("tobisape5@gmail.com");
        usuario.setTelefono("234234243");
        return usuario;
    }
}
