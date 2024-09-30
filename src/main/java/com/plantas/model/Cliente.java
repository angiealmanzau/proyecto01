
package com.plantas.model;

import javax.persistence.*;

/**
 *
 * @author Asus
 */
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String correo;
    private String contraseña;

    // Constructors, getters, and setters   
}
