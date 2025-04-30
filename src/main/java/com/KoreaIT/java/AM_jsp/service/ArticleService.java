package com.KoreaIT.java.AM_jsp.service;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.KoreaIT.java.AM_jsp.dao.ArticleDao;
import com.KoreaIT.java.AM_jsp.util.DBUtil;
import com.KoreaIT.java.AM_jsp.util.SecSql;

public class ArticleService {

	private Connection conn;
	private ArticleDao articleDao;

	public ArticleService(Connection conn) {
		this.conn = conn;
		this.articleDao = new ArticleDao(conn);
	}

	public int getTotalCnt() {
		return articleDao.getTotalCnt();
	}

	public List<Map<String, Object>> getForPrintArticles(int limitFrom, int itemsInAPage) {
		

		return articleDao.getForPrintArticles(limitFrom,itemsInAPage);
	}

}
