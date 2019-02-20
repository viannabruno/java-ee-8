package controller;

import bean.Pessoa;
import persistence.PessoaDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@Named
public class PessoaController implements Serializable {

   

    private Pessoa pessoaForm;
    private List<Pessoa> pessoas;// = new ArrayList<>();
    private Pessoa pessoaSelecionada;

    @Inject
    private PessoaDAO pd;

    
    @PostConstruct
    private void innit (){
        pessoaForm = new Pessoa();
        pessoas = new ArrayList<>();
        pessoas = pd.consultar();

    }

    public void atualizarTabela(){
        pessoas = pd.consultar();

    }


   public void adicionar(){
        //pessoas.add(pessoaForm)

       pd.salvar(pessoaForm);
        limpar();
        atualizarTabela();

    }


    public void limpar(){
        this.pessoaForm = new Pessoa();
    }

    public void excluir(){
        //this.pessoas.remove(pessoaForm);

        pd.delete(pessoaForm);
        limpar();
        atualizarTabela();
    }
    
    public void aoSelecionar(){
        this.pessoaForm = pessoaSelecionada;
    }

    public void aoDesselecionar(){
        limpar();
    }
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public Pessoa getPessoaForm() {
        return pessoaForm;
    }

    public void setPessoaForm(Pessoa pessoaForm) {
        this.pessoaForm = pessoaForm;
    }

   
}
