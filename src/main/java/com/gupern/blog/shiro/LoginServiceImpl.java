package com.gupern.blog.shiro;

import org.springframework.stereotype.Service;

import com.gupern.blog.shiro.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public User getUserByName(String getMapByName) {
        return getMapByName(getMapByName);
    }

    /**
     * 模拟数据库查询
     *
     * @param userName 用户名
     * @return User
     */
    private User getMapByName(String userName) {
        Permission permission1 = new Permission("1", "query");
        Permission permission2 = new Permission("2", "add");

        Set<Permission> permissionSet = new HashSet<>();
        permissionSet.add(permission1);
        permissionSet.add(permission2);
        Role role = new Role("1", "admin", permissionSet);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(role);
        User user = new User("1", "wsl", "123456", roleSet);
        Map<String, User> map = new HashMap<>();
        map.put(user.getUserName(), user);

        Set<Permission> permissionSet1 = new HashSet<>();
        permissionSet1.add(permission1);
        Role role1 = new Role("2", "user", permissionSet1);
        Set<Role> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        User user1 = new User("2", "zhangsan", "123456", roleSet1);
        map.put(user1.getUserName(), user1);
        return map.get(userName);
    }
}