package com.daniel.gestaoPreco.exception;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException() {
        super("Não foi encontrado Item para aplicar o preço.");
    }

    public ItemNotFoundException(String mensagem) {
        super(mensagem);
    }
}
