package bai17.baitap.productmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductManager productManager = new ProductManager();
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị tất cả sp");
            System.out.println("3. Ghi ra file (nhập đường dẫn)");
            System.out.println("4. Đọc file (nhập đường dẫn)");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("Chọn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    productManager.creatProduct();
                    break;
                case 2:
                    productManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập đường dẫn file");
                    String pathWrite = scanner.nextLine();
                    productManager.writeToFile(pathWrite);
                    System.out.println("Ghi file thành công!");
                    break;
                case 4:
                    System.out.println("Nhập đường dẫn file");
                    String pathRead = scanner.nextLine();
                    List<Product> productData = productManager.readFile(pathRead);
                    productData.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Nhập đường dẫn");
                    String path = scanner.nextLine();
                    System.out.println("Nhập id");
                    int id = scanner.nextInt();
                    Product product = null;
                    for (Product p : productManager.readFile(path)) {
                        if (p.getCode() == id){
                            product = p;
                        }
                    }
                    System.out.println(product);

            }
        } while (choice != 0);

    }
}
