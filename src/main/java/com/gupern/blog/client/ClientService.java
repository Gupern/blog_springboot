package com.gupern.blog.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    PostMapper postMapper;

    public List<PostList> getClientList(int page) {
        return postMapper.SelectPostList(page);
    }
}
