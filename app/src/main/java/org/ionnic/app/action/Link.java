package org.ionnic.app.action;

import org.ionnic.common.support.ActionSupport;
import org.ionnic.common.support.JSONObject;
import org.ionnic.common.support.JSONParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author apple
 *
 */
@Controller
@RequestMapping("/link")
public class Link extends ActionSupport {

    @RequestMapping(method = { RequestMethod.GET })
    @ResponseBody
    public Object get(JSONParameter param, JSONObject data) {

        return null;
    }
}