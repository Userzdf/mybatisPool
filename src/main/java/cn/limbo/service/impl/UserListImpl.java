package cn.limbo.service.impl;

import cn.limbo.dao.cluster.UserListDao;
import cn.limbo.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserListImpl implements UserListService {
    @Autowired
    UserListDao userListDao;
    @Override
    public List queryUserList() {
        return userListDao.queryUserList();
    }
}
