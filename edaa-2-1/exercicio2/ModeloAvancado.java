import java.util.List;
import java.util.ArrayList;

public class ModeloAvancado implements Celular {

    private List<String> historicoLigacoes;
    private List<String> historicoMensagens;

    public ModeloAvancado() {
        this.historicoLigacoes = new ArrayList<>();
        this.historicoMensagens = new ArrayList<>();
    }

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
        System.out.println("Ligando para " + numero);
        historicoLigacoes.add(numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Mensagem enviada para " + numero + ": " + mensagem);
        historicoMensagens.add(numero + ": " + mensagem);
    }

    public void exibirHistoricoLigacoes() {
        System.out.println("Histórico de ligações: " + historicoLigacoes);
    }

    public void exibirHistoricoMensagens() {
        System.out.println("Histórico de mensagens: " + historicoMensagens);
    }
    
}
