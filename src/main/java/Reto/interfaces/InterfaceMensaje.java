/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto.interfaces;

import org.springframework.data.repository.CrudRepository;
import Reto.modelo.Mensaje;

/**
 *
 * @author Nicolas
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
