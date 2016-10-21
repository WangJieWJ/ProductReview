package com.trs.domain;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.TableInfo;
import com.season.core.db.annotation.Transient;

import java.util.Date;

/**
 * Created by wangjie on 2016/10/20 0020.
 */
@TableInfo(tableName = Review.tabelName,pkName = "reviewId")
public class Review extends Pojo<Review>{

    @Transient
    public final static String tabelName="review";

    private int reviewId;  //参数名称设置····
    private String reviewName;
    private String reviewContent;
    private Date reviewDate;   //日期类型的数据

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Review() {
    }

    public Review(String reviewName, String reviewContent) {
        this.reviewName = reviewName;
        this.reviewContent = reviewContent;
    }

    public Review(int reviewId, String reviewName, String reviewContent, Date reviewDate) {
        this.reviewId = reviewId;
        this.reviewName = reviewName;
        this.reviewContent = reviewContent;
        this.reviewDate = reviewDate;
    }
}
