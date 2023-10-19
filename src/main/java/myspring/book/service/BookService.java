package myspring.book.service;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookService {
	
	public BookVO getBook(String id);
	
	public List<BookVO> getBookList();

	public void insertBook(BookVO book);

	public void updateBook(BookVO book);

	public void deleteBook(String id);
}
