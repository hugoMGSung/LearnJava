package com.hugo95.hugoboard.user.service;

import java.util.List;
import com.hugo95.hugoboard.user.model.UserVO;

public interface UserService {
  public List<UserVO> getUserList() throws Exception;

  public UserVO getUserInfo(String uid) throws Exception;

  public void insertUser(UserVO userVO) throws Exception;

  public void updateUser(UserVO userVO) throws Exception;

  public void deleteUser(String uid) throws Exception;
}
