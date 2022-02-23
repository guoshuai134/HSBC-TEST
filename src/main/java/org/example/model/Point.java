package org.example.model;

public class Point {

    private int startPosition;
    private int endPosition;
    private String prevChar;

    public Point() {
    }

    public Point(int start, int end, String prev) {
        this.startPosition = start;
        this.endPosition = end;
        this.prevChar = prev;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }

    public String getPrevChar() {
        return prevChar;
    }

    public void setPrevChar(String prevChar) {
        this.prevChar = prevChar;
    }
}
