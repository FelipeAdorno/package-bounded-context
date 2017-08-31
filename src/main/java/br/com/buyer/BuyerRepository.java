package br.com.buyer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Felipe Adorno - felipeadsc@gmail.com
 */
@Repository
interface BuyerRepository extends JpaRepository<Buyer, Integer> {
}
