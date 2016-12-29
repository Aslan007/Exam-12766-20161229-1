package lx.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;

import lx.event.AfterInsertFilmEvent;
import lx.event.BeforeInsertFilmEvent;

public class SpringEventListener implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		
		   if(event instanceof ContextClosedEvent ){    
               System.out.println(event.getClass().getSimpleName()+"=================****  Context stop!");        
              }
		   if(event instanceof BeforeInsertFilmEvent ){    
                   System.out.println("Before Insert Film Data!");    
              }
		   if(event instanceof AfterInsertFilmEvent){    
                  System.out.println("After Insert Film Data.");    
              }
		   
		   if(event instanceof ContextStartedEvent ){    
               System.out.println(event.getClass().getSimpleName()+" Context Start！");    
          }
		
	}

}
