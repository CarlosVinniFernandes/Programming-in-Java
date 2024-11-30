package excecoes;

public class SenhaNaoEhQuatroDigitos extends Throwable {
    private String mensagem;

    public SenhaNaoEhQuatroDigitos(String mensagem) {
        super(mensagem);
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
