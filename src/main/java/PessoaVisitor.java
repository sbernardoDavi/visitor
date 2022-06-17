public class PessoaVisitor implements  Visitor{

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "cpf=" + cliente.getCpf() +
                ", nome='" + cliente.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirGerente (Gerente gerente) {
        return "Gerente{" +
                "Matricula=" + gerente.getCpf() +
                ", nome='" + gerente.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "Matricula=" + funcionario.getCpf() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", setor=" + funcionario.getNomeSetor() +
                '}';
    }


}
