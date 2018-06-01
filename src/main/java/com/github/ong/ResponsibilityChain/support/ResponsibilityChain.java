package com.github.ong.ResponsibilityChain.support;

import org.springframework.stereotype.Component;

@Component
public class ResponsibilityChain implements Responsibility.Chain {

    private ResponsibilityRegister register;

    public ResponsibilityRegister getRegister() {
        return register;
    }

    public void setRegister(ResponsibilityRegister register) {
        this.register = register;
    }

    public ResponsibilityChain(ResponsibilityRegister register){
        this.register = register;
    }

    public void process(RequestContext request, ResponseContext response) {
        if(register != null){
            Responsibility next = register.getNext();
            if(next!=null){
                next.deal(request,response,this);
            }
        }
    }
}
