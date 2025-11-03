package com.paciente.historial.Domain.Service;

import com.paciente.historial.Domain.Model.DTO.PacienteDTO;
import com.paciente.historial.Domain.Model.Entity.PacienteEntity;
import com.paciente.historial.Domain.Repository.PacientesRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class PacienteService {

    private final PacientesRepository pacientesRepository;
    public PacienteService(PacientesRepository pacientesRepository){this.pacientesRepository=pacientesRepository;}

    public List<PacienteEntity>listarPaciente(){
        return pacientesRepository.findAll();
    }

    public PacienteEntity guardarPaciente(PacienteDTO pacienteDTO) {
        PacienteEntity paciente = new PacienteEntity();

        paciente.setNombrePaciente(pacienteDTO.getNombrePaciente());
        paciente.setEdad(pacienteDTO.getEdad());
        paciente.setHistorial(pacienteDTO.getHistorial());
        paciente.setTratamiento(pacienteDTO.getTratamiento());
        if (pacienteDTO.getFechaRegistro() == null) {
            paciente.setFechaRegistro(new Date());
        } else {
            paciente.setFechaRegistro(pacienteDTO.getFechaRegistro());
        }

        return pacientesRepository.save(paciente);
    }
}
