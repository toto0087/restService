package com.restservice.rest.controllers;

import com.restservice.rest.dao.UsuarioDao;
import com.restservice.rest.models.Usuario;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {

        if(usuarioDao.verificarCredenciales(usuario)) {
            return "Ok";
        }
        return "Fail";
    }
}
