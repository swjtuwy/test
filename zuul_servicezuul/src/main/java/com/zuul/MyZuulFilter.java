package com.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by test on 8/4/17.
 */

@Component
public class MyZuulFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(MyZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s >> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");

        if (accessToken == null) {
            logger.error("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(400);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
                logger.error("", e);
            }
            return null;
        }
        logger.info("ok");
        return null;

    }
}
