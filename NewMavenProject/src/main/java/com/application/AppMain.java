package com.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.HQL.Bank;

import java.util.List;
import java.util.Scanner;

public class AppMain {
    private static SessionFactory factory;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();

        char choice;
        do {
            System.out.println("Options:");
            System.out.println("1. Show specific product list");
            System.out.println("2. Add new product");
            System.out.println("3. Delete product");
            System.out.println("4. Update product");
            System.out.println("5. Show product bill");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    showSpecificProductList();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    showProductBill();
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        factory.close();
        scanner.close();
    }

    public static void showSpecificProductList() {
        try (Session session = factory.openSession()) {
            String query = "from Product ";
    		Query q = session.createQuery(query);
    		List <Product>list = q.list();
    		
    		for(Product i:list) {
    			System.out.println(i.getP_id()+" "+ i.getCategory()+" "+ i.getpName());
    		}
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addNewProduct() {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            System.out.print("Enter product name: ");
            String pName = scanner.next();
            System.out.print("Enter category: ");
            String category = scanner.next();
            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();
            System.out.print("Enter price: ");
            int price = scanner.nextInt();

            Product newProduct = new Product(pName, category, qty, price);
            session.save(newProduct);
            tx.commit();
            System.out.println("New product added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteProduct() {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            System.out.print("Enter product ID to delete: ");
            int productId = scanner.nextInt();

            Product productToDelete = session.get(Product.class, productId);
            if (productToDelete != null) {
                session.delete(productToDelete);
                tx.commit();
                System.out.println("Product deleted successfully!");
            } else {
                System.out.println("Product not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateProduct() {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            System.out.print("Enter product ID to update: ");
            int productId = scanner.nextInt();

            Product productToUpdate = session.get(Product.class, productId);
            if (productToUpdate != null) {
                System.out.print("Enter new price: ");
                int newPrice = scanner.nextInt();
                productToUpdate.setPrice(newPrice);
                session.update(productToUpdate);
                tx.commit();
                System.out.println("Product updated successfully!");
            } else {
                System.out.println("Product not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showProductBill() {
        // Implement logic to show product bill
        System.out.println("Showing product bill...");
    }
}
