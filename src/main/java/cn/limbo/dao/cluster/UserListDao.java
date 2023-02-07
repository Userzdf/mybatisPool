package cn.limbo.dao.cluster;

import cn.limbo.domain.TestUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserListDao {

    List<TestUser> queryUserList();
}
