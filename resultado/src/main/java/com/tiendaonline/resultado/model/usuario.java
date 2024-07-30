
package com.tiendaonline.resultado.model;

// clase para elaborar la entidad de la aplicación

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @Column
    private Long iduser;
    
    @Column
    private String correo;
    
    @Column
    private String nombre;
    
    @Column
    private String cedula;
    
    @Column
    private String telefono;
    
    @Column
    private String direccion;
    
    @Column
    private String ciudad;
}
