package org.jsphibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jsphibernate.app.entity.Users;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("firsthibernate.cfg.xml");

        try (SessionFactory factory = cfg.buildSessionFactory();
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter username:");
            String userName = sc.next();

            Session session = factory.openSession();
            Users user = session.find(Users.class, userName);

            System.out.println(user);
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
