package com.etc;

import com.etc.dao.ArticleDao;
import com.etc.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * Created by Administrator on 2018/7/5.
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Article> list()
    {
        return articleDao.findAll();
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Article add(Article article)
    {
        return articleDao.save(article);
    }


    @RequestMapping(value = "del",method = RequestMethod.DELETE)
    public String delete(Integer articleId)
    {

         articleDao.deleteById(articleId);
         return "success";

    }


}
