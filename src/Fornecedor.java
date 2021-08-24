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
