package ${package};

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App{
	private static Logger LOG = LoggerFactory.getLogger( App.class );
	
    public static void main( String[] args ){
    	try( ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext( new String[]{"application.xml"} ) ){
    		ctx.registerShutdownHook();
			new CountDownLatch(1).await();
		}catch(Exception ex){
			LOG.error( "Fatal error in starting ", ex );
		}
    }
}
