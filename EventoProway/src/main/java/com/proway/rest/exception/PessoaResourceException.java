package com.proway.rest.exception;

public class PessoaResourceException extends Exception{


	private static final long serialVersionUID = -114193991036474525L;

	public PessoaResourceException() {
		super();	
	}

	public PessoaResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PessoaResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PessoaResourceException(String message) {
		super(message);
	}

	public PessoaResourceException(Throwable cause) {
		super(cause);
	}
	
}
