package com.cfour.spring.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {

	private static final long serialVersionUID = -43708963853514899L;

	public ConflictException() {
	}

	ConflictException(Throwable cause) {
		super(cause);
	}

}
