package com.github.ong.ResponsibilityChain;

import com.github.ong.ResponsibilityChain.support.RequestContext;
import com.github.ong.ResponsibilityChain.support.ResponseContext;
import com.github.ong.ResponsibilityChain.support.Responsibility;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class TestAResponsibility implements Responsibility {



    @Override
    public void init(RequestContext request, ResponseContext response) {

    }

    @Override
    public void deal(RequestContext request, ResponseContext response, Chain chain) {
        System.out.println("this is TestAResponsibility");
        chain.process(request,response);
    }

    @Override
    public void destory() {

    }
}
