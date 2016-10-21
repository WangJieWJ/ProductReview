package com.trs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.season.core.ActionKey;
import com.season.core.Controller;
import com.season.core.ControllerKey;
import com.trs.domain.Review;
import com.trs.service.ReviewService;
import com.trs.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wangjie on 2016/10/20 0020.
 */
@ControllerKey(value = "hello")
public class ReviewController extends Controller{

    @Autowired
    private ReviewService reviewService;

    @ActionKey(value = "get")
    public void getReviewsByName(){
        String reviewName=getPara("reviewName");
        if(StringUtils.hasLength(reviewName)){
            List<Review> lists=reviewService.getReviewsByName(reviewName);
//            System.out.println("接受到要返回数据！！！");
            renderText(((JSON)JSONArray.toJSON(lists)).toJSONString());
            return;
        }else{
            renderText("参数未赋值！");
        }
    }

    @ActionKey(value = "save")
    public void saveReview(){
        String reviewName=getPara("reviewName");
        String reviewContent=getPara("reviewContent");
        if(StringUtils.hasLength(reviewName) && StringUtils.hasLength(reviewContent)){
            Review review=new Review(reviewName,reviewContent);
            reviewService.saveReview(review);
            return;
        }else{
            renderText("缺少参数值！");
        }

    }
}
