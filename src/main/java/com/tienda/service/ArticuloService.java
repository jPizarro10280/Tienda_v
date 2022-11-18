
package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    //metodos para hacer CRUD de articulo
    
    public List<Articulo> getArticulo(boolean activos);
    
    //Si son true me muestra todos los articulos que estan activos, si es false no los muestra
    public Articulo getArticulo(Articulo articulo);//Read
    
    public void save(Articulo articulo);//Update
    
    public void delete(Articulo articulo);//Delete
}
