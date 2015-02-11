package javabootcamp.shopcart;

import java.math.BigDecimal;
import java.util.List;
import javabootcamp.shopcart.model.Category;
import javabootcamp.shopcart.model.PaymentType;
import javabootcamp.shopcart.model.Product;
import javabootcamp.shopcart.model.ShopCart;
import javabootcamp.shopcart.model.ShopCartItem;
import javabootcamp.shopcart.repository.CategoryRepository;
import javabootcamp.shopcart.repository.ItemRepository;
import javabootcamp.shopcart.repository.ProductRepository;
import javabootcamp.shopcart.repository.ShopCartRepository;
import javabootcamp.shopcart.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roberta
 */
@SpringBootApplication
@RestController(value = "shop")
public class Application {

    private ShopCart cart;

    private static ConfigurableApplicationContext context;
    private static ProductRepository productRepository;
    private static ShopCartRepository cartRepository;
    private static ItemRepository itemRepository;
    
    private static CategoryRepository categoryRepository;

    @RequestMapping("/ping")
    public String getGreeting() {
        return "Hello World!";
    }

    @RequestMapping("/createCart")
    public String createCart() {
        if (cart == null) {
            cart = new ShopCart();
            return "Cart created succesfully!";
        } else {
            return "Cart already created!";
        }
    }

    @RequestMapping("/addProduct")
    public String addProduct(@RequestParam(value = "idProd", required = true) Long productId,
            @RequestParam(value = "quantity", required = false, defaultValue = "1") Integer quantity) {

        createCart();
        Product product = productRepository.findOne(productId);
        if (product == null) {
            return "The product does not exists!";
        }
        ShopCartItem item = new ShopCartItem(quantity, product, product.getPrice().multiply(new BigDecimal(quantity)), cart);
        if (cart.getCartItems() == null) {
            cart.setCartItems(new java.util.ArrayList<ShopCartItem>());
        }
        cart.getCartItems().add(item);
        return "Product: " + product.getName() + " added succesfully!";
    }

    @RequestMapping("/removeProduct")
    public String removeProduct(@RequestParam(value = "idProd", required = true) Long productId) {

        int index = -1;

        for (int i = 0; i < cart.getCartItems().size(); i++) {
            if (cart.getCartItems().get(i).getProduct().getId().equals(productId)) {
                index = i;
            }

        }
        if (index > -1) {
            cart.getCartItems().remove(index);
        }
        return "Item deleted succesfully!";

    }

    @RequestMapping("/listItems")
    public String listCartItems() {
        if (cart != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Product\t\t\tQuantity\t\t\tSubTotal\n");
            for (ShopCartItem item : cart.getCartItems()) {
                sb.append(item.getProduct().getName())
                        .append("\t\t\t").append(item.getQuantity())
                        .append("\t\t\t")
                        .append(item.getSubTotal().toPlainString())
                        .append("\n");
            }
            return sb.toString();
        }
        return null;
    }

    @RequestMapping("/confirm")
    public String confirm(@RequestParam(value = "paymentType", required = false, defaultValue = "CASH") String paymentType) {
        PaymentType payment = PaymentType.valueOf(paymentType);
        if (cart != null) {
            if (cart.getId() != null) {
                return "You have yust checked out!";
            }
            cart.setPaymentType(payment);
            cartRepository.save(cart);
            itemRepository.save(cart.getCartItems());

            return "Your invoce number: " + cart.getId() + " was generated for a total of: $" + cart.getTotal().toPlainString();

        }
        return "You haven't a shop cart yet...";
    }

    @RequestMapping(value = "/findProductsByCategory", produces = "application/json")
    public List<Product> findByCategory(@RequestParam(value = "categoryId", required = true) Long category) {
        Category findOne = categoryRepository.findOne(category);
        return productRepository.findByCategory(findOne);
    }

    @RequestMapping(value = "/findProductsByName", produces = "application/json")
    public List<Product> findByName(@RequestParam(value = "name") String name) {
        return productRepository.findByName(name);

    }

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);

        context = SpringApplication.run(Application.class);
        productRepository = context.getBean(ProductRepository.class);
        cartRepository = context.getBean(ShopCartRepository.class);
        itemRepository = context.getBean(ItemRepository.class);
        categoryRepository = context.getBean(CategoryRepository.class);
        UserRepository userRepo = context.getBean(UserRepository.class);

        Category electro = new Category();
        electro.setName("Electronic");
        Category shoes = new Category();
        shoes.setName("Shoes");
        categoryRepository.save(electro);
        categoryRepository.save(shoes);
        
//        userRepo.save(new ShopUser("admin", "admin"));
//        userRepo.save(new ShopUser("user", "user"));
        productRepository.save(new Product("Fridge", "A beautifull fridge", BigDecimal.TEN,electro));
        productRepository.save(new Product("Nike Air", "A beautifull shoes", BigDecimal.TEN,shoes));

        Iterable<Product> products = productRepository.findAll();
        System.out.println("Products found with findAll():");
        System.out.println("-------------------------------");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        Product product = productRepository.findOne(1L);
        System.out.println("Product found with findOne(1L):");
        System.out.println("--------------------------------");
        System.out.println(product);
        System.out.println();

        List<Product> finds = productRepository.findByName("Notebook");
        System.out.println("Product found with findByName('Notebook'):");
        System.out.println("--------------------------------------------");
        for (Product prod : finds) {
            System.out.println(prod);
        }

        //context.close();
    }

}
