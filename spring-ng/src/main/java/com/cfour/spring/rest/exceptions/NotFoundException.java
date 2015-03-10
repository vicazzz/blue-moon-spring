package com.cfour.spring.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1116314055101496737L;

	public NotFoundException() {
	}

	NotFoundException(Throwable cause) {
		super(cause);
	}

}
