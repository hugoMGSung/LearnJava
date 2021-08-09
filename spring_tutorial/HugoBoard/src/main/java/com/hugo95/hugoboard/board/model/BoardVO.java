package com.hugo95.hugoboard.board.model;

public class BoardVO {

  public int bid;
  public String cate_cd;
  public String title;
  public String content;
  public String tag;
  public int view_cnt;
  public String reg_id;
  public String reg_dt;
  public String mod_id;
  public String mod_dt;

  public int getBid() {
    return bid;
  }

  public void setBid(int bid) {
    this.bid = bid;
  }

  public String getCate_cd() {
    return cate_cd;
  }

  public void setCate_cd(String cate_cd) {
    this.cate_cd = cate_cd;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public int getView_cnt() {
    return view_cnt;
  }

  public void setView_cnt(int view_cnt) {
    this.view_cnt = view_cnt;
  }

  public String getReg_id() {
    return reg_id;
  }

  public void setReg_id(String reg_id) {
    this.reg_id = reg_id;
  }

  public String getReg_dt() {
    return reg_dt;
  }

  public void setReg_dt(String reg_dt) {
    this.reg_dt = reg_dt;
  }

  public String getMod_id() {
    return mod_id;
  }

  public void setMod_id(String mod_id) {
    this.mod_id = mod_id;
  }

  public String getMod_dt() {
    return mod_dt;
  }

  public void setMod_dt(String mod_dt) {
    this.mod_dt = mod_dt;
  }

}
