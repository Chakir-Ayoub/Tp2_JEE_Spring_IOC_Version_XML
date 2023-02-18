package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import Dao.DaoImpl;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

public class Pres1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		IMetier metier=context.getBean(IMetier.class);
		System.out.println(metier.Calcul());
		
	}

}
