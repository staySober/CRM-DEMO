package com.itheima.bos.web.action;

import com.itheima.bos.domain.Decidedzone;
import com.itheima.bos.web.action.base.BaseAction;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Renhai on 2016/11/3.
 */
@Controller
@Scope("prototype")
public class DecidedzoneAction extends BaseAction<Decidedzone> {

//使用属性封装的方法封装subarea的id  首选要在subarea的实体类中加入 getsubarea()的方法

    private String[] subareaid;

    public void setSubareaid(String[] subareaid) {
        this.subareaid = subareaid;
    }

    public String pageQuery(){
        decidedzoneService.pageQuery(pageBean);
        String[] excludes=new String[]{"currentPage","detachedCriteria","pageSize","subareas","decidedzones"};
        writePageBean2Json(pageBean, excludes);
        return NONE;
    }

    //保存的方法
    public String save(){
        decidedzoneService.save(model,subareaid);
        return "list";
    }
}

