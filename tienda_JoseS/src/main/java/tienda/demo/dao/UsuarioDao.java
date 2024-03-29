/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tienda.demo.domain.Producto;
import tienda.demo.domain.Usuario;

/**
 *
 * @author alejh
 */
public interface UsuarioDao extends JpaRepository <Usuario, Long> {
    Usuario findByUsername(String username);
    
}
