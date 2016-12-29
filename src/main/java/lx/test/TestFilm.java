package lx.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lx.po.Film;
import lx.service.FilmService;

public class TestFilm {
	
	
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		 context.start();
		
		FilmService filmService = (FilmService) context.getBean("filmService");
		Film film = (Film) context.getBean("film");
		
		System.out.println("请输入电影名称 (title):");
		 Scanner s1 = new Scanner(System.in);
		 String title =s1.nextLine(); 
		 film.setTitle(title);
		 
		 System.out.println("请输入电影描述 请输入电影描述 (description):");
		 Scanner s2 = new Scanner(System.in);
		 String description =  s2.nextLine();
		 film.setDescription(description);
		 
		 System.out.println("请输入语言 ID(language_id):");
		 Scanner s3 = new Scanner(System.in);
		 String language_id =  s3.nextLine();
		 int i = Integer.parseInt(language_id);
		 
		 film.setLanguageId((byte) i);
		 
		 filmService.insertFilm(film);
		 
		 context.close();
		 
		 
	}

}
