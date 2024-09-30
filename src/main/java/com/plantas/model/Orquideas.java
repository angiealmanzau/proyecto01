package com.plantas.model;

import javax.persistence.*;
/**
 *
 * @author Asus
 */
public class Orquideas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private Double precio;
    private String descripcion;
   
}
