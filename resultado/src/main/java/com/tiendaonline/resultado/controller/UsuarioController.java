
package com.tiendaonline.resultado.controller;

//llamar los metodos de cara a la comunicación a traves del lado de la web

import com.tiendaonline.resultado.model.Usuario;
import com.tiendaonline.resultado.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping("/nuevo")
    public Usuario newUsuario(@RequestBody Usuario newUsuario) {
        return this.usuarioService.newUsuario(newUsuario);
    }
    
    @GetMapping( "/mostrar")
    public Iterable<Usuario> getAll(){
        return usuarioService.getAll();
    }
    
    @PostMapping("/modificar")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.modifyUsuario(usuario);
    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteUsuario(@PathVariable(value="id") Long id){
        return this.usuarioService.deleteUsuario(id);
    }
}
