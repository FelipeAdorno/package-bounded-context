package br.com.buyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Felipe Adorno - felipeadsc@gmail.com
 */
@Service
@AllArgsConstructor
class BuyerServiceImpl implements BuyerService {

    private final BuyerRepository buyerRepository;

    @Override
    public Buyer save(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    @Override
    public Buyer get(Integer id) {
        return buyerRepository.findOne(id);
    }
}
