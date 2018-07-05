package com.etc.dao;

import com.etc.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/5.
 */
public interface ArticleDao extends JpaRepository<Article,Integer>,JpaSpecificationExecutor<Article>,Serializable{


    //这里没有代码,注意没有代码..........
}
