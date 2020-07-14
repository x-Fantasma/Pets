package co.pets.exceptions.impl;

import co.pets.exceptions.config.BadRequestException;

public class MascotaExceptions extends BadRequestException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MascotaExceptions(String detail) {
		super(detail);
	}

	
}
