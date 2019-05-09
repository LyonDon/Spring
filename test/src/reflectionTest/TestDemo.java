package reflectionTest;

class Person {

	@Override
	public String toString() {
		return "class person instance.";
	}
}

public class TestDemo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("reflectionTest.Person"); // 取得Class对象
		// System.out.println(cls.getName()); // 反着来
		Object object = cls.newInstance();// 实例化对象，和new关键字一样
		Person person = (Person) object;// 向下转型
		System.out.println(person);
	}
}