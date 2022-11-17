package com.curso.prueba.repo.daoImplement;

import com.curso.prueba.modelo.Persona;
import com.curso.prueba.modelo.mapper.PersonaMapper;
import com.curso.prueba.repo.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaDaoImplement implements PersonaDao{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonaDaoImplement(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Persona> obtenerTodo() {
        return jdbcTemplate.query("select * from persona_alejandro", new PersonaMapper());
    }

    @Override
    public Persona obtenerPorId(int id) {
        return jdbcTemplate.queryForObject("select * from persona_alejandro where id = ?",
                new PersonaMapper(), id);
    }

    @Override
    public void guardar(Persona persona) {
        jdbcTemplate.update("insert into persona_alejandro " +
                "(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido) values (?,?,?,?)",
                persona.getPrimerNombre(),persona.getSegundoNombre(),persona.getPrimerApellido(), persona.getSegundoApellido());
    }

    @Override
    public void update(Persona persona) {
        jdbcTemplate.update("update persona_alejandro set primer_nombre = ? where id = ?",
                persona.getPrimerNombre(), persona.getId());
    }

    @Override
    public void eliminar(int id) {
        jdbcTemplate.update("delete from persona_alejandro where id = ?", id);
    }

}
