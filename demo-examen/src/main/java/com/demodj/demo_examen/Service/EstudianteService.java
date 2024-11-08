package com.demodj.demo_examen.Service;

import com.demodj.demo_examen.Entity.Estudiante;
import java.util.List;

public interface EstudianteService {
    List<Estudiante> getAllEstudiantes();
    void addEstudiante(Estudiante estudiante);
    Estudiante getEstudianteById(Long id);
    void deleteEstudiante(Long id);
    void updateEstudiante(Estudiante estudiante);
}
