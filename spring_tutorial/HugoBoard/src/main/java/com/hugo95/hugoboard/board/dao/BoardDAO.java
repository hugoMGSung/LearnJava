package com.hugo95.hugoboard.board.dao;

import java.util.List;

import com.hugo95.hugoboard.board.model.*;
import com.hugo95.hugoboard.common.Pagination;
import com.hugo95.hugoboard.common.Search;

public interface BoardDAO {

  public List<BoardVO> getBoardList(Search search) throws Exception;
  
  //총 게시글 개수 확인
  public int getBoardListCnt(Search search) throws Exception;

  public BoardVO getBoardContent(int bid) throws Exception;

  public int insertBoard(BoardVO boardVO) throws Exception;

  public int updateBoard(BoardVO boardVO) throws Exception;

  public int updateViewCnt(int bid) throws Exception;

  public int deleteBoard(int bid) throws Exception;



}
