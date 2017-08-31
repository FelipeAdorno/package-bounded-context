package br.com.buyer.web;

import br.com.buyer.Buyer;
import br.com.buyer.BuyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Felipe Adorno - felipeadsc@gmail.com
 */
@RestController
@AllArgsConstructor
@RequestMapping("/buyers")
class BuyerRestService {

    private final BuyerService buyerService;

    @PostMapping
    public Buyer save(Buyer buyer) {
        return buyerService.save(buyer);
    }

    @GetMapping("/{id}")
    public Buyer get(@PathVariable Integer id) {
        return buyerService.get(id);
    }
}
