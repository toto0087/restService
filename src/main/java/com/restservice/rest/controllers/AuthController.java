package com.restservice.rest.controllers;
import com.restservice.rest.dao.UsuarioDao;
import com.restservice.rest.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.restservice.rest.utils.JWTUtil;

@RestController
public class AuthController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {

        Usuario usuarioLog = usuarioDao.obtenerUsuarioPorCredenciales(usuario);
        if(usuarioLog != null) {
            String tokenJWT = jwtUtil.create(String.valueOf(usuarioLog.getId()),usuarioLog.getEmail());
            return tokenJWT;
        }
        return "Fail";
    }
}
