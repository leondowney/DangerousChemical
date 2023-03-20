package com.qfedu.controller;

import com.alibaba.fastjson.JSON;
import com.qfedu.entity.Accident;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.PersonCondition;
import com.qfedu.entity.Result;
import com.qfedu.service.AccidentService;
import com.qfedu.service.PersonService;
import com.qfedu.service.impl.AccidentServiceImpl;
import com.qfedu.service.impl.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leon Downey
 * @date 2023/3/15 19:32
 * @describe：
 */
@WebServlet("/accident/getAll")
public class AccidentAllServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String date = req.getParameter("date");

//        System.out.println(name);
//        System.out.println(type);
//        System.out.println(date);

        AccidentCondition ac = new AccidentCondition(name,type,date);


//        System.out.println(ac);

        AccidentService accidentService = new AccidentServiceImpl();


        Result all = accidentService.getAll(ac);

        String s = JSON.toJSONString(all);

        resp.getWriter().println(s);

//        System.out.println(all);
    }
}
