package myspring.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.book.dao.BookDAO;
import myspring.book.vo.BookVO;

@Service("bookService")
public class BookServiceImpl implements BookService{
	@Autowired
	BookDAO bookdao;
	
	@Override
	public BookVO getBook(String id) {
		return bookdao.read(id);
	}
	
	@Override
	public List<BookVO> getBookList() {
		return bookdao.readAll();
	}
	
	@Override
	public void insertBook(BookVO bookVo) {
		bookdao.insert(bookVo);
	}

	@Override
	public void updateBook(BookVO bookVo) {
		bookdao.update(bookVo);
	}

	@Override
	public void deleteBook(String id) {
		bookdao.delete(id);
	}
}
