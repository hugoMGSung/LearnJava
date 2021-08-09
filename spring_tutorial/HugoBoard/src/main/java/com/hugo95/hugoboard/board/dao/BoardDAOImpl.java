package com.hugo95.hugoboard.board.dao;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hugo95.hugoboard.board.model.BoardVO;
import com.hugo95.hugoboard.common.Pagination;
import com.hugo95.hugoboard.common.Search;

@Repository
public class BoardDAOImpl implements BoardDAO {
  
  @Inject
  private SqlSession sqlSession;

  @Override
  public List<BoardVO> getBoardList(Search search) throws Exception {
    return sqlSession.selectList("com.hugo95.hugoboard.board.boardMapper.getBoardList", search);
  }

  @Override
  public int getBoardListCnt(Search search) throws Exception {
    return sqlSession.selectOne("com.hugo95.hugoboard.board.boardMapper.getBoardListCnt", search);
  }
  
  @Override
  public BoardVO getBoardContent(int bid) throws Exception {
    return sqlSession.selectOne("com.hugo95.hugoboard.board.boardMapper.getBoardContent", bid);
  }

  @Override
  public int insertBoard(BoardVO boardVO) throws Exception {
    return sqlSession.insert("com.hugo95.hugoboard.board.boardMapper.insertBoard", boardVO);
  }

  @Override
  public int updateBoard(BoardVO boardVO) throws Exception {
    return sqlSession.update("com.hugo95.hugoboard.board.boardMapper.updateBoard", boardVO);
  }

  @Override
  public int updateViewCnt(int bid) throws Exception {
    return sqlSession.update("com.hugo95.hugoboard.board.boardMapper.updateViewCnt", bid);
  }

  @Override
  public int deleteBoard(int bid) throws Exception {
    return sqlSession.insert("com.hugo95.hugoboard.board.boardMapper.deleteBoard", bid);
  }
}
