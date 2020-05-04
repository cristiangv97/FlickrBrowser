package com.example.crimangv;

import java.io.Serializable;

class Photo implements Serializable {

    private static final Long serialVersionUID = 1L;
    
    private String mTitle;
    private String mAuthor;
    private String mAuthorID;
    private String mLinks;
    private String mTags;
    private String mImage;

    public Photo(String title, String author, String authorID, String links, String tags, String image) {
        mTitle = title;
        mAuthor = author;
        mAuthorID = authorID;
        mLinks = links;
        mTags = tags;
        mImage = image;
    }

    String getTitle() {
        return mTitle;
    }

    String getAuthor() {
        return mAuthor;
    }

    String getAuthorID() {
        return mAuthorID;
    }

    String getLink() {
        return mLinks;
    }

    String getTags() {
        return mTags;
    }

    String getImage() {
        return mImage;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mAuthorID='" + mAuthorID + '\'' +
                ", mLinks='" + mLinks + '\'' +
                ", mTags='" + mTags + '\'' +
                ", mImage='" + mImage + '\'' +
                '}';
    }
}
