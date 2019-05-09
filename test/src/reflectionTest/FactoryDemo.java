package reflectionTest;

interface Fruit {
	public void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println("吃苹果。");
	}
}

class Orange implements Fruit{

	@Override
	public void eat() {
		System.out.println("吃橙子.");
	}
	
}

class Factory {
	public static Fruit getInstance(String className) {
		Fruit f = null;
		// return new Apple();
		try {
			Class<?> cla = Class.forName(className);
			Object object = cla.newInstance();
			f = (Fruit) object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}

public class FactoryDemo {
	public static void main(String[] args) {
		Fruit f = Factory.getInstance("reflectionTest.Orange");
		f.eat();
	}
}