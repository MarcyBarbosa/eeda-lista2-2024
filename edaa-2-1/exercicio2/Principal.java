public class Principal {

    public static void main(String[] args) {
        // Teste do ModeloBasico
        Celular celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.fazerLigacao("123456789");
        celularBasico.enviarMensagem("987654321", "Oi! Tudo Bem?");

        // Teste do ModeloAvancado
        ModeloAvancado celularAvancado = new ModeloAvancado();
        celularAvancado.ligar();
        celularAvancado.fazerLigacao("999-1234");
        celularAvancado.enviarMensagem("999-5678", "Oi sumido");
        celularAvancado.exibirHistoricoLigacoes();
        celularAvancado.exibirHistoricoMensagens();
    
}

}