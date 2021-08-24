import java.util.ArrayList;
import java.util.Collection;

public class Fornecedor {

    private boolean isRascunho;
    private int id;
    private String email;
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private long dtCadastro;
    private String rzSocial;
    private String nmFantasia;

    private Collection<Empresa> empresas;
    private Collection<Os> osRegistradas;
    private Collection<Servico> servicosOfertados;
    private Collection<Produto> produtosOfertados;
    private Status status;
    private TipoFornecimento tipoFornecimento;
    private Collection<Telefone> telefones;
    private Collection<Contato> contatos;
    private Collection<Cnae> cnaes;
    private Endereco endereco;

    public void salvar(){};
    public void alterar(){};
    public Collection<Fornecedor> consultar(){return new ArrayList<Fornecedor>();};
    public void excluir(){};
    public void inativar(){};
    public void ativar(){};
    public void addContato(Contato contato){};
    public void validarCnpj(){};
    public void validarListaFornecimento(){};
    
}
