package myspring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.book.service.BookService;
import myspring.book.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	public BookController() {
		System.out.println(this.getClass().getName() + " 생성자 호출됨");
	}
	
	@RequestMapping("/bookList.do")
	public ModelAndView bookList() {
		List<BookVO> bookVOList = bookService.getBookList();
		return new ModelAndView("bookList", "bookList", bookVOList);
	}
	
	@RequestMapping("/getBook.do")
	public String getBook(@RequestParam("id") String id, Model model) {	// 매개변수명이 ?뒤의 id와 같거나  다르면 RequestParam("@") @에 id를 해줘야함 
		BookVO bookVO = bookService.getBook(id);
		model.addAttribute("books", bookVO);
		return "bookInfo";
	}
}
