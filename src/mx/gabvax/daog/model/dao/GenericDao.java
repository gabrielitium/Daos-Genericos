package mx.gabvax.daog.model.dao;

import java.io.Serializable;

public interface GenericDao <Entity, PK extends Serializable> {
	void Guardar(Entity t);
	void Modificar(Entity t);
	Entity Buscar(PK id);
	void Borrar(Entity t);
}
