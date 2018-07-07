package com.etc.service.impl;

import com.etc.dao.ArticleDao;
import com.etc.entity.Article;
import com.etc.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/7/5.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    @Cacheable(cacheNames = "com.etc.service.getAll")
    public List<Article> getArticle() {
        return articleDao.findAll();
    }
}
