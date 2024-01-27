package com.hexaware.hotbyte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hotbyte.entity.Customers;
import com.hexaware.hotbyte.entity.DeliveryAddress;


public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		try (Session session = sessionFactory.openSession()) {
			DeliveryAddress deliveryAddress = new DeliveryAddress();
			deliveryAddress.setAddressId(1);
			deliveryAddress.setHouseNo("123");
			deliveryAddress.setArea("Main Street");
			deliveryAddress.setLandmark("Near Park");
			deliveryAddress.setCity("Mumbai");
			deliveryAddress.setPincode(400001);

			
			Customers customer = new Customers();
			customer.setCustId(101);
			customer.setCustName("John Doe");
			customer.setGender("Male");
			customer.setEmail("john.doe@example.com");
			customer.setPhone("1234567890");
			customer.setUsername("john_doe");
			customer.setPassword("password123");
			customer.setAddress(deliveryAddress);

			deliveryAddress.setCustomer(customer);

			Transaction transaction = session.beginTransaction();

			session.persist(customer);

			transaction.commit();
		}
	}
}
