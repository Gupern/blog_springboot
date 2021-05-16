package com.gupern.blog.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // 只需要GET请求即可，不需要建立负责的RequestBody类
    @RequestMapping(value = "/list/{page}", method = RequestMethod.GET)
    @ResponseBody
    public List<PostList> clientList(@PathVariable(name = "page") int page) {
        return clientService.getClientList(page);
    }

    /* *
        @PostMapping(path = "/demo1")
        public void demo1(@RequestBody Person person) {
            System.out.println(person.toString());
        }
    */
}
