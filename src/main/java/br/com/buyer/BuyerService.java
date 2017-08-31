package br.com.buyer;

/**
 * @author Felipe Adorno - felipeadsc@gmail.com
 */
public interface BuyerService {

    Buyer save(Buyer buyer);

    Buyer get(Integer id);
}
