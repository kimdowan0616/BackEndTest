package myspring.book.dao.mapper;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookMapper {
	BookVO selectBookById(String id);
	List<BookVO> selectBookList();
	void insertBook(BookVO bookVo);
	void updateBook(BookVO bookVo);
	void deleteBook(String id);
	
	
}
