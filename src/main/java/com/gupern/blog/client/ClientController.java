package com.gupern.blog.client;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    // 只需要GET请求即可，不需要建立负责的RequestBody类
    @RequestMapping(value = "/list/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Page<Post> clientPostList(@PathVariable(name = "pageNum") int pageNum,
                                 @PathVariable(name = "pageSize") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return clientService.getClientList();
    }

    /* *
        @PostMapping(path = "/demo1")
        public void demo1(@RequestBody Person person) {
            System.out.println(person.toString());
        }
    */
}
