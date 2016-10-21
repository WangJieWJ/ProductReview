package com.trs.service;

import com.season.core.db.Dao;
import com.trs.config.App;
import com.trs.domain.Review;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wangjie on 2016/10/20 0020.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = App.class)
public class ReviewServiceTest {

    @Autowired
    private ReviewService reviewService;

    @Test
    public void getReviewsByName() throws Exception {
        List<Review> lists=reviewService.getReviewsByName("电视机");

        Assert.assertNotNull(lists);
    }

    @Test
    public void saveReview() throws Exception {
        Review review=new Review();
        review.setReviewName("电视机");
        review.setReviewContent("测试时间"+ LocalTime.now());
        review=reviewService.saveReview(review);
        Assert.assertNotEquals(0,review.getReviewId());

        Review review1= Dao.findById(Review.class,review.getReviewId());
        Assert.assertNotNull(review1);
    }

}