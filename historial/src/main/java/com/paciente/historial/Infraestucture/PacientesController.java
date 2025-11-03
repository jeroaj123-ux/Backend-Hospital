package com.paciente.historial.Infraestucture;

import com.paciente.historial.Domain.Model.DTO.PacienteDTO;
import com.paciente.historial.Domain.Model.Entity.PacienteEntity;
import com.paciente.historial.Domain.Service.PacienteService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historial")
public class PacientesController {

    private final PacienteService pacienteService;

    public PacientesController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }


    @GetMapping
    public List<PacienteEntity> listarPaciente() {
        return pacienteService.listarPaciente();
    }

    @PostMapping
    public ResponseEntity<PacienteEntity> guardarPaciente(@RequestBody PacienteDTO pacienteDTO) {
        PacienteEntity nuevoPaciente = pacienteService.guardarPaciente(pacienteDTO);
        return ResponseEntity.ok(nuevoPaciente);
    }
}
