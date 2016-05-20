package com.goujia.website.base.dao.system;

import java.util.List;

import com.goujia.website.base.entity.system.Book;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.system.BookSearchParam;

public interface BookMapper {
    int count(BookSearchParam searchParam);
    List<Book> listPage(BookSearchParam searchParam,
            NewRowBounds rowBounds);
    int deleteByPrimaryKey(Integer id);

    int add(Book record);

    int addSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}