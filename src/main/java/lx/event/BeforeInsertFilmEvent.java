package lx.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class BeforeInsertFilmEvent  extends ApplicationContextEvent{

	public BeforeInsertFilmEvent(ApplicationContext source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}
