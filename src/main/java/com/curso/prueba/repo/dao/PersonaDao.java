package com.curso.prueba.repo.dao;

import com.curso.prueba.modelo.Persona;

import java.util.List;

public interface PersonaDao {

    public List<Persona> obtenerTodo();

    public Persona obtenerPorId(int id);

    public void guardar(Persona persona);

    public void eliminar(int id);

}
