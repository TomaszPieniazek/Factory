import factory.DAOFactoryProvider;
import factory.EFactory;
import factory.IFactory;

public class mainFactory {

	public static void main(String[] args) {
	
		IFactory f1= DAOFactoryProvider.setType(EFactory.DB);
		IFactory f2= DAOFactoryProvider.setType(EFactory.DB);
		System.out.print(f1+" "+f2+" \n");
		
		f1.setAge(10);
		f1.setCity("Spych�w");
		f1.setName("Jurand");
		System.out.print("\n"+f1.getName()+" "+f1.getAge()+" "+f1.getCity());
		
		f2.setAge(22);
		f2.setCity("Szczytno");
		f2.setName("Zygfryd de Lowe");
		System.out.print("\n"+f2.getName()+" "+f2.getAge()+" "+f2.getCity());
		System.out.print("\n"+f1.getName()+" "+f1.getAge()+" "+f1.getCity());
		System.out.print("\n"+f1+" "+f2+" \n");
		
		f1=DAOFactoryProvider.setType(EFactory.XML);
		f1.setAge(10);
		f1.setCity("LODZ");
		f1.setName("Jurand");
		System.out.print("\n"+f1.getName()+" "+f1.getAge()+" "+f1.getCity());
		
		
		f2=DAOFactoryProvider.setType(EFactory.XML);
		System.out.print("\n"+f1+" "+f2+" \n");
		
			
	}

}
