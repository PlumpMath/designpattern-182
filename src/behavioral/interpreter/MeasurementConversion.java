package behavioral.interpreter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeasurementConversion {
	
	public static void main(String args[]){
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String questionAsked = JOptionPane.showInputDialog(frame,"What is your question");
		ConversionContext question = new ConversionContext(questionAsked);
		
		String fromConversion = question.getFromConversion();
		//Class we will be calling
		String toConversion = question.getToConversion();
		//To conversion method we are going to call in that class
		
		double quantity=question.getQuantity();
		
		//Get the class dynamically
		try {
			//We need to pass package name also for it -- as this class is in package
			Class tempClass = Class.forName("behavioral.interpreter." + fromConversion);
			
			Constructor con = tempClass.getConstructor();
			//All of the object will be Expression -- so taking abstract class Expression
			//We have got The object of that class
			Object convertFrom = (Expression)con.newInstance();
			
			//Now we can call method of it by using the name of the method
			//Since we will be passing the Quantity as double
			//we are using Double class over here instead of DOuble.type
			Class[] methodParams = new Class[]{Double.class};
			
			//Passing dynamic method name and parameter are same
			Method conversionMethod = tempClass.getMethod(toConversion,methodParams);
			
			//Passing value
			Object[] params = new Object[]{new Double(question.getQuantity())};
			
			String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
			
			String answerToQuestion = question.getResponse()+ " " + toQuantity + " " + question.getToConversion();
			
			JOptionPane.showMessageDialog(null, answerToQuestion);
			frame.dispose();
			
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
