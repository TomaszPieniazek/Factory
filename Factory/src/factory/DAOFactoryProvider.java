package factory;

import factoryImplementation.DBFactory;
import factoryImplementation.XMLFactory;

public class DAOFactoryProvider {
	
	      private static IFactory factory=null;
	      private DAOFactoryProvider() {
	    	  
	      }
	      
	      public static IFactory setType(EFactory e){
	    	  
	      if(e.equals(EFactory.XML)){
	         factory=new XMLFactory();
	         
	      } else if(e.equals(EFactory.DB)){
	         factory= new DBFactory();
	         
	      } else if(e.equals(EFactory.COS)){
	         factory= new XMLFactory();
	      }
	      
	      
	    	  return factory;
	      }

}
