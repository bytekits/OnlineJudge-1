package mo.controller.admin.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import mo.controller.AbstractController;
import mo.controller.admin.AdminNewsController;
import mo.core.Result;
import mo.entity.po.News;
import mo.interceptor.annotation.AuthCheck;
import mo.interceptor.annotation.RequiredType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminNewsControllerImpl extends AbstractController implements AdminNewsController {


    @Override
    @AuthCheck({RequiredType.JWT, RequiredType.ADMIN})
    @ResponseBody
    @RequestMapping(value = "/admin/news", method = RequestMethod.POST)
    public Result createNews(String news) {

        News topic = JSON.parseObject(news, new TypeReference<News>() {
        });


        return null;
    }
}
