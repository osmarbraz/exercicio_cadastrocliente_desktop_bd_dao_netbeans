package modelo;

public class Cliente {

    private int clienteId;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String escolaridade;

    public Cliente() {
        this(-1, "", "", "", "", "", "");
    }

    public Cliente(int clienteId, String nome, String endereco, String cidade, String estado, String cep, String escolaridade) {
        setClienteId(clienteId);
        setNome(nome);
        setEndereco(endereco);
        setCidade(cidade);
        setEstado(estado);
        setCep(cep);
        setEscolaridade(escolaridade);
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public void setClienteId(String clienteId) {
        setClienteId(Integer.parseInt(clienteId));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}
