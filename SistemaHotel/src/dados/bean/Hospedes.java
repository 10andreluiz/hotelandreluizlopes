package dados.bean;

public class Hospedes {

    private String nome;
    private String cpf_hospede;
    private String sexo;
    private String email;
    private String telefone;
    private String cep;
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    private String uf;
    private String senha;

    public Hospedes(String nome, String cpf_hospede, String sexo, String email, String telefone, String cep, String rua, String bairro, int numero, String cidade, String uf, String senha) {
        this.nome = nome;
        this.cpf_hospede = cpf_hospede;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_hospede() {
        return cpf_hospede;
    }

    public void setCpf_hospede(String cpf_hospede) {
        this.cpf_hospede = cpf_hospede;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
