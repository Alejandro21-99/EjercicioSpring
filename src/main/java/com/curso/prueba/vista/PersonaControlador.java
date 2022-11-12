package com.curso.prueba.vista;

import com.curso.prueba.modelo.Persona;
import com.curso.prueba.servicio.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaControlador {

    private final PersonaServicio personaServicio;

    @Autowired
    public PersonaControlador(PersonaServicio personaServicio) {
        this.personaServicio = personaServicio;
    }

    @GetMapping("/todo")
    public ResponseEntity<List<Persona>> obtenerTodos(){
        List<Persona> list = personaServicio.obtenerTodo();
        if (!list.isEmpty()){
            return new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/obtenerPorId/{id}")
    public ResponseEntity<Persona> obtenerPorId(@PathVariable int id){
        Persona persona = personaServicio.obtenerPorId(id);
        if (persona != null){
            return new ResponseEntity<>(persona, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/guardar")
    public ResponseEntity guardar(@RequestBody Persona persona){
        personaServicio.guardar(persona);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity eliminar(@PathVariable int id){
        personaServicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
