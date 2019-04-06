package com.javagda23.creational.builder.zad3;

import java.util.List;

public class Book {
    private String ISBN;
    private int pages;
    private String title;
    private String author;
    private String description;

    public Book(String ISBN, int pages, String title, String author, String description) {
        this.ISBN = ISBN;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class BookBuilder{
        private String ISBN;
        private int pages;
        private String title;
        private String author;
        private String description;

        public BookBuilder withISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public BookBuilder withPages(int pages) {
            this.pages = pages;
            return this;
        }

        public BookBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Book build(){
            return new Book(ISBN, pages, title, author, description);
        }

    }

    @Override
    public String toString() {
        return  "ISBN='" + ISBN + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description;
    }
}
