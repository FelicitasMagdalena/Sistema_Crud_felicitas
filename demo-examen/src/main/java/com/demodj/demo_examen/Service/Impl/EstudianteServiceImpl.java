package com.demodj.demo_examen.Service.Impl;

import com.demodj.demo_examen.Entity.Estudiante;
import com.demodj.demo_examen.Repository.EstudianteRepository;
import com.demodj.demo_examen.Service.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public void addEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante getEstudianteById(Long id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        if (estudiante.isPresent()) {
            return estudiante.get();
        } else {
            throw new RuntimeException("Estudiante no encontrado con id " + id);
        }
    }

    @Override
    public void updateEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }
}
