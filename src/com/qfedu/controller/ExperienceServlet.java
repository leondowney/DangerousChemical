package com.qfedu.controller;

import com.alibaba.fastjson.JSON;
import com.qfedu.entity.Experience;
import com.qfedu.entity.ExperienceCondition;
import com.qfedu.entity.Result;
import com.qfedu.service.ExperienceService;
import com.qfedu.service.impl.ExperienceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:39
 * @describe： 人生经历
 */
@WebServlet("/person/experience/getAll")
public class ExperienceServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("name");
        String type = req.getParameter("type");
        Integer pid = Integer.valueOf(req.getParameter("pid"));

        ExperienceCondition ec = new ExperienceCondition(name,type,pid);
        ExperienceService experienceService = new ExperienceServiceImpl();
        Result result = experienceService.getAll(ec);

        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);

    }
}
