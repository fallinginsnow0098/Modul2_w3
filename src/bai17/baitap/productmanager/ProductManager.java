package bai17.baitap.productmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();


    public List<Product> readFile(String path){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public void writeToFile(String path){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Product creatProduct(){
        Product product = null;
        System.out.println("Nhập tên");
        String name = "Huấn";
        System.out.println("Nhập hãng");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập loại hàng hóa");
        String type = scanner.nextLine();
        product = new Product(name, brand, price, type);
        products.add(product);
        return product;
    }
    public void displayAll(){
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
