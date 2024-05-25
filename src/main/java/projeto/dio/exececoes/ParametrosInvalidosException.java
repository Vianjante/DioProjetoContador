package projeto.dio.exececoes;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    // Adicionando métodos padrão para uma exceção personalizada
    @Override
    public String toString() {
        return "ParametrosInvalidosException: " + this.getMessage();
    }

    @Override
    public String getMessage() {
        return "Erro: " + super.getMessage();
    }
}

