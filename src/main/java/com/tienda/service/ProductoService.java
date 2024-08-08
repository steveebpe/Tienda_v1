
package com.tienda.service;


import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.repository.query.Param;


public interface ProductoService {
    
    //Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    
    // Se obtiene una producto por medio de su id
    public Producto getProducto(Producto producto);
    
    //metodo guardar
    public void save(Producto producto);
    
    // metodo de eliminar
    public void delete(Producto producto);
    
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
    
    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
    
}
