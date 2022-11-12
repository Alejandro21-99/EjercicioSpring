package com.curso.prueba.modelo.mapper;

import com.curso.prueba.modelo.Persona;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<Persona> {

    @Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
        Persona persona = new Persona();
        persona.setId(rs.getInt("id"));
        persona.setPrimerNombre(rs.getString("primer_nombre"));
        persona.setSegundoNombre(rs.getString("segundo_nombre"));
        persona.setPrimerApellido(rs.getString("primer_apellido"));
        persona.setSegundoApellido(rs.getString("segundo_apellido"));

        return persona;
    }

}
