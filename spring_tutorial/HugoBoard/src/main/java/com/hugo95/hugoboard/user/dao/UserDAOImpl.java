package com.hugo95.hugoboard.user.dao;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hugo95.hugoboard.user.model.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
  
  @Inject
  private SqlSession sqlSession;

  @Override
  public List<UserVO> getUserList() throws Exception {
    return sqlSession.selectList("com.hugo95.hugoboard.user.userMapper.getUserList");
  }

  @Override
  public UserVO getUserInfo(String uid) throws Exception {
    return sqlSession.selectOne("com.hugo95.hugoboard.user.userMapper.getUserInfo", uid);
  }

  @Override
  public int insertUser(UserVO userVO) throws Exception {
    return sqlSession.insert("com.hugo95.hugoboard.user.userMapper.insertUser", userVO);
  }

  @Override
  public int updateUser(UserVO userVO) throws Exception {
    return sqlSession.update("com.hugo95.hugoboard.user.userMapper.updateUser", userVO);
  }

  @Override
  public int deleteUser(String uid) throws Exception {
    return sqlSession.delete("com.hugo95.hugoboard.user.userMapper.deleteUser", uid);
  }
}
