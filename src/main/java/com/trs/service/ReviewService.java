package com.trs.service;

import com.trs.dao.ReviewDao;
import com.trs.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangjie on 2016/10/20 0020.
 */
@Service
public class ReviewService {

    @Autowired
    private ReviewDao reviewDao;

    /**
     * 通过商品名称来获取评论，
     * @param reviewName
     * @return
     */
    public List<Review>  getReviewsByName(String reviewName){
        return reviewDao.getReviewsByName(reviewName);
    }

    /**
     * 保存评论
     * @param review
     * @return
     */
    public Review saveReview(Review review){
        return reviewDao.saveReview(review);
    }
}
