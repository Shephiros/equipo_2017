/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class AccesoInterceptor extends AbstractInterceptor {

    private String actionsPublicos;
    private List<String> actionsSinFiltrar = new ArrayList<String>();

    @Override
    public void init() {
        actionsSinFiltrar = Arrays.asList(actionsPublicos.split(","));
    }

    @Override
    public String intercept(ActionInvocation acceso) throws Exception {
        String result = Action.LOGIN;
        String actionActual = (String) ActionContext.getContext().get(ActionContext.ACTION_NAME);
        if (acceso.getInvocationContext().getSession().containsKey("usuario") || actionsSinFiltrar.contains(actionActual)) {
            result = acceso.invoke();
        }
        return result;
    }

    public String getActionsPublicos() {
        return actionsPublicos;
    }

    public void setActionsPublicos(String actionsPublicos) {
        this.actionsPublicos = actionsPublicos;
    }

    public List<String> getActionsSinFiltrar() {
        return actionsSinFiltrar;
    }

    public void setActionsSinFiltrar(List<String> actionsSinFiltrar) {
        this.actionsSinFiltrar = actionsSinFiltrar;
    }

    
}
