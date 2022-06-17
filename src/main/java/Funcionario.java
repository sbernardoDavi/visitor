public class Funcionario implements Pessoa{
    private Integer cpf;
    private String nome;
    private  Setor setor;

    public Funcionario(Integer cpf, String nome, Setor setor) {
        this.cpf = cpf;
        this.nome = nome;
        this.setor = setor;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeSetor() {
        return this.setor.getNome();
    }



    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionario(this);
    }


}
