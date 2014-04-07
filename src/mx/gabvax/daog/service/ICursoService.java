package mx.gabvax.daog.service;

import java.util.List;

import mx.gabvax.daog.model.Cursos;
 
public interface ICursoService {
     public void GuardarCurso(Cursos cursoacargar);
     public void ActualizarCurso(Cursos cursoacargar);
     public void EliminarCurso(Cursos micurso);
     public List<Cursos> ListarCursos();
}