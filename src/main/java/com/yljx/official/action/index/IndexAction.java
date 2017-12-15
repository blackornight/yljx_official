package com.yljx.official.action.index;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yangpeng
 * Created by yangpeng on 2017/12/4.
 */
@RestController
@RequestMapping("index")
public class IndexAction {

    @RequestMapping("/toLogin")
    public String toIndex(HttpServletRequest req, HttpServletResponse res, ModelAttribute md){

        return "";
    }
}
