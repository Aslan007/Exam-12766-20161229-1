package lx.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class AfterInsertFilmEvent extends ApplicationContextEvent{

	public AfterInsertFilmEvent(ApplicationContext source) {
		super(source);
	}

}
