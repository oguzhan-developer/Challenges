package PatikaStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    static TreeSet<Brand> brands;
    static ArrayList<String> categories;
    static ArrayList<Product> products;

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        initBrands();
        initCategories();
        initProducts();
        login();

    }


    static void login(){
        int index=1;
        while(index == 1)
        {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Markaları Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Seçim Yapın: ");
            int option = input.nextInt();
            int selectedCategory;
            switch(option){
                case 0:index=0;break;
                case 1:index=1;selectedCategory=1;printProducts(selectedCategory);break;
                case 2:index=1;selectedCategory=2;printProducts(selectedCategory);break;
                case 3:index=1;printBrands();break;
                default:
                    System.out.println("Tekrar Tuşlama Yapınız");break;
            }
            System.out.println();

        }
    }

    static void printProducts(int selectedCategory){
        System.out.println("-----------------------------------------------------------------------------");
        if(selectedCategory == 1) //Notebook Selected
            System.out.println("ID\tÜrün Adı\t\tFiyat\tMarka\tDepolama\tEkran\tRam");
        if(selectedCategory == 2) //Mobile Selected
            System.out.println("ID\tÜrün Adı\t\tFiyat\tMarka\tDepolama\tEkran\tKamera\t\tPil\t\tRam\t\tRenk");
        System.out.println("-----------------------------------------------------------------------------");
        for(Product p: products)
        {
            switch (selectedCategory) {
                case 1:
                    if (p.getCategory() == "Notebook") {
                        System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice()
                                + "\t" + p.getBrand() + "\t" + p.getStorage() + "\t" + p.getScreenSize() + "\t" + p.getRam());

                }
                    break;

                case 2:
                    if(p.getCategory() == "Cep Telefonu"){
                        System.out.println(p.getId()+"\t"+p.getName()+"\t\t"+p.getPrice()
                                + "\t"+p.getBrand()+"\t"+p.getStorage()+"\t\t\t"+p.getScreenSize() +
                                "\t\t"+p.getCamera()+"\t\t"+p.getBattery()+"\t\t"+p.getRam()+"\t\t"+p.getColor());
                    }

            }
        }
    }

    static void printBrands(){
        System.out.println("\nMarkalar\n-----------");
        for(Brand element: brands)
        {
            System.out.println("- " + element.getName());
        }
    }
    static void initCategories(){
        categories = new ArrayList<String>();
        categories.add("Notebook");
        categories.add("Cep Telefonu");
    }

     static void initBrands(){
        brands = new TreeSet<Brand>(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
         System.out.println("Oluştu");
        brands.add(new Brand(0,"Samsung"));
        brands.add(new Brand(1,"Lenovo"));
        brands.add(new Brand(2,"Apple"));
        brands.add(new Brand(3,"Huawei"));
        brands.add(new Brand(4,"Casper"));
        brands.add(new Brand(5,"Asus"));
        brands.add(new Brand(6,"HP"));
        brands.add(new Brand(7,"Xiaomi"));
        brands.add(new Brand(8,"Monster"));

    }
    static void initProducts(){
        products = new ArrayList<Product>();

        products.add(new Product(
            0,7000,"Huawei","HUAWEI Matebook",
                "Notebook","16","512 "
                ,"14.0",null,null,null)
        );
        products.add(new Product(
            1,3699,"Lenovo","LENOVO V14 IGL",
                "Notebook","8","1024"
                ,"14.0",null,null,null)
        );
        products.add(new Product(
            2,8199,"Asus","ASUS Tuf Gaming",
                "Notebook","8","2048"
                ,"15.6",null,null,null)
        );
        products.add(new Product(
                3,3199,"Samsung","SAMSUNG A51",
                "Cep Telefonu","6","128"
                ,"6.5","32","4000","Siyah")
        );
        products.add(new Product(
                4,7379,"Apple","iPhone 11",
                "Cep Telefonu","6","64"
                ,"6.1","32","3046","Mavi")
        );
        products.add(new Product(
                5,4012,"Xiaomi","Redmi 10",
                "Cep Telefonu","12","128"
                ,"6.5","35","4000","Beyaz")
        );

    }
}
