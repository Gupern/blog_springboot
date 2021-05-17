package com.gupern.blog.client;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    PostMapper postMapper;

    public Page<Post> getClientList() {
        return postMapper.SelectPostList();
    }
}
