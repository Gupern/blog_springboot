package com.gupern.blog.client;

import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Author: Gupern
 * @Date: 2021-5-16
 */
@Repository
public interface PostMapper {
//    DBPostListDao SelectPost(int id);
    List<PostList> SelectPostList(int page);

}
