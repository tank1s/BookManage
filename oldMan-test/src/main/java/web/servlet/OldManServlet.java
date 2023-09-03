package web.servlet;


import com.alibaba.fastjson.JSON;
import pojo.Chart;
import pojo.OldMan;
import service.Impl.OldManServiceImpl;
import service.OldManService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/old/*")
public class OldManServlet extends BaseServlet{
    private OldManService service = new OldManServiceImpl();

    //获取全部老年人信息
    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<OldMan> oldMEN = service.selectAll();
        String jsonString = JSON.toJSONString(oldMEN);

        //写数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    //根据健康状态获取老年人信息
    public void selectByStatus(HttpServletRequest req,HttpServletResponse resp) throws IOException {

        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        OldMan oldMan = JSON.parseObject(s, OldMan.class);
        System.out.println(oldMan.getHealthy());
        List<OldMan> oldMEN = service.selectByStatus(oldMan.getHealthy());
        String jsonString = JSON.toJSONString(oldMEN);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

    }

    //条件查询
    public void selectByCondition(HttpServletRequest req,HttpServletResponse resp) throws IOException {

        //获取查询条件对象
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        OldMan oldMan = JSON.parseObject(s, OldMan.class);
        System.out.println(oldMan);
        List<OldMan> oldMEN = service.selectByCondition(oldMan);
        System.out.println(oldMEN);
        String jsonString = JSON.toJSONString(oldMEN);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    //根据健康状态获取老年人信息
    public void selectById(HttpServletRequest req,HttpServletResponse resp) throws IOException {

        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        OldMan oldMan = JSON.parseObject(s, OldMan.class);
        System.out.println(oldMan.getHealthy());
        List<OldMan> oldMEN = service.selectById(oldMan.getId());
        String jsonString = JSON.toJSONString(oldMEN);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

    }

    //根据健康状态获取老年人信息
    public void getData(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        List<Chart> charts = new ArrayList<>();
        /*charts.add(new Chart("235","视频广告"));
        charts.add(new Chart("310","邮件营销"));
        charts.add(new Chart("335","直接访问"));
        charts.add(new Chart("400","搜索引擎"));
                *//*
                {value:235, name:'视频广告'},
                    {value:274, name:'联盟广告'},
                    {value:310, name:'邮件营销'},
                    {value:335, name:'直接访问'},
                    {value:400, name:'搜索引擎'}
                 */
        String intact = String.valueOf(service.getCountByStatus("能力完好"));
        String light = String.valueOf(service.getCountByStatus("轻度失能"));
        String moderate = String.valueOf(service.getCountByStatus("中度失能"));
        String severe = String.valueOf(service.getCountByStatus("重度失能"));
        charts.add(new Chart(intact,"能力完好"));
        charts.add(new Chart(light,"轻度失能"));
        charts.add(new Chart(moderate,"中度失能"));
        charts.add(new Chart(severe,"重度失能"));

        String jsonString = JSON.toJSONString(charts);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

    }


}
