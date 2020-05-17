package com.capgemini.exception;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String msg){
        super(msg);
    }

    public IdNotFoundException(String msg,Throwable result){
        super(msg,result);
    }
}