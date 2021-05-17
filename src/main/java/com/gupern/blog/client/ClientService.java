package com.gupern.blog.client;

import com.github.pagehelper.Page;

import java.util.List;

public interface ClientService {
    Page<Post> getClientList();
}
