package org.ionnic.common.support.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ionnic.common.util.JsonUtils;
import org.springframework.web.servlet.View;

public class JsonView implements View {

    @Override
    public String getContentType() {
        return "application/json";
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String text = JsonUtils.toJson(model);

        response.setContentType(getContentType());
        response.setHeader("X-Session-Token", (String) request.getSession().getAttribute("token"));

        response.getOutputStream().write(text.getBytes());
    }
}
