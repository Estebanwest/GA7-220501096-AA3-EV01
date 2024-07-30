
package com.tiendaonline.resultado.services;

// para llevar la definición de los servicios 

import com.tiendaonline.resultado.model.Usuario;

public interface UsuarioService  {
    Usuario newUsuario (Usuario newUsuario);
    Iterable<Usuario> getAll();
    Usuario modifyUsuario (Usuario usuario);
    Boolean deleteUsuario (Long iduser);
}
