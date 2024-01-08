/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.builder;

import java.time.Year;

/**
 *
 * @author muchiri
 */
public class Book {

    private final String isbn;
    private final String title;
    private final Genre genre;
    private final String author;
    private final Year published;
    private final String description;

    private Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.genre = builder.genre;
        this.author = builder.author;
        this.published = builder.published;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Year getPublished() {
        return published;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {

        private final String isbn;
        private final String title;
        private Genre genre;
        private String author;
        private Year published;
        private String description;

        public Builder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public Builder genre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder published(Year published) {
            this.published = published;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Book build() {
            validate();
            return new Book(this);
        }

        private void validate() throws IllegalStateException {
            MessageBuilder mb = new MessageBuilder();
            if (isbn == null) {
                mb.append("ISBN must not be null.");
            }
            if (title == null) {
                mb.append("Title must not be null.");
            } else if (title.length() < 2) {
                mb.append("Title must have at least 2 characters.");
            } else if (title.length() > 100) {
                mb.append("Title cannot have more than 100 characters.");
            }
            if (author != null && author.length() > 50) {
                mb.append("Author cannot have more than 50 characters.");
            }
            if (published != null && published.isAfter(Year.now())) {
                mb.append("Year published cannot be greater than current year.");
            }
            if (description != null && description.length() > 500) {
                mb.append("Description cannot have more than 500 characters.");
            }
            if (mb.length() > 0) {
                throw new IllegalStateException(mb.toString());
            }
        }
    }

}
