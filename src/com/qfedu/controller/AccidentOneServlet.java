package com.qfedu.controller;

import com.alibaba.fastjson.JSON;
import com.qfedu.entity.Result;
import com.qfedu.service.AccidentOneService;
import com.qfedu.service.PersonOneService;
import com.qfedu.service.impl.AccidentOneServiceImpl;
import com.qfedu.service.impl.PersonOneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leon Downey
 * @date 2023/3/16 10:16
 * @describe：
 */
@WebServlet("/accident/getOne")
public class AccidentOneServlet extends HttpServlet {
    private static AccidentOneService accidentOneService = new AccidentOneServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Result one = accidentOneService.getOne(id);
        String s = JSON.toJSONString(one);
        resp.getWriter().println(s);
        System.out.println("ONE："+one);
    }
}
