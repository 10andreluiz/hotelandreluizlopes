package dados.bean;

public class Fornecedores {

    private int id_fornecedores;
    private String nome;
    private String descricao;
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    private String uf;
    private String email;
    private int telefone;
    private String cep;

    public Fornecedores(int id_fornecedores, String nome, String descricao, String rua, String bairro, int numero, String cidade, String uf, String email, int telefone, String cep) {
        this.id_fornecedores = id_fornecedores;
        this.nome = nome;
        this.descricao = descricao;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
    }

    public int getid_fornecedores() {
        return id_fornecedores;
    }

    public void setid_fornecedores(int Id_fornecedores) {
        this.id_fornecedores = id_fornecedores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
