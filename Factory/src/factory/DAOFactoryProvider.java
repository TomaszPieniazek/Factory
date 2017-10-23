package factory;

import factoryImplementation.DBFactory;
import factoryImplementation.XMLFactory;

public class DAOFactoryProvider implements IFactory{
	
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

		@Override
		public String getName() {
			return factory.getName();
		}

		@Override
		public void setName(String n) {
			factory.setName(n);
		}

		@Override
		public int getAge() {
			return factory.getAge();
		}

		@Override
		public void setAge(int a) {
			factory.setAge(a);
		}

		@Override
		public String getCity() {
			return factory.getCity();
		}

		@Override
		public void setCity(String c) {
			factory.setCity(c);
		}

}
