package com.restservice.rest.controllers;

import com.restservice.rest.dao.UsuarioDao;
import com.restservice.rest.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario( @PathVariable Long id ) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("toto");
        usuario.setApellido("occhiuzzi");
        usuario.setEmail("tobisape5@gmail.com");
        usuario.setTelefono("234234243");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
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

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
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
