package com.gupern.blog.client;

import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Author: Gupern
 * @Date: 2021-5-16
 */
@Repository
public interface PostMapper {
    Page<Post> SelectPostList();
}
