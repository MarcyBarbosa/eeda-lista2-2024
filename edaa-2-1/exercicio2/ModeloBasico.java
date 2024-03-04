public class ModeloBasico implements Celular {

    @Override
    public void ligar() {
        System.out.println("Celular ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Celular desligado.");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para" + numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Mensagem enviada para " + numero + ": " + mensagem);
    }
}
