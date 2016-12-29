package lx.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

import lx.event.AfterInsertFilmEvent;
import lx.event.BeforeInsertFilmEvent;

public class SpringEventListener implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		
		   if(event instanceof ContextClosedEvent ){    
               System.out.println(event.getClass().getSimpleName()+"  Context stop!");        
              }else if(event instanceof ContextRefreshedEvent ){  
                  System.out.println(event.getClass().getSimpleName()+" Context Start!");        
              }else if(event instanceof BeforeInsertFilmEvent ){    
                   System.out.println("Before Insert Film Data!");    
              }else if(event instanceof AfterInsertFilmEvent){    
                  System.out.println("After Insert Film Data.");    
              }
		
	}

}
