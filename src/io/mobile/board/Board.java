package io.mobile.board;

public interface Board {
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
        }
    }


}
