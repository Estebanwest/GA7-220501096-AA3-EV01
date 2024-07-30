
package com.tiendaonline.resultado.repository;

// creación del repositorio

import com.tiendaonline.resultado.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
