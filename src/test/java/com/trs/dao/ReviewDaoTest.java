package com.trs.dao;

import com.season.core.db.Dao;
import com.trs.config.App;
import com.trs.domain.Review;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wangjie on 2016/10/20 0020.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = App.class)
public class ReviewDaoTest {

    @Autowired
    private ReviewDao reviewDao;

    @Test
    public void getReviewsByName() throws Exception {
        List<Review> lists=reviewDao.getReviewsByName("电视机");
        Assert.assertNotNull(lists);
    }

    @Test
    public void saveReview() throws Exception {
        Review review=new Review();
        review.setReviewName("电视机");
        review.setReviewContent("测试数据");
        review=reviewDao.saveReview(review);

        Assert.assertNotEquals(0,review.getReviewId());

        Review review1= Dao.findById(Review.class,review.getReviewId());
        Assert.assertNotNull(review1);
    }

}