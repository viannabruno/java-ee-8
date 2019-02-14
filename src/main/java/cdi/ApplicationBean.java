package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApplicationScoped
public class ApplicationBean implements Serializable {

    public static Integer contador = 0;

    public ApplicationBean(){
        contador ++;
    }

    public String getContador(){
        return contador.toString();
    }

    @PostConstruct
    private void init(){
        System.out.println("AplicationBean: Fui Criado!" + LocalDateTime.now());

    }

    @PreDestroy
    private void destroy(){
        System.out.println("AplicationBean: Fui Destruido" + LocalDateTime.now());
    }

}
