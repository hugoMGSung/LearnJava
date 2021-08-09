package com.hugo95.hugoboard.board.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hugo95.hugoboard.board.model.BoardVO;
import com.hugo95.hugoboard.common.Pagination;
import com.hugo95.hugoboard.common.Search;
import com.hugo95.hugoboard.board.dao.BoardDAO;;

@Service
public class BoardServiceImpl implements BoardService {

  @Inject
  private BoardDAO boardDAO;

  @Override
  public List<BoardVO> getBoardList(Search search) throws Exception {
    return boardDAO.getBoardList(search);
  }

  @Override
  public int getBoardListCnt(Search search) throws Exception {
    return boardDAO.getBoardListCnt(search);
  }

  @Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
  @Override
  public void insertBoard(BoardVO boardVO) throws Exception {
    boardDAO.insertBoard(boardVO);
  }

  @Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
  @Override
  public BoardVO getBoardContent(int bid) throws Exception {
    boardDAO.updateViewCnt(bid); // 게시글 카운트 1증가
    return boardDAO.getBoardContent(bid);
  }

//  @Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
//  @Override
//  public BoardVO getBoardContent(int bid) throws Exception{
//    BoardVO boardVO = new BoardVO();
//    boardDAO.updateViewCnt(bid);
//    // boardVO = boardDAO.getBoardContent(bid); <= 기존 상세내역 조회 부분은 주석 처리
//    // Cate_cd에 컬럼에서 저장할 수 있는 크기보다 큰 문자열을 저장하고 게시물 수정 로직을 호출
//    // 수정 SQL문 처리시 예외발생 예정
//    boardVO.setBid(bid);
//    boardVO.setCate_cd("1111111111111111111111111111111111111");   
//    boardDAO.updateBoard(boardVO);
//    return boardVO;
//  }

  @Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
  @Override
  public void updateBoard(BoardVO boardVO) throws Exception {
    boardDAO.updateBoard(boardVO);
  }

  @Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
  @Override
  public void deleteBoard(int bid) throws Exception {
    boardDAO.deleteBoard(bid);
  }
}
