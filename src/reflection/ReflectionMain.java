package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionMain {

	public static void main(String[] args) {
		
		//IMP -- Get the class dynamically
		//Class tempClass = Class.forName(fromConversion);
		
		Class reflectClass = ClassB.class;
		
		String className=reflectClass.getName();
		System.out.println("Class Name : "+ className);
		
		int classModifier=reflectClass.getModifiers();
		
		System.out.println("Class isPublic :"+Modifier.isPublic(classModifier));
		//We can do -- isAbstract, isFinal, isInterface, isPrivate, isProtected
		//isStatic, isStrict, isSynchronized, isVolatile
		
		//to get list of interfaces used by our class
		Class[] interfaces = reflectClass.getInterfaces();
		
		Class classSuper = reflectClass.getSuperclass();
		System.out.println("Super Class :"+classSuper.getName());
		
		Method[] classMethods = reflectClass.getMethods();
		for (Method method : classMethods) {
			System.out.print(method.getName());
			
			if(method.getName().startsWith("get")){
				System.out.print(" -- Getter");
			}else if(method.getName().startsWith("set")){
				System.out.print(" -- Setter");
			}
			System.out.print(" -- Return Type :" + method.getReturnType());
			
			//Parameter of method is also Class - String ,int
			Class[] parameterTypes=method.getParameterTypes();
			System.out.print(" -- Parameter Type :");
			for (Class parameterType : parameterTypes) {
				System.out.print(parameterType+",");
			}
			System.out.println("");
		}
		
		//To access class constructor
		Constructor constructor =null;
		
		Object constructorObject=null;
		try {
			//For multiple class we can create Class Array and pass it
			constructor = reflectClass.getConstructor(new Class[]{ClassA.class});
			
			//To get Instance of Object from Constructor
			constructorObject=reflectClass.getConstructor(int.class,String.class).newInstance(1,"asd");
						
			Class[] constructParameters = constructor.getParameterTypes();
			
			for (Class constructorParam : constructParameters) {
				System.out.print(constructorParam.getName());
			}
			
			
			ClassA a = new ClassA();
			ClassB b = null;
			
			//This will return an object - but we want constructor.newInstance(c);
			b=(ClassB)constructor.newInstance(a);
			
			b.setX(12);
			System.out.println(b.getX());
			
			//Access Private Field of Class
			Field privateStringName=null;
			ClassB b2=new ClassB(a);
			
			//IMP Field can be accessed dynamically -- as Field Name can be given as idCode
			privateStringName = ClassB.class.getDeclaredField("idCode");
			privateStringName.setAccessible(true);
			
			//we need to give the object over here - as many objects of that class will be present
			//to get the object which you want and get the value of it
			System.out.println(privateStringName.get(b2));
			
			ClassB b3=new ClassB(a);
			b3.setPrivate("XYZ");

			ClassB b4=new ClassB(a);
			b4.setPrivate("ZXC");
			//Use of passing the object
			System.out.println("Private Value of idCode is "+privateStringName.get(b3));
			System.out.println("Private Value of idCode is "+privateStringName.get(b4));
			
			//Accessing Method
			String methodName="getPrivate";
			//if we do getMethod we wont be able to get the private method
			Method privateMethod = ClassB.class.getDeclaredMethod(methodName,null)	;
			privateMethod.setAccessible(true);
			
			//Object and null to be passed for it
			String privateReturnVal=(String)privateMethod.invoke(b3,null);
			
			System.out.println("privateReturnVal :"+privateReturnVal);
			
			//calling method with arguments
			Class[] methodParameters=new Class[]{Integer.TYPE,String.class};
			//we need to pass the parameter
			Object[] paramValue=new Object[]{new Integer(10),new String("ZXC")};
			
			Method otherPrivateMethod=ClassB.class.getDeclaredMethod("getOtherPrivate",methodParameters);
			otherPrivateMethod.setAccessible(true);
			String privateReturnVal2=(String)otherPrivateMethod.invoke(b3,paramValue);
			System.out.println("privateReturnVal2 :"+privateReturnVal2);
			
		} catch (Exception e){
			System.out.println("Exception got"+e.getStackTrace());
		}
	}

}
