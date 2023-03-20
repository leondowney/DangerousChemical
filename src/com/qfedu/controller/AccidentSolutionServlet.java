package com.qfedu.controller;

import com.alibaba.fastjson.JSON;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.Result;
import com.qfedu.service.AccidentAnalyseService;
import com.qfedu.service.impl.AccidentAnalyseServiceImpl.ReasonServiceImpl;
import com.qfedu.service.impl.AccidentAnalyseServiceImpl.SolutionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leon Downey
 * @date 2023/3/17 15:02
 * @describe：
 */
@WebServlet("/accident/analysisSolution")
public class AccidentSolutionServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String type = req.getParameter("type");
        String begin = req.getParameter("begin");
        String end = req.getParameter("end");

        AccidentCondition ac = new AccidentCondition(begin,end);
        ac.setType(type);

        AccidentAnalyseService accidentAnalyseService = new SolutionServiceImpl();

        Result result = accidentAnalyseService.getAll(ac);
        System.out.println("result:"+result);
        String s = JSON.toJSONString(result);

        resp.getWriter().println(s);
    }
}
