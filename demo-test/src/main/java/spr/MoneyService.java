package spr;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ author: zhongyuan.shi
 * @ create: 2020-05-14 21:54
 * @ Description:
 **/
@Component(value = "moneyService")
public class MoneyService {

	@Resource
	private FoodService foodService;

	private String money = "money";

	public String getMoney() {
		return money;
	}

	public String getFromFood() {
		return foodService.getFood() ;
	}

}
