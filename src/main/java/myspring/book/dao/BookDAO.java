package myspring.book.dao;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookDAO {

	public void insert(BookVO bookVO);
	
	public List<BookVO> readAll();
	
	public void update(BookVO bookVO);
	
	public void delete(String id);
	
	public BookVO read(String title);

}
