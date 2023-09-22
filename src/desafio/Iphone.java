package desafio;

public class Iphone implements ReprodutorMusical, Navegador, Telefone {
    private String nome;

    public Iphone(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirPagina() {
        System.out.println(nome + ": exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(nome + ": abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println(nome + ": atualizando Página");
    }

    @Override
    public void tocar() {
        System.out.println(nome + ": reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println(nome + ": pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println(nome + ": abrindo seleção de música");
    }

    @Override
    public void ligar() {
        System.out.println(nome + ": fazendo ligação telefônica");
    }

    @Override
    public void atender() {
        System.out.println(nome + ": atendendo ligação telefônica");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println(nome + ": iniciando correio de voz");
    }
}
