package cdi;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

@RequestScoped
public class RequestBean implements Serializable {

    private int contador;
}
