package cn.limbo.controller;

import cn.limbo.domain.TestUser;
import cn.limbo.domain.User;
import cn.limbo.exception.NoSuchCityException;
import cn.limbo.exception.NoSuchUserException;
import cn.limbo.service.UserListService;
import cn.limbo.service.UserService;
import cn.limbo.service.impl.UserListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by limbo on 2017/4/10.
 */

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	@Autowired
	UserListImpl userList;
	@RequestMapping(value = "/api/user",method = RequestMethod.GET)
	public User findByName(@RequestParam(value="userName") String userName){
		User user = null;
		try{
			user = userService.findByName(userName);
		} catch (NoSuchUserException e) {
			System.err.println(e.toString());
		} catch (NoSuchCityException e) {
			System.err.println(e.toString());
		}

		return user;
	}

	@RequestMapping(value = "/queryAll",method = RequestMethod.GET)
	public List<TestUser> queryAll(){
		return userList.queryUserList();
	}
}
