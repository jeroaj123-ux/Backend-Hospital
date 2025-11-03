package com.paciente.historial.Domain.Model.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class PacienteDTO {

    private String nombrePaciente;
    private Integer edad;
    private String historial;
    private String tratamiento;
    private Date fechaRegistro;

}
