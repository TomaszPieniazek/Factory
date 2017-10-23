import domain.Person;
import factory.DAOFactoryProvider;
import factory.EFactory;
import factory.IFactory;

public class mainFactory {

	public static void main(String[] args) {
		IFactory f2=DAOFactoryProvider.setType(EFactory.XML);
		
		IFactory f1= DAOFactoryProvider.setType(EFactory.DB);
		f1.setAge(10);
		f1.setCity("LODZ");
		f1.setName("Jurand");
		System.out.print(f1.getName()+" "+f1.getAge()+" "+f1.getCity());
		System.out.print("\n"+f1+"\n"+f2);
		
		f1=DAOFactoryProvider.setType(EFactory.XML);
		f1.setAge(10);
		f1.setCity("LODZ");
		f1.setName("Jurand");
		System.out.print("\n"+f1.getName()+" "+f1.getAge()+" "+f1.getCity());
		f2=DAOFactoryProvider.setType(EFactory.XML);
		
		System.out.print("\n"+f1+"\n"+f2);
		
	}

}
