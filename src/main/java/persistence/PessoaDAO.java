package persistence;

import bean.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.io.Serializable;
import java.util.List;

@ApplicationScoped
public class PessoaDAO implements Serializable {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Pessoa p){
        em.persist(p);

    }


    public List<Pessoa> consultar(){

        return em.createQuery("select p from Pessoa p" ,Pessoa.class).getResultList();

    }

    @Transactional
    public void delete(Pessoa p){
        //p = em.find(Pessoa.class, p.getId());
//      posso usar o find ou o merge
        p = em.merge(p);

        em.remove(p);

//        resolvendo em uma linha
        // em.remove(em.merge(p));

    }


}
