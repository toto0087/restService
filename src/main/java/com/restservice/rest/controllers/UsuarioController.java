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
