package com.gupern.blog.shiro;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  权限对应实体类
 */
@Data
@AllArgsConstructor
public class Permission {
    private String id;
    private String permissionName;
}
