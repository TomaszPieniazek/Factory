package factory;

import factoryImplementation.XMLFactory;

public class DAOFactoryProvider {
	public IFactory getFactory(EFactory e){
	      if(e.equals(null)){
	         return null;
	      }		
	      if(e.equals(EFactory.XML)){
	         return new XMLFactory();
	         
	      } else if(e.equals(EFactory.DB)){
	         return new XMLFactory();
	         
	      } else if(e.equals(EFactory.COS)){
	         return new XMLFactory();
	      }
	      
	      return null;
	   }

}
