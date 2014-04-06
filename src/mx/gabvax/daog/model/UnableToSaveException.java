package mx.gabvax.daog.model;

import org.hibernate.HibernateException;

public class UnableToSaveException extends HibernateException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8480011506378210776L;

	public UnableToSaveException(HibernateException msg) {
        super(msg);
    }
}
