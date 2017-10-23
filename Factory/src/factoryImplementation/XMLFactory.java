package factoryImplementation;

import domain.Person;
import factory.IFactory;

public class XMLFactory implements IFactory{
	@Override
	public String getName() {
		return Person.name;
	}
	
	@Override
	public void setName(String n) {
		Person.name=n;	
	}

	@Override
	public int getAge() {
		return Person.age;
	}

	@Override
	public void setAge(int a) {
		Person.age=a;
	}

	@Override
	public String getCity() {
		return Person.city;
	}

	@Override
	public void setCity(String c) {
		Person.city=c;
	}

}
