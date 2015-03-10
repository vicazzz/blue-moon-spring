package com.cfour.spring.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = -917887984258326390L;

	public BadRequestException() {
	}

	BadRequestException(Throwable cause) {
		super(cause);
	}

}
