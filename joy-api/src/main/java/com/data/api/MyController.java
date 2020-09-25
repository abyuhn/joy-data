package com.data.api;

import com.data.bean.PersonBean;
import com.data.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/data")
    public Result<PersonBean> myController() {
        PersonBean person = new PersonBean();
        person.setId(1);
        person.setName("jacky");
        person.setAddr("北京市-朝阳区-团结湖");
        person.setBirthday("2000-01-01");

        return Result.success(person);
    }
}
