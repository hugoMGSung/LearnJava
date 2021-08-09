package com.hugo95.hugoboard.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hugo95.hugoboard.board.model.BoardVO;
import com.hugo95.hugoboard.board.service.BoardService;
import com.hugo95.hugoboard.common.Pagination;
import com.hugo95.hugoboard.common.Search;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

  private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

  @Inject
  private BoardService boardService;

  @RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
  public String getBoardList(Model model
      , @RequestParam(required = false, defaultValue = "1") int page
      , @RequestParam(required = false, defaultValue = "1") int range
      , @RequestParam(required = false, defaultValue = "title") String searchType
      , @RequestParam(required = false) String keyword) throws Exception {
    
    Search search = new Search();
    search.setSearchType(searchType);
    search.setKeyword(keyword);

    // 전체 게시글 개수
    int listCnt = boardService.getBoardListCnt(search);
    
    search.pageInfo(page, range, listCnt);

    // Pagination 객체생성
    //Pagination pagination = new Pagination();
    //pagination.pageInfo(page, range, listCnt);
    
    model.addAttribute("pagination", search);
    model.addAttribute("boardList", boardService.getBoardList(search));
    return "board/index";
  }

  @RequestMapping("/getBoardForm")
  public String getBoardForm() {
    return "board/boardForm";
  }

  @RequestMapping(value = "/setBoardData", method = RequestMethod.POST)
  public String setBoardData(@ModelAttribute("BoardVO") BoardVO boardVO, @RequestParam("mode") String mode,
      RedirectAttributes rttr) throws Exception {
    if (mode.equals("edit")) {
      boardService.updateBoard(boardVO);
    } else {
      boardService.insertBoard(boardVO);
    }
    return "redirect:/board/getBoardList";
  }

  @RequestMapping(value = "/getBoardContent", method = RequestMethod.GET)
  public String getBoardContent(Model model
      , @RequestParam("bid") int bid) throws Exception {
    model.addAttribute("boardContent", boardService.getBoardContent(bid));
    return "board/boardContent";
  }

  @RequestMapping(value = "/editForm", method = RequestMethod.GET)
  public String editForm(@RequestParam("bid") int bid, @RequestParam("mode") String mode, Model model)
      throws Exception {
    model.addAttribute("boardContent", boardService.getBoardContent(bid));
    model.addAttribute("mode", mode);
    model.addAttribute("boardVO", new BoardVO());

    return "board/boardForm";
  }

  @RequestMapping(value = "/deleteBoard", method = RequestMethod.GET)
  public String deleteBoard(RedirectAttributes rttr, @RequestParam("bid") int bid) throws Exception {
    boardService.deleteBoard(bid);
    return "redirect:/board/getBoardList";
  }

//  @ExceptionHandler(RuntimeException.class)
//  public String exceptionHandler(Model model, Exception e) {
//    logger.info("exception : " + e.getMessage());
//    model.addAttribute("exception", e);
//    return "error/exception";
//  }
}