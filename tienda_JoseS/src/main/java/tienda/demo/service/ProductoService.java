package tienda.demo.service;

import tienda.demo.domain.Producto;
import java.util.List;

public interface ProductoService {
    // Obtiene una lista de productos según su estado de activo
    public List<Producto> getProductos(boolean activo);
    
    // Obtiene un producto a partir de su objeto Producto
    public Producto getProducto(Producto producto);
    
    // Inserta un nuevo producto si el ID del producto está vacío,
    // de lo contrario, actualiza el producto
    public void save(Producto producto);
    
    // Elimina el producto con el ID proporcionado
    public void delete(Producto producto);
    
    // Lista de productos con precio entre ordenados por descripción
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    // Lista de productos utilizando consultas con JPQL
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    // Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
