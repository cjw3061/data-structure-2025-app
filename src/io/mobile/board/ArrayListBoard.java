package io.mobile.board;

import java.util.ArrayList;

public class ArrayListBoard implements Board {
    final private List<BoardInfo> list;

    public ArrayListBoard(){
        this.list = new ArrayList<>()
    }

    //게시물 찾기
    void public add(BoardInfo boardinfo){
        this.list.add(boardInfo);
    }
    //게시물 열람
    public void print(){
        for (Boardinfo boardinfo: list){
            System.out.println(boardinfo)
        }
    }

    @Override
    public String toString() {
        return "ArrayListBoard{" +
                "list=" + list +
                '}';
    }


    //제목으로 게시물 찾기
    Boardinfo find(String Subject){
        for (BoardInfo boardInfo list){
            if (boardInfo.getSubject().equals(subject)){
                return boardInfo;
            }
        }
    }
}
