import desafio.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12");

        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.iniciarCorreioDeVoz();
        iphone.atender();
        iphone.ligar();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}