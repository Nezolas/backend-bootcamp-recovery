import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. Cep Telefonu İşlemleri");
            System.out.println("2. Notebook İşlemleri");
            //System.out.println("1. Ürün Ekle");
            System.out.println("3. Ürünleri Listele");
            System.out.println("4. Ürün Sil");
            System.out.println("5. Marka Listele");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("1. Ürün Ekle");
                    System.out.println("4. Ürün Sil");
                    int selection = scanner.nextInt();
                    switch (selection){
                        case  1:
                            System.out.print("Ürün Adı: ");
                            String brandName = scanner.next();
                            System.out.print("Birim Fiyat: ");
                            double unitPrice = scanner.nextDouble();
                            System.out.print("Stok Miktarı: ");
                            int stockAmount = scanner.nextInt();
                            System.out.print("Brand ID: ");
                            int brandID = scanner.nextInt();

                            scanner.nextLine();
                            Brand brand = store.getBrandById(brandID);
                            if (brand != null){
                                int storage, camera, ram;
                                double screenSize, battery;
                             if (selection == 1){
                                    System.out.print("Depolama (GB): ");
                                    storage = scanner.nextInt();
                                    System.out.print("Ekran Boyutu (inç): ");
                                    screenSize = scanner.nextDouble();
                                    System.out.print("Kamera (MP): ");
                                    camera = scanner.nextInt();
                                    System.out.print("Pil Gücü (mAh): ");
                                    battery = scanner.nextDouble();
                                    scanner.nextLine();
                                    Product cepTelefonu = new Product(unitPrice,stockAmount,brandName, brand,storage,screenSize,camera,battery);
                                    store.addProduct(cepTelefonu,selection);
                                }else if(selection == 2)  {
                                    System.out.print("Depolama (GB): ");
                                    storage = scanner.nextInt();

                                    System.out.print("RAM (GB): ");
                                    ram = scanner.nextInt();
                                    System.out.print("Ekran Boyutu (inç): ");
                                    screenSize = scanner.nextDouble();
                                    scanner.nextLine();
                                    Product notebook = new Product(unitPrice,stockAmount,brandName, brand,storage,screenSize,ram);
                                    store.addProduct(notebook,selection);
                                }
                                System.out.println("Product Eklendi");
                            }else {
                                System.out.println("Geçersiz brand ID");
                            }
                            break;
                        case 2:
                            System.out.print("Ürün Adı: ");
                            String brandName = scanner.next();
                            System.out.print("Birim Fiyat: ");
                            double unitPrice = scanner.nextDouble();
                            System.out.print("Stok Miktarı: ");
                            int stockAmount = scanner.nextInt();
                            System.out.print("Brand ID: ");
                            int brandID = scanner.nextInt();

                            scanner.nextLine();
                            Brand brand = store.getBrandById(brandID);
                            if (brand != null){
                                int storage, camera, ram;
                                double screenSize, battery;
                                if (selection == 2){
                                    System.out.print("Depolama (GB): ");
                                    storage = scanner.nextInt();

                                    System.out.print("RAM (GB): ");
                                    ram = scanner.nextInt();
                                    System.out.print("Ekran Boyutu (inç): ");
                                    screenSize = scanner.nextDouble();
                                    scanner.nextLine();
                                    Product notebook = new Product(unitPrice,stockAmount,brandName, brand,storage,screenSize,ram);
                                    store.addProduct(notebook,selection);

                                }
                                System.out.println("Product Eklendi");
                            }else {
                                System.out.println("Geçersiz brand ID");
                            }
                            break;
                    }
                        }

                case 3:
                    store.listProduct();
                    break;
                case 4:
                    System.out.println("Silmek istediğiniz ürünü seçin");
                    int silinecekId = scanner.nextInt();
                    store.deleteProduct(silinecekId);
                    System.out.println("Product Silindi");
                    break;
                case 5:
                    store.listBrand();
                    break;
                case 6:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz Seçim...");
            }
        }
    }


}
