package com.trs.dao;

import com.season.core.db.Dao;
import com.trs.domain.Review;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangjie on 2016/10/20 0020.
 */
@Repository
public class ReviewDao {

    /**
     * 按照商品名字查找评论信息
     * @param reviewName
     * @return  返回该商品的所有评论
     */
    public List<Review> getReviewsByName(String reviewName){
        return Dao.findByColumn(Review.class,"reviewName",reviewName);
    }

    /**
     * 保存评论
     * @param review
     * @return 当前保存的评论，具有所有字段信息
     */
    public Review saveReview(Review review){
        return review.save();
    }
}
