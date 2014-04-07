package mx.gabvax.daog.model.dao;

import java.util.List;

import mx.gabvax.daog.model.Cursos;

 
public interface ICursoDAO extends GenericDao<Cursos, Long> {
 public List<Cursos> ListarCursos();
}