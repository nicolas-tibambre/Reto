/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto.interfaces;

import org.springframework.data.repository.CrudRepository;
import Reto.modelo.Categoria;

/**
 *
 * @author Nicolas
 */
public interface InterfaceCategoria extends CrudRepository<Categoria,Integer> {
    
}
