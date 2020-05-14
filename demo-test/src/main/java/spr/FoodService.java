package spr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ author: zhongyuan.shi
 * @ create: 2020-05-14 21:54
 * @ Description:
 **/
@Component(value = "foodService")
public class FoodService {

	@Autowired
	private MoneyService moneyService;

	private String food = "food";

	public String getFood() {
		return food;
	}

	public String getFromMoney() {
		return moneyService.getMoney();
	}

}
