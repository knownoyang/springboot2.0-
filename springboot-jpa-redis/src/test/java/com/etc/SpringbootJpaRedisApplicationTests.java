package com.etc;

import com.etc.entity.Article;
import com.etc.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaRedisApplicationTests {

	@Autowired
	private ArticleService articleService;

	@Test
	public void contextLoads() {

		List<Article> list= articleService.getArticle();

		list.forEach(System.out::println);
	}

}
