package myspring.book.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.book.dao.mapper.BookMapper;
import myspring.book.vo.BookVO;

@Repository("bookDao")
public class BookDAOImplMapper implements BookDAO{
	@Autowired
	private BookMapper bookMapper;

	@Override
	public BookVO read(String title) {
		BookVO bookVo = bookMapper.selectBookById(title);
		return bookVo;
	}
	
	@Override
	public List<BookVO> readAll() {
		List<BookVO> bookList = bookMapper.selectBookList();
		return bookList;
	}
	
	@Override
	public void insert(BookVO bookVo) {
		bookMapper.insertBook(bookVo);
		System.out.println(bookVo + " 등록 성공");
	}

	@Override
	public void update(BookVO bookVo) {
		bookMapper.updateBook(bookVo);
	}	

	@Override
	public void delete(String id) {
		bookMapper.deleteBook(id);
		System.out.println(id + " Book 삭제");
	}

	
	
	
}
