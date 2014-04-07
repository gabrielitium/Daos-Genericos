package mx.gabvax.daog.service;

import java.util.List;

import mx.gabvax.daog.model.Cursos;
import mx.gabvax.daog.model.dao.CursoDAO;
import mx.gabvax.daog.model.dao.ICursoDAO;
 
public class CursoService implements ICursoService {
	 
	 private ICursoDAO CursosDao; 
	  
	 public CursoService() {
	    CursosDao = new CursoDAO();
	 }
	 
	 public void GuardarCurso(Cursos cursoacargar) {
	  CursosDao.Guardar(cursoacargar); 
	 }
	 
	 public void ActualizarCurso(Cursos cursoacargar) {
	  CursosDao.Modificar(cursoacargar); 
	 }
	 
	 public void EliminarCurso(Cursos micurso) {
	  CursosDao.Borrar(micurso);  
	 }
	 
	 public List<Cursos> ListarCursos() {
	  return CursosDao.ListarCursos();
	 }
	 
  
 
}