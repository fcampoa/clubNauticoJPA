/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import java.util.List;

/**
 *
 * @author felix
 */
public interface IRepository <T> {
    
   T obtener(Long id);
   T agregar(T entity);
   T actualizar(T entity);
   void Eliminar(T entity);
   List<T> lista();
    
}
