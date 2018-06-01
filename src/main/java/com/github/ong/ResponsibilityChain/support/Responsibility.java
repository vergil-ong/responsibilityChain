package com.github.ong.ResponsibilityChain.support;

/**
 * 责任接口
 */
public interface Responsibility {

    public void init(RequestContext request,ResponseContext response);

    public void deal(RequestContext request,ResponseContext response,Chain chain);

    public void destory();

    interface Chain{
        void process(RequestContext request,ResponseContext response);
    }
}
