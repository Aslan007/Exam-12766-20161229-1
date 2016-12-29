package lx.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lx.event.AfterInsertFilmEvent;
import lx.event.BeforeInsertFilmEvent;

@Aspect
public class Publish {
	
	@Before("execution(* lx.service.impl.*.*(..))")
	private void beforeInsert() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		BeforeInsertFilmEvent beforeEvent = new BeforeInsertFilmEvent(context);
		context.publishEvent(beforeEvent);
		
	}
	@After("execution(* lx.service.impl.FilmServiceImpl.insertFilm(..))")
	private void afterInsert() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		AfterInsertFilmEvent afterEvent = new AfterInsertFilmEvent(context);
		context.publishEvent(afterEvent);

	}

}
