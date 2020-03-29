package com.zhouhao.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.zhouhao.gateway.enums.FilterType;
import com.zhouhao.gateway.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
@Component
public class CustomizeFilter extends ZuulFilter {

    @Autowired
    private UserService userService;

    @Override
    public String filterType() {
        return FilterType.pre.name();
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
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        if (!userAuth(request)) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("{\"code\":401,\"message\":\"UNAUTHORIZED\"}");
            } catch (IOException e) {
                log.error("resp ", e);
            }
            return null;
        }
        return null;
    }

    private Boolean userAuth(HttpServletRequest request) {
        String id = request.getParameter("id");
        if (id == null) {
            return false;
        }
        String user = userService.getUser(Long.parseLong(id));
        if (user == null) {
            log.error("User auth failed, id:{}", id);
            return false;
        }
        log.info("userId:{}, userName:{}", id, user);
        return true;
    }
}
