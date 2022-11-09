
package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    //metodos para hacer CRUD de articulo
    
    public List<Articulo> getArticulos(boolean activos);// si es true que muestre solo las activas
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo);
    
    public void delete(Articulo articulo);
    
    
}
