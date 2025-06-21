package com.ventas.ventas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.ventas.model.Ventas;


public interface ventasRepository extends JpaRepository<Ventas, Integer> {

    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar Ventas por cliente o producto
    public List<Ventas> findByIdCliente(Integer idCliente);

    public Ventas venta = new Ventas();

    

}
