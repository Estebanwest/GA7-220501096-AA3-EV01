
package com.tiendaonline.resultado.services;

//vamos a definir para cada uno de estos elementos o una consulta, actualizacion, eliminación y un id

import com.tiendaonline.resultado.model.Usuario;
import com.tiendaonline.resultado.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicelmpl implements UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario newUsuario(Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }

    @Override
    public Iterable<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) {
        
        Optional<Usuario> usuarioEncontrado= this.usuarioRepository.findById(usuario.getIduser());
        if(usuarioEncontrado.get()!=null){
        usuarioEncontrado.get().setCorreo(usuario.getCorreo());
         usuarioEncontrado.get().setCedula(usuario.getCedula());
         usuarioEncontrado.get().setCiudad(usuario.getCiudad());
          usuarioEncontrado.get().setDireccion(usuario.getDireccion());
           usuarioEncontrado.get().setTelefono(usuario.getTelefono());
           return this.newUsuario(usuarioEncontrado.get());
    }
        
      return null;
    }

    @Override
    public Boolean deleteUsuario(Long iduser) {
        this.usuarioRepository.deleteById(iduser);
        return true;
    }
    
}
