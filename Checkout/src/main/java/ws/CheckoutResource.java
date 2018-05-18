package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CheckoutResource {

    @Autowired
    private CheckoutReposity checkoutReposity;

    //TODO: 2 implement getCheckouts and getCheckout [5 marks]
    //TODO: 3 implement checkout (create) [5 marks]

    @GetMapping("/checkouts")
    public List<Checkout> getAllCheckouts() {
        return checkoutReposity.findAll();
    }

    @GetMapping("/checkouts/{id}")
    public Checkout getCheckout(@PathVariable int id) {
        Optional<Checkout> customer = checkoutReposity.findById(id);
        return customer.get();
    }

    @PostMapping("/checkouts")
    public void createCheckout (@RequestBody Checkout checkout) {
        Checkout savedCheckout = checkoutReposity.save(checkout);
    }
}
