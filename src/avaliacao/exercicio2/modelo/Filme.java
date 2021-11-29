package avaliacao.exercicio2.modelo;

public class Filme {
    private int id;
    private String nome;
    private String descricao;
    private int ano;

    public Filme(String nome, String descricao, int ano) {
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }

    public Filme(int id, String nome, String descricao, int ano) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ano=" + ano +
                '}';
    }
}



