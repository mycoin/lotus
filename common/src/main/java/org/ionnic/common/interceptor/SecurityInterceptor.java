package org.ionnic.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ionnic.common.Security;
import org.ionnic.common.support.InternalServletException;
import org.ionnic.common.util.ServletUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author apple
 *
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // If it is an ajax request, a csrfToken is required.
        if (ServletUtils.isAjax(request) || ServletUtils.isJSONResponse(handler)) {
            if (!Security.checkToken(request)) {
                throw new InternalServletException(403, "Unacceptable Token");
            }
        }
        return true;
    }
}
