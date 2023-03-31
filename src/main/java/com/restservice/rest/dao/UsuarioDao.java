package com.restservice.rest.dao;

import com.restservice.rest.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
