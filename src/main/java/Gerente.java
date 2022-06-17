public class Gerente implements Pessoa{

    private Integer cpf;
    private String nome;

    public Gerente(Integer cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
}
