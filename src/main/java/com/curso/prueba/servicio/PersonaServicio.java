package com.curso.prueba.servicio;

import com.curso.prueba.modelo.Persona;
import com.curso.prueba.repo.daoImplement.PersonaDaoImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicio {

    private final PersonaDaoImplement personaDaoImplement;

    @Autowired
    public PersonaServicio(PersonaDaoImplement personaDaoImplement) {
        this.personaDaoImplement = personaDaoImplement;
    }

    public List<Persona> obtenerTodo(){
        return personaDaoImplement.obtenerTodo();
    }

    public Persona obtenerPorId(int id){
        return personaDaoImplement.obtenerPorId(id);
    }

    public void guardar(Persona persona){
        personaDaoImplement.guardar(persona);
    }

    public void eliminar(int id){
        personaDaoImplement.eliminar(id);
    }

}
