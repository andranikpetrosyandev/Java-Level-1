package com.homework.week18.website.entity;

import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.Collections;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blob_id", nullable = false)
    private String blobId;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false, foreignKey = @ForeignKey(name = "FK_IMAGES_POST_ID"))
    private Post post;

    public Image() {
    }

    public Image(String blobId, Post post) {
        this.blobId = blobId;
        this.post = post;

    }

    public Long getId() {
        return id;
    }

    public String getBlobId() {
        return blobId;
    }

    public Post getPost() {
        return post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Image image = (Image) o;

        if (id != null ? !id.equals(image.id) : image.id != null) return false;
        if (blobId != null ? !blobId.equals(image.blobId) : image.blobId != null) return false;
        return post != null ? post.equals(image.post) : image.post == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (blobId != null ? blobId.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", blobId='" + blobId + '\'' +
                ", post=" + post +
                '}';
    }
}
