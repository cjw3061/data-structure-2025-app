package io.mobile.board;

public class Main{
    public static void Main(String[] args){
        ArrayListBoard board = new ArrayListBoard();

        board.add(new BoardInfo( subject "자바", content"자바 프로그래밍", who '홍길동', Localdate.now()));
        board.add(new BoardInfo( subject "자료규ㅜ조", content"자료구조와 알고리즘", who '홍길동', Localdate.now()));

        board.print();

        BoardInfo boardinfo = board.find(subject "자바");
        System.out.println(boardInfo);
    }
}
