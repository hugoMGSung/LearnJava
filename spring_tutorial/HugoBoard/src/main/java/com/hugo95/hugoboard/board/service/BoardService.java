package com.hugo95.hugoboard.board.service;

import java.util.List;
import java.util.Map;

import com.hugo95.hugoboard.board.model.BoardVO;
import com.hugo95.hugoboard.common.Pagination;
import com.hugo95.hugoboard.common.Search;

public interface BoardService {

  public List<BoardVO> getBoardList(Search search) throws Exception;
  
  //총 게시글 개수 확인
  public int getBoardListCnt(Search search) throws Exception;

  /* public Map<String, Object> insertBoard(BoardVO boardVO) throws Exception; */
  public void insertBoard(BoardVO boardVO) throws Exception;

  public BoardVO getBoardContent(int bid) throws Exception;

  public void updateBoard(BoardVO boardVO) throws Exception;

  public void deleteBoard(int bid) throws Exception;
}
