package controller;

import bean.Pessoa;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@ViewScoped
public class PessoaController implements Serializable {

    private String nome;
    private String telefone;
    private String endereco;
    private Pessoa pessoa;

    private List<Pessoa> pessoas;

    public PessoaController() {
    }

    public void adicionar(){

      Pessoa p = new Pessoa();

      p.getNome();
      p.getEndereco();
      p.getTelefone();

      pessoas.add(p);


    }

    public void limpar(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pessoa> getPessoa() {
        return pessoas;
    }

    public void setPessoa(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
