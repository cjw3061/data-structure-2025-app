package io.mobile.board;

public class BoardInfo {
    private String subject;
    private String content;
    private String writer;
    private LocalDate date;


    public BoardInfo(final String subject, final  String content, final  String writer, final  LocalDate date) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }



    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public LocalDate getDate() {
        return date;
    }
}