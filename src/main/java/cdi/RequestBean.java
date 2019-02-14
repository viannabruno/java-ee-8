package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@RequestScoped
public class RequestBean implements Serializable {

    public static Integer contador = 0;


    public RequestBean(){
        contador ++;
    }

    public String getContador(){
        return contador.toString();
    }

    @PostConstruct
    private void init(){
        System.out.println("RequestBean: Fui Criado!" + LocalDateTime.now());

    }

    @PreDestroy
    private void destroy(){
        System.out.println("RequestBean: Fui Destruido" + LocalDateTime.now());
    }
}

